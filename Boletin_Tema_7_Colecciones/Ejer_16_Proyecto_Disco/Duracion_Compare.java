package Ejer_16_Proyecto_Disco;

import java.util.Comparator;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Men� de opciones:
1. Insertar nuevo disco, seg�n su codigo, que es �nico
2. Listado ordenado seg�n autor
3. Listado agrupado por g�nero, mostrando el n�mero de discos de cada g�nero
4. Listado por duraci�n
5. Eliminar un disco seg�n su c�digo
6. Salir
Clases:
- Disco
- LDisco: insertaDisco, eliminaDisco, listadoAutor, listadoDuracion,listadoGenero.
- PruebaDisco
- GeneroComparator
- DuracionComparator
 */

public class Duracion_Compare implements Comparator<Disco>{

	public int compare(Disco cd1, Disco cd2) {
		
		return (cd1.getDuracion() - cd2.getDuracion());
	}
}
