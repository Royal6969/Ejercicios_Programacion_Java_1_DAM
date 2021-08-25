package Ejer_14_Cadena_Montaje_Robots;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Las piezas son sometidas a un test de calidad, cuyos posibles resultados son las siguientes cadenas:
 * 
 * �tr1�: test OK
 * �tr0�: test NO OK
 * �tr10�: pieza no correspondiente a la cadena de montaje
 * 
 * Existe un m�todo ya implementado llamado:
 * 
 * public static PiezaRobot damePiezaValida(PiezaRobot p, SortedSet piezas)
 * el cual recibe un objeto PiezaRobot y un conjunto ordenado de objetos PiezaRobot. 
 * Este m�todo busca en el conjunto de piezas un objeto de las mismas caracter�sticas 
 * (mismos atributos claveRobot y pieza) que el objeto que se pasa como par�metro 
 * y adem�s con calidad v�lida (testCalidad=�tr1�) y lo devuelve. 
 * 
 * Si no encuentra un objeto de dichas caracter�sticas devuelve null.Se pide: 
 * 
 * a) Implemente un m�todo que reciba como par�metros una lista de PiezaRobot 
 * y un conjunto ordenado de PiezaRobot para repuesto. Este m�todo deber� recorrer la lista y
 * revisar la calidad de cada una de las piezas de tal forma que si la calidad es:
 * 
 * - �tr1�: la pieza es v�lida. No hay nada que hacer.
 * - �tr0�: la pieza es err�nea. Deber� sustituirla por una nueva pieza v�lida. 
 * Para ello utilice el m�todo damePiezaValida y el conjunto de piezas de repuesto.
 * - �tr10�: la pieza es de otro robot. Deber� eliminarla de la lista.
 * 
 * En el caso de que no encontremos una pieza de sustituci�n habr� que elevar 
 * y propagar la excepci�n CadenaIncompletaException con la informaci�n de las caracter�sticas del robot
 * (claveRobot y pieza) que no se ha podido sustituir. 
 * 
 * Suponga que la excepci�n CadenaIncompletaException ya est� implementada.
 * 
 * b) Implemente los cambios necesarios en la clase PiezaRobot para ordenar las piezas de los robots 
 * primero por el atributo claveRobot y despu�s por el atributo pieza.
 */

public class Prueba_Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PiezaRobot pieza1 = new PiezaRobot(10, 100, "pieza1", "tr0");
		PiezaRobot pieza2 = new PiezaRobot(11, 110, "pieza2", "tr1");
		PiezaRobot pieza3 = new PiezaRobot(12, 120, "pieza3", "tr10");
		PiezaRobot pieza4 = new PiezaRobot(13, 130, "pieza4", "tr0");
		PiezaRobot pieza5 = new PiezaRobot(14, 140, "pieza4", "tr1");
		PiezaRobot pieza6 = new PiezaRobot(15, 150, "pieza6", "tr10");
		
		SortedSet<PiezaRobot> listaPiezas = new TreeSet<PiezaRobot>();
		
		listaPiezas.add(pieza1);
		listaPiezas.add(pieza2);
		listaPiezas.add(pieza3);
		listaPiezas.add(pieza4);
		listaPiezas.add(pieza5);
		listaPiezas.add(pieza6);
		
		List<PiezaRobot> cadena = new ArrayList<PiezaRobot>();
	}
	
	//M�TODOS (est�ticos)
	public static PiezaRobot damePiezaValida(PiezaRobot p, SortedSet listaPiezas) {
		
		if() {
			
		}
		
		return ;
	}
	
	public static void cadenaMontaje(List<PiezaRobot> cadena, SortedSet<PiezaRobot> listaPiezas) throws CadenaIncompletaException{
        
		ListIterator<PiezaRobot> i = cadena.listIterator();
        
		while(i.hasNext()) {
			
            PiezaRobot aux=(PiezaRobot) i.next();
            
            if(aux.getTestCalidad().compareTo("tr1")>0) {
                i.remove();
            
            }else if(aux.getTestCalidad().compareTo("tr1")<0) {
                PiezaRobot sust = damePiezaValida(aux, listaPiezas);
                
            	if(sust!=null) {
                    System.out.println("Se sustituye"+aux.toString()+" por: "+sust.toString());
                    i.set(sust);
                
            	}else {
                    CadenaIncompletaException e = new CadenaIncompletaException(aux.getClaveRobot()+aux.getPieza());
                    throw e;
                }
            }else {
                System.out.println("Pieza ok: "+aux.toString());
            }
        }
    }

}
