package Ejer_10_JuanCarlos;

public class Recta {
	private Punto p1;
	private Punto p2;
	
	
	public Recta(Punto p1, Punto p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}


	public Recta() {
		super();
	}


	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	public void imprime() {
		System.out.print(this.p1+" ");
		System.out.println(this.p2);
	}
}
