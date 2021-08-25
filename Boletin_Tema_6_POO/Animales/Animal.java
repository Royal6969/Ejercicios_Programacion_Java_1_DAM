package Animales;

public abstract class Animal {
	
	//atributo//
	private Sexo sexo;
	
	//CONSTRUCTOR 1//
	public Animal () {
		sexo = Sexo.MACHO; //el sexo default es MACHO
	}
	//CONSTRUCTOR 2 para sexo especifico
	public Animal (Sexo s) {
		sexo = s;
	}
	//GETTER//
	public Sexo getSexo() {
		return sexo;
	}
	//SETTER//
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	//TO STRING//
	public String toString() { 
		return "Sexo: " +this.sexo+" ";}
		
	/*** Hace que el animal se eche a dormir.
		 */
	//METODOS//
	public void duerme() { 
		System.out.println("Zzzzzzz");
	}
		
}
