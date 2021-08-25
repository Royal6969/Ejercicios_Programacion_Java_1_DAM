package Cubos_2;

public class Cubo2 {

		//ATRIBUTOS//
		private int capacidad;
		private String color;
		private String material;
		private boolean asa;
		private int cantidad;
		
		//se crea esta variable estatica
		private static int sumarCantidades = 0;
		//esta frase mágica se va poniendo debajo de las sentencias que tengan algún This.cantidad o set.cantidad, en los getters no, y si hay un menos se cambia el + por -
		
		//CONSTRUCTOR//
		public Cubo2(int capacidad,int cantidad) {
			super();
			this.capacidad = capacidad;
			this.cantidad = cantidad;
			Cubo2.sumarCantidades+=cantidad;
		}
		
		//CONSTRUCTOR 2
		public Cubo2(int capacidad, String color, String material, boolean asa, int cantidad) {
			super();
			this.capacidad = capacidad;
			this.color = color;
			this.material = material;
			this.asa = asa;
			this.cantidad = cantidad;
			Cubo2.sumarCantidades+=cantidad;
		}
		
		//GETTER y SETTER//
		public int getCapacidad() {
			return this.capacidad;
		}
		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}
		
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public String getMaterial() {
			return this.material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		
		public boolean isAsa() {
			return this.asa;
		}
		public void setAsa(boolean asa) {
			this.asa = asa;
		}
		
		public int getCantidad() {
			return this.cantidad; //aqui noo, los getters noo
		}
		
		public void setCantidad(int cantidad) {
			Cubo2.sumarCantidades-=cantidad;
			this.cantidad = cantidad;
			Cubo2.sumarCantidades+=cantidad;
		}
		
		public static int getSumarCantidades() {
			return sumarCantidades;
		}

		public static void setSumarCantidades(int sumarCantidades) {
			Cubo2.sumarCantidades = sumarCantidades;
		}
		
		//TO String//
		public String toString() {
			if(this.asa) {
				return "La capacidad es " + capacidad + ", el color es " + color + ", el material es " + material + ", tiene asa y la cantidad es " + cantidad;
			}else {
				return "La capacidad es " + capacidad + ", el color es " + color + ", el material es " + material + ", no tiene asa y la cantidad es " + cantidad;
				
			}
		}
		
		//METODOS// //esto lo hizo EVA
		public void pasarAgua2(Cubo2 cubo, int cantidad) {
			
			if(this.getCantidad()<cantidad) {
				System.out.println("No hay tanta agua en el cubo origen");
			
			}else {
				this.setCantidad(this.cantidad-cantidad);
				Cubo2.sumarCantidades-=cantidad;
			
				if((cubo.getCantidad()+cantidad)<cubo.getCapacidad()) {
					cubo.setCantidad(cubo.getCantidad()+cantidad);
					Cubo2.sumarCantidades+=cantidad;
				
				}else {
					System.out.println("No se puede pasar tanta cantidad");
					this.setCantidad(this.cantidad+cantidad);
					Cubo2.sumarCantidades+=cantidad;
				}
			}
		}

		
}
