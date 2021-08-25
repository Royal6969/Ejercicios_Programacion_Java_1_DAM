package Ejer_7_Agroalimentaria;

public class Productos {
	
	private Fecha caducidad, envasado;
	private int nlote;
	private String pais;
	
	
	public Productos(Fecha caducidad, Fecha envasado, int nlote, String pais) {
		super();
		this.caducidad = caducidad;
		this.envasado = envasado;
		this.nlote = nlote;
		this.pais = pais;
	}


	public Fecha getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(Fecha caducidad) {
		this.caducidad = caducidad;
	}

	public Fecha getEnvasado() {
		return envasado;
	}
	public void setEnvasado(Fecha envasado) {
		this.envasado = envasado;
	}

	public int getNlote() {
		return nlote;
	}
	public void setNlote(int nlote) {
		this.nlote = nlote;
	}

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return " caducidad=" + caducidad + ", envasado=" + envasado + ", nlote=" + nlote + ", pais=" + pais
				+ " ";
	}
	

}
