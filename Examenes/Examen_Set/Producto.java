package Examen_Set;

public class Producto implements Comparable<Producto>{

	//ATRIBUTOS
	private String nombre; 
	private Integer cantidad;
	
	//CONSTRUCTOR vacio
	public Producto() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Producto(String nombre, Integer cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	//GETTER Y SETTER
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	//To String
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}

	//CompareTo
	@Override
	public int compareTo(Producto producto) {
		return this.getNombre().compareToIgnoreCase(producto.getNombre());
	}

	//generate hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	//generate equals
	@Override 
	public boolean equals(Object obj) { //lo genero con todo pero le quito lo de la cantidad porque el enunciado quiere que me fije en el nombre solo
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		//if (cantidad == null) {
			//if (other.cantidad != null)
				//return false;
		//} else if (!cantidad.equals(other.cantidad))
			//return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	//public int hashCode() {
		//return this.getNombre().hashCode();
	//}
	
	//public boolean equals(Producto producto) {
		//if(this.getNombre().equalsIgnoreCase(producto.getNombre())) {
			//return true;
		//}else {
			//return false;
		//}
	//}
	
}
