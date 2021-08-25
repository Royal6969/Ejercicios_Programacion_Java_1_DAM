package Ejer_13_SublistasPositivosNegativos;

/*
 * 13. Dividir una lista de elementos de tipo Entero en dos sublistas, 
 * en una los positivos y en la otra los negativos.
 */

	public class Numeros {

		private int num;

		public Numeros(int num) {
			super();
			this.num = num;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
		
		public String toString() {
			return num+" ";
		}
		
}
