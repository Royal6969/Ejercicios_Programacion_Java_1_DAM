package Arrays_de_1_Dimension;

public class Ejer_3_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Define tres Arrays de 20 n�meros enteros cada uno, con nombres n�mero, cuadrado y cubo.
		//Primero carga el Array n�mero con valores aleatorios entre 0 y 100.
		//A continuaci�n, en el Array cuadrado se deben almacenar los cuadrados de los valores que hay en el Array n�mero.
		//Y en el Array cubo se deben almacenar los cubos de los valores que hay en n�mero.
		//A continuaci�n, muestra el contenido de los tres Arrays dispuesto en tres columnas.
		
		  int[] nums = new int[20];
	      int[] cuadrado = new int[20];
	      int[] cubo = new int[20];
	      
	      System.out.println("N�mero Cuadrado Cubo");
	      
	      for(int i=0; i<nums.length; i++) { 
	        nums[i] = (int)(Math.random()*101); //parentesis smp y el truco del 101 para no poner +1
	        cuadrado[i] = nums[i]*nums[i];
	        cubo[i] = nums[i]*nums[i]*nums[i];
	        System.out.print(nums[i]+ "    "+cuadrado[i]+ "     "+cubo[i]);
	        System.out.println();
	      }
	      
	      
	
	}

}
