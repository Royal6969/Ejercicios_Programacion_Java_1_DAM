package Futbol;

import java.util.Arrays;

public class Equipo {

	private String nombre;
	private double presupuesto;
	private Jugador[] players;
	
	//CONSTRUCTOR//
	public Equipo(String nombre, double presupuesto, Jugador[] players) {
		super();
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.players = players;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public Jugador[] getPlayers() {
		return players;
	}

	public void setPlayers(Jugador[] players) {
		this.players = players;
	}

	//TO String
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", presupuesto=" + presupuesto + ", players=" + Arrays.toString(players)
				+ "\n]";
	}
	
	
	
}
