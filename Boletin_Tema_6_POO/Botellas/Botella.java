package Botellas;

public class Botella {

	private String material;
	private String color;
	private int capacidad;
	private int cantidad;
	
	public Botella(String material, String color, int capacidad, int cantidad) {
		super();
		this.material = material;
		this.color = color;
		this.capacidad = capacidad;
		this.cantidad = cantidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Botella [material=" + material + ", color=" + color + ", capacidad=" + capacidad + ", cantidad="
				+ cantidad + "]";
	}

	public void llenar_botella(int litros) {
		
		if((cantidad+litros)>capacidad) {
			System.out.println("Ha rebosado");
			this.cantidad = capacidad;
		
		}else if((cantidad+litros)==capacidad) {
			System.out.println("Se ha llenado justo");
			this.cantidad = capacidad;
		
		}else {
			this.cantidad = cantidad+litros;
			System.out.println("Tiene "+cantidad);
		}
	}
	
	public void vaciar_botella(int litros) {
		
		if((cantidad-litros)<0) {
			System.out.println("Ya no se puede vaciar tanto, se quedará a 0");
			this.cantidad = 0;
		
		}else if((cantidad-litros)==0) {
			System.out.println("Ya no hay nada, se queda en 0");
			this.cantidad = 0;
			
		}else {
			this.cantidad = cantidad-litros;
			System.out.println("Le quedan "+cantidad);
		}
	}
	
	public boolean botella_vacia() {
		
		if(cantidad==0) {
			return true;
			
		}else {
			return false;
		}
	}
	
	public boolean botella_llena() {
		
		if(cantidad==capacidad) {
			return true;
		
		}else {
			return false;
		}
	}
	
	public void liquido_en_botella() {
		
		System.out.println("Tiene "+cantidad);
	}
	
}

	
