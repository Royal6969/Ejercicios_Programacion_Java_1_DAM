package Animales;

public class Ping�ino extends Ave{ //este tiene su herencia de su clase padre Ave
	
	//ATRIBUTO//
	
	private String raza;

	//CONSTRUCTOR//
	public Ping�ino(Sexo sexo) {
		super(sexo);
	}//hemos quitado lo de raza porque vamos a a�adirlo de otra manera
	
	public Ping�ino(){
		super();
	}
	
	//GETTER Y SETTER
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	//TO STRING//
	@Override
	public String toString() {
		//return "Ping�ino [raza=" + raza + "]";
		return super.toString()+"Tipo de ping�ino: "+this.raza;
		
		//con esto llamo al ToString de la clase padre Ave
		//y a su vez, como Ave NO tiene ToString, Ave estar�a llamando a su clase padre Animal
	}
	
	public void vuela(){
		System.out.println ("No puedo volar");
	}

}
