package Ejer_16_Proyecto_Disco;

import java.util.Comparator;

/*
 * 6. ENUNCIADO PROYECTO DISCO
Menú de opciones:
1. Insertar nuevo disco, según su codigo, que es único
2. Listado ordenado según autor
3. Listado agrupado por género, mostrando el número de discos de cada género
4. Listado por duración
5. Eliminar un disco según su código
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
