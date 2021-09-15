package Ejer_12_EliminarElementosRepetidos;

/*
 * 12. Eliminar elementos repetidos de una lista de nodos de tipo Elemento.
 */
public class Prueba_Elemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Elementos numeros = new Lista_Elementos();
		
		Elemento num1 = new Elemento(1);
		Elemento num2 = new Elemento(2);
		Elemento num3 = new Elemento(3);
		Elemento num4 = new Elemento(5);
		Elemento num5 = new Elemento(2);
		Elemento num6 = new Elemento(6);
		Elemento num7 = new Elemento(7);
		Elemento num8 = new Elemento(5);
		
		numeros.getLista_elementos().add(num1);
		numeros.getLista_elementos().add(num2);
		numeros.getLista_elementos().add(num3);
		numeros.getLista_elementos().add(num4);
		numeros.getLista_elementos().add(num5);
		numeros.getLista_elementos().add(num6);
		numeros.getLista_elementos().add(num7);
		numeros.getLista_elementos().add(num8);
		
		System.out.println("Lista original de los números");
		imprimirListado(numeros);
		System.out.println();
		System.out.println("Lista sin los números repetidos");
		eliminarRepetidos(numeros); //por qué no me funciona con el 1º dos?????
		imprimirListado(numeros);
		System.out.println();
		
	}
	//MÉTODOS
	//para imprimir
	public static void imprimirListado(Lista_Elementos numeros) {
		for(int i=0; i<numeros.getLista_elementos().size(); i++) {
			System.out.print(numeros.getLista_elementos().get(i).getNum()+"\t");
		}
		System.out.println();
	}
	//para eliminar repetidos
	public static void eliminarRepetidos(Lista_Elementos numeros) {
		
		for(int i=0; i<numeros.getLista_elementos().size(); i++) {
			for(int j=i+1; j<numeros.getLista_elementos().size(); j++) {
				if(numeros.getLista_elementos().get(i).getNum() == numeros.getLista_elementos().get(j).getNum()) {
					numeros.getLista_elementos().remove(j);
				}
			}
		}
	}

}
