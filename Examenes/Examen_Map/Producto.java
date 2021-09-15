package Examen_Map;

public class Producto implements Comparable<Producto>{

	//ATRIBUTOS
	private String nomProducto; 
	private int cantProducto;
	
	//CONSTRUCTOR vacio
	public Producto() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Producto(String nomProducto, int cantProducto) {
		super();
		this.nomProducto = nomProducto;
		this.cantProducto = cantProducto;
	}

	//GETTER Y SETTER
	public String getNomProducto() {
		return nomProducto;
	}

	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}

	public int getCantProducto() {
		return cantProducto;
	}

	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}

	//To String
	@Override
	public String toString() {
		return "Producto [nomProducto=" + nomProducto + ", cantProducto=" + cantProducto + "]";
	}

	//CompareTo
	@Override
	public int compareTo(Producto producto) {
		return this.getNomProducto().compareToIgnoreCase(producto.getNomProducto());
	}

	//HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantProducto;
		result = prime * result + ((nomProducto == null) ? 0 : nomProducto.hashCode());
		return result;
	}

	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (cantProducto != other.cantProducto)
			return false;
		if (nomProducto == null) {
			if (other.nomProducto != null)
				return false;
		} else if (!nomProducto.equals(other.nomProducto))
			return false;
		return true;
	}
	
	
}
