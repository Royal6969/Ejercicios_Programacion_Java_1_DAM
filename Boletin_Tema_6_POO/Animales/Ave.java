package Animales;

public class Ave extends Animal{
	
	public Ave(Sexo sexo){
		super(sexo); //para que obtenga el sexo heredado de animal
	}
	
	public Ave(){//sin constructor por si se quiere crear sin meter datos
		super();
	}
	
	//le faltaria un To String , pero el Prueba_Animal no lo requiere
	public void aseate(){ //metodo 1 del ave
		System.out.println ("Me estoy limpiando las plumas");
	}
	public void vuela(){ //método 2 del ave
		System.out.println ("Estoy volando");
	}
}
