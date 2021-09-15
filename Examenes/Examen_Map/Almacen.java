package Examen_Map;

public class Almacen {

	//ATRIBUTOS
	private int numAlmacen; 
	private String nomAlmacen;
	
	//CONSTRUCTOR vacio
	public Almacen() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Almacen(int numAlmacen, String nomAlmacen) {
		super();
		this.numAlmacen = numAlmacen;
		this.nomAlmacen = nomAlmacen;
	}

	//GETTER Y SETTER
	public int getNumAlmacen() {
		return numAlmacen;
	}

	public void setNumAlmacen(int numAlmacen) {
		this.numAlmacen = numAlmacen;
	}

	public String getNomAlmacen() {
		return nomAlmacen;
	}

	public void setNomAlmacen(String nomAlmacen) {
		this.nomAlmacen = nomAlmacen;
	}

	//To String
	@Override
	public String toString() {
		return "Almacen [numAlmacen=" + numAlmacen + ", nomAlmacen=" + nomAlmacen + "]";
	}
	
	
}
