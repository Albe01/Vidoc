package it.vidoc.prove;

public class Bclass extends Aclass{
	public Bclass(String nome, String cognome, int oreLavorativeMensili, int retribuzioneOraria) {
		super(nome, cognome, oreLavorativeMensili, retribuzioneOraria);
	}

	private int bonus;
	
	public int stipendio(){
		super.setOreLavorativeMensili(10);
		super.setRetribuzioneOraria(2);
		System.out.println(super.stipendio() * bonus);
		
		return 0;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
