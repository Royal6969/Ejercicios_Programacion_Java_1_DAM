package Ejer_7_Agroalimentaria;

public class Refrigerados extends Productos{
	
	private int codigo,temperatura;

	public Refrigerados(Fecha caducidad, Fecha envasado, int nlote, String pais, int codigo, int temperatura) {
		super(caducidad, envasado, nlote, pais);
		this.codigo = codigo;
		this.temperatura = temperatura;
	}

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}


	@Override
	public String toString() {
		return "Producto refrigerado codigo=" + codigo + ", temperatura=" + temperatura + " "+super.toString();
	}
	

}
