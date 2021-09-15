package pack_Figura;

public abstract class Figura implements iColor, iFigura{ //implementa tmb iFigura lo dijo Eva y se dió por sentado

	//ATRIBUTOS
	private String color;
	private static final double pi = Math.PI;
	
	private static int nFigura = 0; //esto lo creo dps porque me doy cuenta dps
	
	//CONSTRUCTOR
	public Figura(/*String color*/) {
		super();
		this.color = /*color*/"verde";
		this.nFigura++; //okey y esto tmb dps cuando me doy cuenta y creo el atributo estatico que faltaba
	}

	//GETTER Y SETTER
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static double getPi() {
		return pi;
	}
	
	public static int getnFigura() {
		return nFigura;
	}

	public static void setnFigura(int nFigura) {
		Figura.nFigura = nFigura;
	}

/*
	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
*/ //en vez de "toString poner mi metodo de imprimircaracteristicas

	@Override
	public String imprimirCaracteristicas() {
		return "Figura [color=" + color + "]";
	}
	
	//METODOS
	
	public void cambiarColor(String color) {
		
		this.color = color;
	}
}
