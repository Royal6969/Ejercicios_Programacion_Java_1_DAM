package Animales;

public class Pingüino extends Ave{ //este tiene su herencia de su clase padre Ave
	
	//ATRIBUTO//
	
	private String raza;

	//CONSTRUCTOR//
	public Pingüino(Sexo sexo) {
		super(sexo);
	}//hemos quitado lo de raza porque vamos a añadirlo de otra manera
	
	public Pingüino(){
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
		//return "Pingüino [raza=" + raza + "]";
		return super.toString()+"Tipo de pingüino: "+this.raza;
		
		//con esto llamo al ToString de la clase padre Ave
		//y a su vez, como Ave NO tiene ToString, Ave estaría llamando a su clase padre Animal
	}
	
	public void vuela(){
		System.out.println ("No puedo volar");
	}

}
