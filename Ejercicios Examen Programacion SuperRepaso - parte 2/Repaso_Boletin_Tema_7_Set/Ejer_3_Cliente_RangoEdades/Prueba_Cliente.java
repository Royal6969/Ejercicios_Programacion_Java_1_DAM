package Ejer_3_Cliente_RangoEdades;

import java.util.Iterator;

/*
 * 3. Una empresa desea clasificar a sus clientes en función de su edad ([0,14),[14,18),[18,..)). 
 * Dado un conjunto de personas, obtener un array con los tres conjuntos resultantes.
 */
public class Prueba_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Clientes clientes = new Lista_Clientes();
		
		Cliente cli1 = new Cliente(25);
		Cliente cli2 = new Cliente(11);
		Cliente cli3 = new Cliente(15);
		Cliente cli4 = new Cliente(14);
		Cliente cli5 = new Cliente(17);
		Cliente cli6 = new Cliente(18);
		
		clientes.getLista_clientes().add(cli1);
		clientes.getLista_clientes().add(cli2);
		clientes.getLista_clientes().add(cli3);
		clientes.getLista_clientes().add(cli4);
		clientes.getLista_clientes().add(cli5);
		clientes.getLista_clientes().add(cli6);
		
		//ahora para recorrer el set para poder manjar cada dato
		//necesitamos hacer uso de un Iterator
		Iterator<Cliente> iterator = clientes.getLista_clientes().iterator(); //creamos uno y le asignamos el conjunto de "clientes" que hací areferencia a "Lista_Clientes"
		
		while(iterator.hasNext()) {
			Cliente cli = iterator.next();
			
			if(cli.getEdad() < 14) {
				clientes.getIntervaloEdad_1().add(cli);
			}else if(cli.getEdad() >= 14 && cli.getEdad() < 18) {
				clientes.getIntervaloEdad_2().add(cli);
			}else if(cli.getEdad() >= 18) {
				clientes.getIntervaloEdad_3().add(cli);
			}
		}
		System.out.println("Los clientes que tienen menos de 14 años son: "+clientes.getIntervaloEdad_1().toString());
		System.out.println("Los clientes que tienen entre 14 y 18 años son: "+clientes.getIntervaloEdad_2().toString());
		System.out.println("Los clientes que tienen más de 18 años son: "+clientes.getIntervaloEdad_3().toString());
	}

}
