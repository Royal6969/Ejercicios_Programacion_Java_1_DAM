package Ejer_3_ClasificarClientes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
 * 3. Una empresa desea clasificar a sus clientes en función de su edad ([0,14),[14,18),[18,..)). 
 * Dado un conjunto de personas, obtener un array con los tres conjuntos resultantes.
 */

public class Prueba_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Cliente> Conjunto_Clientes = new HashSet<Cliente>();
		
		Set<Cliente> EdadIntervalo1 = new HashSet<Cliente>();
		Set<Cliente> EdadIntervalo2 = new HashSet<Cliente>();
		Set<Cliente> EdadIntervalo3 = new HashSet<Cliente>();

		Cliente cli1 = new Cliente(25);
		Cliente cli2 = new Cliente(11);
		Cliente cli3 = new Cliente(15);
		Cliente cli4 = new Cliente(14);
		Cliente cli5 = new Cliente(17);
		Cliente cli6 = new Cliente(18);
		
		Conjunto_Clientes.add(cli1);
		Conjunto_Clientes.add(cli2);
		Conjunto_Clientes.add(cli3);
		Conjunto_Clientes.add(cli4);
		Conjunto_Clientes.add(cli5);
		Conjunto_Clientes.add(cli6);

		//ahora para recorrer y obtener un dato, hay que usar el Iterator con esto de los set
		Iterator<Cliente> recorrer = Conjunto_Clientes.iterator(); //importar el iterator "java.util"
		
		while(recorrer.hasNext()) {
			Cliente cli = recorrer.next();
			
			if(cli.getEdad()<14) {
				EdadIntervalo1.add(cli);
			
			}else if(cli.getEdad()>=14 && cli.getEdad()<18) {
				EdadIntervalo2.add(cli);
			
			}else if(cli.getEdad()>=18) {
				EdadIntervalo3.add(cli);
			}
		}
		
		System.out.println("Los clientes que tienen menos de 14 años son: "+EdadIntervalo1);
		System.out.println("Los clientes que tienen entre 14 y 18 años son: "+EdadIntervalo2);
		System.out.println("Los clientes que tienen más de 18 años son: "+EdadIntervalo3);
	}

}
