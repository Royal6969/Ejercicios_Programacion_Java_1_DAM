package Futbol;

public class Prueba_Equipo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//usar control+espacio
		//Jugador ronaldo = new Jugador(null, null, null);
		
		Jugador ronaldo = new Jugador("Ronaldo", "Argentina", "10203040A");
		Jugador pepe = new Jugador("Pepe", "Italia", "11223344B");
		Jugador alfonsito = new Jugador("Alfonsito", "España", "40302010C");
		Jugador ron = new Jugador("Ron", "Reino Unido", "50607080D");
		Jugador juanca = new Jugador("JuanCa", "Utrera", "90807060E");
		
		Jugador[] players = {ronaldo, pepe, alfonsito, ron, juanca};
		
		Equipo sevillaestefc = new Equipo("SevillaEsteFC", 950100.25, players);
		
		System.out.println(sevillaestefc);
	}

}
