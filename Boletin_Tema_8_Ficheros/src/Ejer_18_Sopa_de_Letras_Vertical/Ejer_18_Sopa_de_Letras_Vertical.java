package Ejer_18_Sopa_de_Letras_Vertical;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer_18_Sopa_de_Letras_Vertical {

static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader br=new BufferedReader(new FileReader("sopaVertical.txt"));
			String carac=br.readLine();
			String sopa[]=new String[10];
			int cont=0;
			
			while(carac!=null) {
				sopa[cont]=carac;
				carac=br.readLine();
				cont++;
			}
			
			for(int i=0;i<sopa.length;i++) {
				for(int j=0;j<sopa[0].length();j++)
					System.out.print(sopa[i].charAt(j)+"  ");
				System.out.println();
			}
			
			sopaLetra(sopa);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
	public static void sopaLetra(String tablero[]) {
		Scanner s=new Scanner(System.in);
		int oportunidad=0;
		String frutas[]= {"pera", "uva","fresa","kiwi","sandia"};
		
		do {
			try {
				BufferedReader br=new BufferedReader(new FileReader("sopaVertical.txt"));
				String carac=br.readLine();
				boolean error=true;
	
				System.out.println("\nIntroduzca una fruta: ");
				String usuario=s.next();
			
				//poner optimizacion
				for(int i=0;i<frutas.length;i++) {
					if(frutas[i].equalsIgnoreCase(usuario)) {
						System.out.println("Introduzca la fila: ");
						int fil=s.nextInt();
						System.out.println("Introduzca la columna: ");
						int col=s.nextInt();
						
						for(int j=0;j<fil;j++) {
							carac=br.readLine();
						}
						boolean jc=false;
						for(int m=0;m<usuario.length() && !jc;m++) {
							if(carac.charAt(col)==usuario.charAt(m)) {
								
							}else {
								System.out.println("Ñehhh");
								jc=true;
							}
							carac=br.readLine();
						}
						if(jc==false) {
							System.out.println("Felicidades!!!");
							error=false;							
						}/*else {
							System.out.println("Ohhhh!!. Te queda "+(6-oportunidad)+" oportunidades.");
							oportunidad++;
						}*/
					}
				}
				if(error==true) {
					System.out.println("Ohhhh!!. Te queda "+(6-oportunidad)+" oportunidades.");
					oportunidad++;
				}
				br.close();
				error=true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}while(oportunidad<7);
		s.close();
	}

}
