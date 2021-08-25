package Cubos;

public class Cubo {
		
		//atributos //
		
		private int capacidad; //capacidad máxima de Litros en el cubo
		private int contenido; //contenido de Litros actuales en el cubo
		private String color, material;
		private boolean asa;
		
		//Constructor //
		
		public Cubo(int capacidad, int contenido, String color, String material, boolean asa) {
			super();
			this.capacidad = capacidad;
			this.contenido = contenido;
			this.color = color;
			this.material = material;
			this.asa = asa;
		}

		public Cubo(int capacidad, int contenido) {
			super();
			this.capacidad = capacidad;
			this.contenido = contenido;
		}

		// Getter y Setter //
		
		public int getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}

		public int getContenido() {
			return contenido;
		}

		public void setContenido(int contenido) {
			this.contenido = contenido;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public boolean isAsa() {
			return asa;
		}

		public void setAsa(boolean asa) {
			this.asa = asa;
		}

		// TO String //
		
		@Override
		public String toString() {
			
			//creando mis cubos en la otra clase de Prueba...
			if(this.asa) {
	            return "Cubo [capacidad=" + capacidad + ", color=" + color + ", material=" + material + ", tiene asa, contenido=" + contenido + "]";
	        }else {
	            return "Cubo [capacidad=" + capacidad + ", color=" + color + ", material=" + material + ", no tiene asa, contenido =" + contenido + "]";
	        }
		}// esto es para que acabe diciendo si tiene o no tiene un asa
		
		// ACCIONES //
		
		public void pasarAgua(int cantidad, Cubo cubito) { 
			
			//Contenido = Litros actuales en mi cubo
			//Cantidad  = Litros que quiero mover a otro cubo
			
			if(this.getContenido()<cantidad) { 
				
	            System.out.println("El cubo origen no tiene suficiente cantidad de agua");
	      
			}else {
				
	            this.setContenido(this.contenido-cantidad);

	            if((cubito.getContenido()+cantidad) < cubito.getCapacidad()) {
	            	
	                cubito.setContenido(cubito.getContenido()+cantidad);
	                
	            }else {
	            	
	                System.out.println("No es posible pasar esa cantidad a ese cubo");
	                this.setContenido(this.contenido+cantidad);
	            }
	        }	
		}
}
