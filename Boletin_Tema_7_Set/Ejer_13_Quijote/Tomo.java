package Ejer_13_Quijote;

/*
 * 13. Con motivo de la celebración del cuarto centenario del Quijote, 
 * un conocido grupo editorial planea lanzar un DVD con contenido multimedia sobre la obra y vida de Cervantes. 
 * Ante las opiniones encontradas que ha generado tal iniciativa, 
 * se ha decido desarrollar un prototipo con el siguiente contenido:
 * 
 * • Los dos tomos del Quijote con ilustraciones en alta resolución 
 * y funciones de narración por audio, acceso directo y zoom.
 * • Un glosario sobre el castellano antiguo.
 * • Un índice de todos los personajes de ambos tomos con artículos y relaciones entre los mismos.
 * 
 * Tras encargar el proyecto a tres empresas de servicios informáticos 
 * y siendo cada módulo desarrollado por una empresa distinta, 
 * en la última reunión mantenida por los jefes de proyecto de cada empresa 
 * se acordó respetar, en función de los requisitos actuales y de las futuras ampliaciones, 
 * las siguientes interfaces:
 * 
 * public interface ITomo {
 * List getCapitulos(); // lista ordenada de capítulos// pertenecientes al tomo
 * List getPersonajes();// lista ordenada de personajes que aparecen // en el tomo
 * }
 * 
 * public interface ICapitulo {
 * String getTitulo(); // título del capítulo
 * List getPersonajes(); // lista ordenada de personajes que //aparecen en el capítulo
 * }
 * 
 * public interface IPersonaje {
 * String getApodo(); // p.e. “Don Quijote”, “Dulcinea del Toboso” String getNombre(); // p.e. “Alonso Quijano”, “Aldonza Lorenzo”
 * Set getPersonajes(); // conjunto de personajes vinculados
 * List getCapitulos(); // lista ordenada de capítulos donde aparece
 * }
 * 
 * Se pide:
 * • Un método que a partir de un tomo t y un personaje p muestre en pantalla, 
 * ordenados ascendentemente según el número del capítulo donde aparecen por primera vez, 
 * el nombre de cada uno de los personajes vinculados a p en t, junto al nombre de dicho capítulo. 
 * En la implementación se utilizara un Set para evitar la repetición de personajes.
 * 
 * • Un método que devuelva el personaje, distinto a “Don Quijote”, con mayor número de personajes vinculados 
 * (véase el método getPersonajes de la interfaz Ipersonaje) en un mismo capítulo c de un tomo t.
 * Ambos métodos se incluirán en una clase donde uno de sus atributos, de nombre tomos, 
 * es un array de ITomo de tamaño 2. 
 * El orden natural de los capítulos y de los personajes es, respectivamente, 
 * el de su aparición en la novela y el orden alfabético.
 */

public class Tomo {
	
	
}
