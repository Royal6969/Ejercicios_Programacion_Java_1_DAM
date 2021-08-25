package Ejer_7_Agroalimentaria;

public class Prueba_Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fecha cad=new Fecha(1, 1, 1);
		Fecha envasa=new Fecha(2, 2, 2);
		
		Frescos fresco=new Frescos(cad, envasa, 1, "España");
		Frescos frescos=new Frescos(cad, envasa, 2, "España");
		Refrigerados refri=new Refrigerados(cad, envasa, 3, "Francia", 111, -10);
		Refrigerados refro=new Refrigerados(cad, envasa, 4, "Francia", 222, -12);
		Refrigerados refru=new Refrigerados(cad, envasa, 5, "Francia", 333, -15);
		Agua agua=new Agua(cad, envasa, 6, "Portugal", -30, 50);
		Agua aguas=new Agua(cad, envasa, 7, "Portugal", -35, 60);
		Aire aire=new Aire(cad, envasa, 8, "America", -70, 30, 20, 45, 5);
		Aire aires=new Aire(cad, envasa, 9, "America", -78, 20, 30, 40, 10);
		Nitrogeno nitro=new Nitrogeno(cad, envasa, 10, "Australia", -160, "Metodo", 20);
		
		System.out.println(fresco);
		System.out.println(frescos);
		System.out.println(refri);
		System.out.println(refro);
		System.out.println(refru);
		System.out.println(agua);
		System.out.println(aguas);
		System.out.println(aire);
		System.out.println(aires);
		System.out.println(nitro);
	}

}
