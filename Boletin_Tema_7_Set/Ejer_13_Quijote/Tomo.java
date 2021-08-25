package Ejer_13_Quijote;

/*
 * 13. Con motivo de la celebraci�n del cuarto centenario del Quijote, 
 * un conocido grupo editorial planea lanzar un DVD con contenido multimedia sobre la obra y vida de Cervantes. 
 * Ante las opiniones encontradas que ha generado tal iniciativa, 
 * se ha decido desarrollar un prototipo con el siguiente contenido:
 * 
 * � Los dos tomos del Quijote con ilustraciones en alta resoluci�n 
 * y funciones de narraci�n por audio, acceso directo y zoom.
 * � Un glosario sobre el castellano antiguo.
 * � Un �ndice de todos los personajes de ambos tomos con art�culos y relaciones entre los mismos.
 * 
 * Tras encargar el proyecto a tres empresas de servicios inform�ticos 
 * y siendo cada m�dulo desarrollado por una empresa distinta, 
 * en la �ltima reuni�n mantenida por los jefes de proyecto de cada empresa 
 * se acord� respetar, en funci�n de los requisitos actuales y de las futuras ampliaciones, 
 * las siguientes interfaces:
 * 
 * public interface ITomo {
 * List getCapitulos(); // lista ordenada de cap�tulos// pertenecientes al tomo
 * List getPersonajes();// lista ordenada de personajes que aparecen // en el tomo
 * }
 * 
 * public interface ICapitulo {
 * String getTitulo(); // t�tulo del cap�tulo
 * List getPersonajes(); // lista ordenada de personajes que //aparecen en el cap�tulo
 * }
 * 
 * public interface IPersonaje {
 * String getApodo(); // p.e. �Don Quijote�, �Dulcinea del Toboso� String getNombre(); // p.e. �Alonso Quijano�, �Aldonza Lorenzo�
 * Set getPersonajes(); // conjunto de personajes vinculados
 * List getCapitulos(); // lista ordenada de cap�tulos donde aparece
 * }
 * 
 * Se pide:
 * � Un m�todo que a partir de un tomo t y un personaje p muestre en pantalla, 
 * ordenados ascendentemente seg�n el n�mero del cap�tulo donde aparecen por primera vez, 
 * el nombre de cada uno de los personajes vinculados a p en t, junto al nombre de dicho cap�tulo. 
 * En la implementaci�n se utilizara un Set para evitar la repetici�n de personajes.
 * 
 * � Un m�todo que devuelva el personaje, distinto a �Don Quijote�, con mayor n�mero de personajes vinculados 
 * (v�ase el m�todo getPersonajes de la interfaz Ipersonaje) en un mismo cap�tulo c de un tomo t.
 * Ambos m�todos se incluir�n en una clase donde uno de sus atributos, de nombre tomos, 
 * es un array de ITomo de tama�o 2. 
 * El orden natural de los cap�tulos y de los personajes es, respectivamente, 
 * el de su aparici�n en la novela y el orden alfab�tico.
 */

public class Tomo {
	
	
}
