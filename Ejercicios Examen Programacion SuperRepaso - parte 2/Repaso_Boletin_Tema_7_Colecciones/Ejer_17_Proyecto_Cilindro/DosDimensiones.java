package Ejer_17_Proyecto_Cilindro;

public interface DosDimensiones {

	//ATRIBUTOS //aquí definimos el estándar máximo de pixeles
	double maxX = 1024; //aunque en la foto esquema ponga int en vs son doubles!!
	double maxY = 1024;
	
	//MÉTODOS //un par de getters de los puntos x e y
	public double getX(); 
	public double getY();
}
