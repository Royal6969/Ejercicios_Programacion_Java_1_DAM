package Botellas;

public class Prueba_Botella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Botella botellin = new Botella("cristal", "transparente", 33, 15);
		
		System.out.println(botellin);
		
		botellin.llenar_botella(10);
		
		botellin.vaciar_botella(20);
		
		if(botellin.botella_llena()) {
			System.out.println("El botellín está lleno");
		
		}else {
			System.out.println("El botellin no está lleno");
		}
		
		if(botellin.botella_vacia()) {
			System.out.println("El botellín está vacío");
		
		}else {
			System.out.println("El botellín no está vacío");
		}
		
		botellin.liquido_en_botella();
		
		System.out.println(botellin);
	}

}
