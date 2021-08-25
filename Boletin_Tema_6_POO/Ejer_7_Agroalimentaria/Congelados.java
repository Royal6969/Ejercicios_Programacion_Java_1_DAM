package Ejer_7_Agroalimentaria;

public class Congelados extends Productos{
	
private int temperatura;

	
	public Congelados(Fecha caducidad, Fecha envasado, int nlote, String pais, int temperatura) {
		super(caducidad, envasado, nlote, pais);
		this.temperatura = temperatura;
	}


	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}


	@Override
	public String toString() {
		return " temperatura=" + temperatura + " "+super.toString();
	}

}
