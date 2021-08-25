package Ejer_2_Animales;

/*
2. Crea las clases Animal , Mam�fero , Ave , Gato , Perro ,Canario ,Ping�ino y Lagarto . Crea al menos,
tres m�todos espec�ficos de cada clase y redefine el/los m�todos cuando sea necesario. Prueba las
clases creadas en un programa en el que se instancian objetos y se aplican dichos m�todos.

 */

public abstract class Animal {
	private String sexo;
	
	
	public Animal(String sexo) {
		super();
		this.sexo = sexo;
	}
	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	@Override
	public String toString() {
		return "Animal [sexo=" + sexo + "]";
	}
	
	
	public void comer() {
		System.out.println("Rico");
	}
	public void dormir() {
		System.out.println("ZZZ");
	}
	public void caga() {
		System.out.println("Estoy estre�ido");
	}
}
