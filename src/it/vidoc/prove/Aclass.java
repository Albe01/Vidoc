package it.vidoc.prove;

public class Aclass {
	public Aclass(String nome, String cognome, int oreLavorativeMensili, int retribuzioneOraria) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.oreLavorativeMensili = oreLavorativeMensili;
		this.retribuzioneOraria = retribuzioneOraria;
	}

	private String nome;
	private String cognome;
	private int oreLavorativeMensili;
	private int retribuzioneOraria;

	public int getOreLavorativeMensili() {
		return oreLavorativeMensili;
	}

	public int getRetribuzioneOraria() {
		return retribuzioneOraria;
	}

	public int stipendio() {
		return oreLavorativeMensili * retribuzioneOraria;
	}

	public void setOreLavorativeMensili(int oreLavorativeMensili) {
		this.oreLavorativeMensili = oreLavorativeMensili;
	}

	public void setRetribuzioneOraria(int retribuzioneOraria) {
		this.retribuzioneOraria = retribuzioneOraria;
	}

}
