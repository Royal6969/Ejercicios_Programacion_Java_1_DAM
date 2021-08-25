package Arrays_de_1_Dimension;

public class Ejer_4_Almacenar10numerosAleatoriosConMaxYmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4. Almacenar 10 números aleatorios en un vector y luego muestra el máximo y el mínimo
		
		int[] nums = new int[10];
		int max = 0;
		int min = 100;
		
		for(int i=0; i<10; i++) {
			nums[i] = (int)(Math.random()*101);
			System.out.print(nums[i]+ " ");
			
			if(nums[i]>max) {
				max=nums[i];
				
			}else if(nums[i]<min) {
				min=nums[i];
			}//aqui me planto 
		}
		System.out.println(" ");
		System.out.println("El máximo es: "+max+" y el mínimo es: "+min);
		
	}

}
