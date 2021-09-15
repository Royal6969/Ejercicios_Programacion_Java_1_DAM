package Ejer_5_Alumno_Idiomas;
/* 5. Dados tres conjuntos con los alumnos aprobados respectivamente 
 * en un examen del idioma inglés, el francés y el alemán. 
 * 
 * Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
 * a. candidatos que superaron la prueba de inglés y otra más.
 * b. candidatos que superaron al menos dos idiomas.
 * c. candidatos que superaron sólo un examen
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lista_Alumnos {

	//ATRIBUTOS
	/* 5. Dados tres conjuntos con los alumnos aprobados respectivamente 
	 * en un examen del idioma inglés, el francés y el alemán.*/
	Set<Alumno> ingles = new HashSet<Alumno>();
	Set<Alumno> frances = new HashSet<Alumno>();
	Set<Alumno> aleman = new HashSet<Alumno>();
	
	//CONSTRUCTOR Vacío
	public Lista_Alumnos() {
		super();
	}

	//CONSTRUCTOR Lleno
	public Lista_Alumnos(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		super();
		this.ingles = ingles;
		this.frances = frances;
		this.aleman = aleman;
	}

	//GETTER Y SETTER
	public Set<Alumno> getIngles() {
		return ingles;
	}

	public void setIngles(Set<Alumno> ingles) {
		this.ingles = ingles;
	}

	public Set<Alumno> getFrances() {
		return frances;
	}

	public void setFrances(Set<Alumno> frances) {
		this.frances = frances;
	}

	public Set<Alumno> getAleman() {
		return aleman;
	}

	public void setAleman(Set<Alumno> aleman) {
		this.aleman = aleman;
	}

	//To String
	@Override
	public String toString() {
		return "Lista_Alumnos [ingles=" + ingles + ", frances=" + frances + ", aleman=" + aleman + "]";
	}
	
	//MÉTODOS
	/* Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
	 * a. candidatos que superaron la prueba de inglés y otra más.*/
	public void aprobadosInglesMasOtraMas(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		Set<Alumno> lista_aprobadosIngles = new HashSet<Alumno>();
		Set<Alumno> lista_aprobadosAlgunMas = new HashSet<Alumno>();
		Set<Alumno> lista_unionAmbas = new HashSet<Alumno>(); //en realidad esta no haría falta, pero por esclarecer más
		
		lista_aprobadosIngles.addAll(frances);
		lista_aprobadosAlgunMas.addAll(aleman);
		
		lista_unionAmbas.addAll(lista_aprobadosIngles);
		lista_unionAmbas.addAll(lista_aprobadosAlgunMas);
		
		Iterator<Alumno> iterator = lista_unionAmbas.iterator(); //creamos un iterator para recorrer y mostrar
		
		while(iterator.hasNext()) { 
			Alumno alumno = iterator.next(); //por que smp se hace esto en el iterator??
			System.out.println(alumno);
		}
	}
	/* Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
	 * b. candidatos que superaron al menos dos idiomas.*/
	public void aprobadosAlMenosDosIdiomas(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		Set<Alumno> lista_aprobadosAlMenosIngles = new HashSet<Alumno>();
		Set<Alumno> lista_aprobadosAlMenosFrances = new HashSet<Alumno>();
		Set<Alumno> lista_aprobadosAlMenosAleman = new HashSet<Alumno>();
		
		Set<Alumno> lista_aprobadosAlMenosDosIdiomas = new HashSet<Alumno>();
		
		//combinaciones
		lista_aprobadosAlMenosIngles.addAll(ingles);
		lista_aprobadosAlMenosFrances.addAll(ingles);
		lista_aprobadosAlMenosAleman.addAll(frances);
		
		lista_aprobadosAlMenosIngles.addAll(frances);
		lista_aprobadosAlMenosFrances.addAll(aleman);
		lista_aprobadosAlMenosAleman.addAll(aleman);
		
		lista_aprobadosAlMenosIngles.addAll(lista_aprobadosAlMenosFrances); //reunimos los resultados al sAUX1
		lista_aprobadosAlMenosIngles.addAll(lista_aprobadosAlMenosAleman); //reunimos los resultados al sAUX1
		
		lista_aprobadosAlMenosDosIdiomas.addAll(lista_aprobadosAlMenosIngles); //pasamos todo el resultado a este otro HashSet Auxiliar
		
		Iterator<Alumno> iterator = lista_aprobadosAlMenosDosIdiomas.iterator();
		while(iterator.hasNext()) {
			Alumno alumno = iterator.next();
			System.out.println(alumno);
		}
	}
	/* Se pide implementar un método que devuelva un array con los tres conjuntos siguientes:
	 * c. candidatos que superaron sólo un examen.*/
	public void aprobadosSoloUnExamen(Set<Alumno> ingles, Set<Alumno> frances, Set<Alumno> aleman) {
		Set<Alumno> lista_aprobadosUnExamenIngles = new HashSet<Alumno>();
		Set<Alumno> lista_aprobadosUnExamenFrances = new HashSet<Alumno>();
		Set<Alumno> lista_aprobadosUnExamenAleman = new HashSet<Alumno>();
		
		Set<Alumno> lista_aprobadosSoloUnExamen = new HashSet<Alumno>();
		
		//combinaciones
		lista_aprobadosUnExamenIngles.addAll(ingles);
		lista_aprobadosUnExamenFrances.addAll(frances);
		lista_aprobadosUnExamenAleman.addAll(aleman);
		
		lista_aprobadosUnExamenIngles.removeAll(frances);
		lista_aprobadosUnExamenIngles.removeAll(aleman);
		
		lista_aprobadosUnExamenFrances.removeAll(ingles);
		lista_aprobadosUnExamenFrances.removeAll(aleman);
		
		lista_aprobadosUnExamenAleman.removeAll(ingles);
		lista_aprobadosUnExamenAleman.removeAll(frances);
		
		lista_aprobadosUnExamenIngles.addAll(lista_aprobadosUnExamenFrances); //reunimos los resultados al sAUX1
		lista_aprobadosUnExamenIngles.addAll(lista_aprobadosUnExamenAleman); //reunimos los resultados al sAUX1
		
		lista_aprobadosSoloUnExamen.addAll(lista_aprobadosUnExamenIngles); //pasamos todo el resultado a este otro HashSet Auxiliar
		
		Iterator<Alumno> iterator = lista_aprobadosSoloUnExamen.iterator();
		while(iterator.hasNext()) {
			Alumno alumno = iterator.next();
			System.out.println(alumno);
		}
	}
}
