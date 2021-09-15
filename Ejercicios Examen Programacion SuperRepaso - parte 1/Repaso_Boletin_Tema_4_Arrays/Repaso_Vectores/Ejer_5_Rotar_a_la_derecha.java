package Repaso_Vectores;

public class Ejer_5_Rotar_a_la_derecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = new int[15];
		int numGuardado = 0;
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*20);
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		for(int i=nums.length-1; i>=0; i--) {
			if(i==nums.length-1) {
				numGuardado = i;
			}else if(i==0) {
				nums[i+1] = nums[i];
				nums[i] = numGuardado;
			}else {
				nums[i+1] = nums[i];
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
