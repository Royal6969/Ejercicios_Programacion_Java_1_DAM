package Ejer_7_Agroalimentaria;

public class Aire extends Congelados{
	
	private int dcarbono,vagua,oxigeno,nitrogeno;

	public Aire(Fecha caducidad, Fecha envasado, int nlote, String pais, int temperatura, int dcarbono, int vagua,
			int oxigeno, int nitrogeno) {
		super(caducidad, envasado, nlote, pais, temperatura);
		this.dcarbono = dcarbono;
		this.vagua = vagua;
		this.oxigeno = oxigeno;
		this.nitrogeno = nitrogeno;
	}

	
	public int getDcarbono() {
		return dcarbono;
	}
	public void setDcarbono(int dcarbono) {
		this.dcarbono = dcarbono;
	}

	public int getVagua() {
		return vagua;
	}
	public void setVagua(int vagua) {
		this.vagua = vagua;
	}

	public int getOxigeno() {
		return oxigeno;
	}
	public void setOxigeno(int oxigeno) {
		this.oxigeno = oxigeno;
	}

	public int getNitrogeno() {
		return nitrogeno;
	}
	public void setNitrogeno(int nitrogeno) {
		this.nitrogeno = nitrogeno;
	}


	@Override
	public String toString() {
		return "Producto congelado con aire dcarbono=" + dcarbono + ", vagua=" + vagua + ", oxigeno=" + oxigeno + ", nitrogeno=" + nitrogeno
				+ " "+super.toString();
	}
	

}
