package it.vidoc.utils;

import java.util.List;

import it.vidoc.mybatis.javamodel.User;
import it.vidoc.mybatis.javamodel.Userrole;

public class DatiSessione {
	private User user = null;
	private List<Userrole> lstUserrole = null;
	private List<Long> AMLstKanagra = null;
	private String AMnome = null;
	private String AMindirizzo = null;
	private String AMsiglaProvincia = null;
	private String AMcodiceComune = null;
	private Long AMkanagraVis = null;
	private int AMnumPagLis = 0;
	
	private String codiceBancaDati;
	private String codiceRichiesta;
	private String codiceRisposta;
	private String onlDiff;
	private Double prezzo;
	private String preventivoAccettato;
	private int rigaListino;
	private Integer rigaAccount;
	private Integer rigaElencoDocumenti;
	private Integer ListinoUtentiAttivo;
	private Integer ListinoInternoAttivo;	

	public String getAMnome() {
		return AMnome;
	}

	public void setAMnome(String aMnome) {
		AMnome = aMnome;
	}

	public String getAMindirizzo() {
		return AMindirizzo;
	}

	public void setAMindirizzo(String aMindirizzo) {
		AMindirizzo = aMindirizzo;
	}

	public String getAMsiglaProvincia() {
		return AMsiglaProvincia;
	}

	public void setAMsiglaProvincia(String aMsiglaProvincia) {
		AMsiglaProvincia = aMsiglaProvincia;
	}

	public String getAMcodiceComune() {
		return AMcodiceComune;
	}

	public void setAMcodiceComune(String aMcodiceComune) {
		AMcodiceComune = aMcodiceComune;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Userrole> getLstUserrole() {
		return lstUserrole;
	}

	public void setLstUserrole(List<Userrole> lstUserrole) {
		this.lstUserrole = lstUserrole;
	}

	public List<Long> getAMLstKanagra() {
		return AMLstKanagra;
	}

	public void setAMLstKanagra(List<Long> aMLstKanagra) {
		AMLstKanagra = aMLstKanagra;
	}

	public Long getAMkanagraVis() {
		return AMkanagraVis;
	}

	public void setAMkanagraVis(Long aMkanagraVis) {
		AMkanagraVis = aMkanagraVis;
	}

	public int getAMnumPagLis() {
		return AMnumPagLis;
	}

	public void setAMnumPagLis(int aMnumPagLis) {
		AMnumPagLis = aMnumPagLis;
	}

	public String getCodiceBancaDati() {
		return codiceBancaDati;
	}

	public void setCodiceBancaDati(String codiceBancaDati) {
		this.codiceBancaDati = codiceBancaDati;
	}

	public String getCodiceRichiesta() {
		return codiceRichiesta;
	}

	public void setCodiceRichiesta(String codiceRichiesta) {
		this.codiceRichiesta = codiceRichiesta;
	}

	public String getCodiceRisposta() {
		return codiceRisposta;
	}

	public void setCodiceRisposta(String codiceRisposta) {
		this.codiceRisposta = codiceRisposta;
	}

	public String getOnlDiff() {
		return onlDiff;
	}

	public void setOnlDiff(String onlDiff) {
		this.onlDiff = onlDiff;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getPreventivoAccettato() {
		return preventivoAccettato;
	}

	public void setPreventivoAccettato(String preventivoAccettato) {
		this.preventivoAccettato = preventivoAccettato;
	}

	public int getRigaListino() {
		return rigaListino;
	}

	public void setRigaListino(int rigaListino) {
		this.rigaListino = rigaListino;
	}

	public Integer getRigaElencoDocumenti() {
		return rigaElencoDocumenti;
	}

	public void setRigaElencoDocumenti(Integer rigaElencoDocumenti) {
		this.rigaElencoDocumenti = rigaElencoDocumenti;
	}

	public Integer getRigaAccount() {
		return rigaAccount;
	}

	public void setRigaAccount(Integer rigaAccount) {
		this.rigaAccount = rigaAccount;
	}

	public Integer getListinoUtentiAttivo() {
		return ListinoUtentiAttivo;
	}

	public void setListinoUtentiAttivo(Integer listinoUtentiAttivo) {
		ListinoUtentiAttivo = listinoUtentiAttivo;
	}

	public Integer getListinoInternoAttivo() {
		return ListinoInternoAttivo;
	}

	public void setListinoInternoAttivo(Integer listinoInternoAttivo) {
		ListinoInternoAttivo = listinoInternoAttivo;
	}

}
