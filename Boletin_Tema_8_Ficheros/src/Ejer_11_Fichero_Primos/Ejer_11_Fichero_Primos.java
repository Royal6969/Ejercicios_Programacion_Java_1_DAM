package Ejer_11_Fichero_Primos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejer_11_Fichero_Primos {

/*
 * 11. Escribe un programa que guarde en un fichero con nombre primos.dat 
 * los números primos que hay entre 1 y 500
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("primos.dat", false);
			PrintWriter pw = new PrintWriter(fw);
			
			//int num = 0;
			boolean primo = true;
			
			for(int i=1; i<500; i++) {
				for(int j=2; j<i; j++) {
					
					if(i%j == 0) {
						primo = false;
					
					}//else {
						//primo = true;
					//}
					
				}
				if(primo == true) {
					pw.println(i);
				}
				primo = true;
			}
			//pw.println(num);
			pw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
