package Ejer_8_Numero_Tail_Head_Sub_SortedSet;
/*
 * 8. Crear un conjunto ordenado de 10 números enteros (orden natural) y probar los métodos siguientes:
 * a. tailSet
 * b. headSet
 * c. subSet
 */
public class Prueba_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Numeros numeros = new Lista_Numeros();
		
		Numero num1 = new Numero(1);
		Numero num2 = new Numero(2);
		Numero num3 = new Numero(3);
		Numero num4 = new Numero(4);
		Numero num5 = new Numero(5);
		Numero num6 = new Numero(6);
		Numero num7 = new Numero(7);
		Numero num8 = new Numero(8);
		Numero num9 = new Numero(9);
		Numero num10 = new Numero(10);
		
		
		numeros.getLista_numeros().add(num1);
		numeros.getLista_numeros().add(num2);
		numeros.getLista_numeros().add(num3);
		numeros.getLista_numeros().add(num4);
		numeros.getLista_numeros().add(num5);
		numeros.getLista_numeros().add(num6);
		numeros.getLista_numeros().add(num7);
		numeros.getLista_numeros().add(num8);
		numeros.getLista_numeros().add(num9);
		numeros.getLista_numeros().add(num10);
		
		System.out.println(numeros.getLista_numeros().tailSet(num7));
		System.out.println();
		System.out.println(numeros.getLista_numeros().headSet(num3));
		System.out.println();
		System.out.println(numeros.getLista_numeros().subSet(num3, num7));
		System.out.println();
		//que fallo está dando en la ejecucuión??
	}

}
