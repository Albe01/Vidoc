package it.vidoc.contabilizzazione;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;

import it.vidoc.mybatis.javamodel.Listino;
import it.vidoc.mybatis.sqlquery.SqlAccount;
import it.vidoc.mybatis.sqlquery.SqlListino;
import it.vidoc.utils.DatiSessione;

public class Contabilizza {
	private Session session = null;
	private DatiSessione datiSessione = null;

	private Double prezzoOperazione;
	private Double dirittiOperazione;
	private SimpleDateFormat sdfData = new SimpleDateFormat("yyyyMMdd");
	private SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");

	public Contabilizza() {
		session = Sessions.getCurrent();
		datiSessione = (DatiSessione) session.getAttribute("datisessione");
	}

	public Double calcolaPrezzoUtente() {
		// eventuali sconti
		return calcolaPrezzo("UTENTE");
	}

	public Double calcolaPrezzoAzienda() {
		return calcolaPrezzo("AZIENDA");
	}

	private Double calcolaPrezzo(String codiceListino) {
		Double prezzo = 0.0;
		Listino listino = new Listino();
		listino.setNumerolistino(1);
		listino.setCodicelistino(codiceListino);
		listino.setCodicebancadati(datiSessione.getCodiceBancaDati());
		listino.setCodicerichiesta(datiSessione.getCodiceRichiesta());
		listino.setCodicerisposta(datiSessione.getCodiceRisposta());
		listino.setOnldiff(datiSessione.getOnlDiff());
		List<Listino> lstListino = new SqlListino().selectByExample(listino, null);
		if (lstListino.size() > 0) {
			prezzo = lstListino.get(0).getPrezzo() + lstListino.get(0).getDirittisegreteria();
			datiSessione.setRigaListino(lstListino.get(0).getProgrriga());
			session.setAttribute("datisessione", datiSessione);

			setPrezzoOperazione(lstListino.get(0).getPrezzo());
			setDirittiOperazione(lstListino.get(0).getDirittisegreteria());
		}
		return prezzo;
	}

	public void registraAccountUtente() {
		if (calcolaPrezzoUtente() > 0) {
			registraAccount();
		}
	}

	public void registraAccountAzienda() {
		if (calcolaPrezzoAzienda() > 0) {
			registraAccount();	
		}
	}
	
	private void registraAccount() {
		it.vidoc.mybatis.javamodel.Account account = new it.vidoc.mybatis.javamodel.Account();
		account.setProgrrigalistino(datiSessione.getRigaListino());
		account.setUsername(datiSessione.getUser().getUsername());
		account.setPrezzo(getPrezzoOperazione());
		account.setDirittisegreteria(getDirittiOperazione());
		account.setData(sdfData.format(new Date()));
		account.setTime(sdfTime.format(new Date()));
		new SqlAccount().insert(account);
	}

	private Double getPrezzoOperazione() {
		return prezzoOperazione;
	}

	private void setPrezzoOperazione(Double prezzoOperazione) {
		this.prezzoOperazione = prezzoOperazione;
	}

	private Double getDirittiOperazione() {
		return dirittiOperazione;
	}

	private void setDirittiOperazione(Double dirittiOperazione) {
		this.dirittiOperazione = dirittiOperazione;
	}

}
