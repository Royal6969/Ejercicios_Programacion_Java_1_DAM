package Ejer_14_UnirEnLista_ElementosComunes;

public class Prueba_Elemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Elementos lista1 = new Lista_Elementos();
		
		Elemento num1 = new Elemento(1);
		Elemento num2 = new Elemento(-2);
		Elemento num3 = new Elemento(3);
		Elemento num4 = new Elemento(-4);
		Elemento num5 = new Elemento(5);
		Elemento num6 = new Elemento(-6);
		Elemento num7 = new Elemento(7);
		Elemento num8 = new Elemento(-8);
		Elemento num9 = new Elemento(9);
		Elemento num10 = new Elemento(-10);
		
		lista1.getLista_elementos().add(num1);
		lista1.getLista_elementos().add(num2);
		lista1.getLista_elementos().add(num3);
		lista1.getLista_elementos().add(num4);
		lista1.getLista_elementos().add(num5);
		lista1.getLista_elementos().add(num6);
		lista1.getLista_elementos().add(num7);
		lista1.getLista_elementos().add(num8);
		lista1.getLista_elementos().add(num9);
		lista1.getLista_elementos().add(num10);
		
		Lista_Elementos lista2 = new Lista_Elementos();
		
		Elemento num11 = new Elemento(1);
		Elemento num12 = new Elemento(2);
		Elemento num13 = new Elemento(3);
		Elemento num14 = new Elemento(4);
		Elemento num15 = new Elemento(5);
		Elemento num16 = new Elemento(6);
		Elemento num17 = new Elemento(7);
		Elemento num18 = new Elemento(8);
		Elemento num19 = new Elemento(9);
		Elemento num20 = new Elemento(10);
		
		lista2.getLista_elementos().add(num11);
		lista2.getLista_elementos().add(num12);
		lista2.getLista_elementos().add(num13);
		lista2.getLista_elementos().add(num14);
		lista2.getLista_elementos().add(num15);
		lista2.getLista_elementos().add(num16);
		lista2.getLista_elementos().add(num17);
		lista2.getLista_elementos().add(num18);
		lista2.getLista_elementos().add(num19);
		lista2.getLista_elementos().add(num20);
		
		Lista_Elementos listaAUX = new Lista_Elementos();
		
		System.out.println("La lista 1 es:");
		imprimir(lista1);
		System.out.println();
		System.out.println("La lista 2 es:");
		imprimir(lista2);
		System.out.println();
		unirEnUnaLista(lista1, lista2);
		
	}
	//MÉTODOS
	public static void unirEnUnaLista(Lista_Elementos lista1, Lista_Elementos lista2) {
		//lo 1º será crear una lista auxiliar donde juntar ambas listas
		Lista_Elementos listaCompleta = new Lista_Elementos();
		
		for(int i=0; i<lista1.getLista_elementos().size(); i++) {
			//aquí me doy cuenta de que necesito crear un método para buscar la coincidencia de un numero en la otra lista... y como sería muy complejo hacerlo todo aquí del tirón, mejor modularizar
			//una vez creado... volviendo aquí a seguir...
			if(buscarCoincidenciaNumero(lista2, lista1.getLista_elementos().get(i))) {
				listaCompleta.getLista_elementos().add(lista1.getLista_elementos().get(i));
			}
		}
		for(int i=0; i<lista2.getLista_elementos().size(); i++) {
			if(buscarCoincidenciaNumero(lista1, lista2.getLista_elementos().get(i))) {
				listaCompleta.getLista_elementos().add(lista2.getLista_elementos().get(i));
			}
		}
		eliminarRepetidosComunes(listaCompleta);
		imprimir(listaCompleta);
	}
	//para buscar un numero de la lista1 en la lista2
	public static boolean buscarCoincidenciaNumero(Lista_Elementos listaAUX, Elemento num) { //creo en los parámetros una listaAUX y un Elemento aux
		for(int i=0; i<listaAUX.getLista_elementos().size(); i++) {
			if(listaAUX.getLista_elementos().get(i).getNum() == num.getNum()) {
				return true;
			}
		}
		return false;
	}
	//para eliminar los números que se repitan tras unir las listas
	public static void eliminarRepetidosComunes(Lista_Elementos listaAUX) {
		
		for(int i=0; i<listaAUX.getLista_elementos().size(); i++) { //recorer posiciones de listaAUX
			for(int j=i+1; j<listaAUX.getLista_elementos().size(); j++) { //recorrer con una posicion más adelante que i la listaAUX
				if(listaAUX.getLista_elementos().get(i).getNum() == listaAUX.getLista_elementos().get(j).getNum()) { //si la posicion qu eva delante va a ser igual que la posicion actual...
					listaAUX.getLista_elementos().remove(j); //eliminamos la siguiente posición
				}
			}
		}
	}
	//para imprimir la lista unida completa
	public static void imprimir(Lista_Elementos listaAUX) {
		for(int i=0; i<listaAUX.getLista_elementos().size(); i++) {
			System.out.print(listaAUX.getLista_elementos().get(i).getNum()+"\t");
		}
		System.out.println();
	}

}
