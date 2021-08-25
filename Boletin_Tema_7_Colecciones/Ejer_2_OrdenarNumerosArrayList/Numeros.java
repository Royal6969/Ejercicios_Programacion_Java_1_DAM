package Ejer_2_OrdenarNumerosArrayList;

public class Numeros implements Comparable<Numeros>{ //esto sirve para crearme un tipo CompareTo mío propio

	//ATRIBUTOS
		private int num;

		//CONSTRUCTOR
		public Numeros(int num) {
			super();
			this.num = num;
		}

		//GETTER Y SETTER
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		//TO String
		@Override
		public String toString() {
			return "Numeros [num=" + num + "]";
		}
		
		//METODOS
		public int compareTo(Numeros num) {
			
			return (this.getNum()-num.getNum());
			//el compareTo devuelve un int 0, <0, >0
		}
		
}
