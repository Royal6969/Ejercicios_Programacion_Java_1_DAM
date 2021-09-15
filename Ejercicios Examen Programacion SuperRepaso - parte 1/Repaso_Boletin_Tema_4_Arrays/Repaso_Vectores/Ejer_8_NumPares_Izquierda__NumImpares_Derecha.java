package Repaso_Vectores;

public class Ejer_8_NumPares_Izquierda__NumImpares_Derecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[20];
		int[] aux = new int[20];
		int par = 0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int) (Math.random()*101); 
			System.out.print(nums[i]+ " ");
		}
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2 == 0) {
				aux[par] = nums[i];
				par++;
			}
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2 != 0) {
				aux[par] = nums[i];
				par++;
			}
		}
		System.out.println();
		
		for(int i=0; i<aux.length; i++) {
			System.out.print(aux[i]+" ");
		}
		System.out.println();
	}

}
