package Ejer_10_JuanCarlos;

public class Multilinea {
	private Recta[] conjrecta=new Recta[10];
	private int nlados=0;
	
	
	public Multilinea(Recta[] conjrecta, int nlados) {
		super();
		this.conjrecta = conjrecta;
		this.nlados = nlados;
		
	}


	public Multilinea() {
		super();
	}

	
	public Recta[] getConjrecta() {
		return conjrecta;
	}
	public void setConjrecta(Recta[] conjrecta) {
		this.conjrecta = conjrecta;
	}

	public int getNlados() {
		return nlados;
	}
	public void setNlados(int nlados) {
		this.nlados = nlados;
	}
	
	public void insertalado(Recta recta) {
		
		if(this.nlados==0 || recta.getP1()==this.conjrecta[this.nlados].getP2()) {
		this.conjrecta[nlados]=recta;
		this.nlados++;
		}
		else {
			System.out.println("Error");
		}
	}
	public void imprime() {
		for(int i=0;i<this.nlados;i++) {
			this.conjrecta[i].imprime();
		}
	}
}
