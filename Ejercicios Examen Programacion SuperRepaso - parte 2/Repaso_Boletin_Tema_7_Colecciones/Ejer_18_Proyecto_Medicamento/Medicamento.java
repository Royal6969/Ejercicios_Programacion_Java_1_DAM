package Ejer_18_Proyecto_Medicamento;
/*
 * A. Clase Medicamento:
 * public interface Medicamento extends Comparable<Medicamento>{
 * // Métodos consultores
 * Integer getCodigo();
 * String getNombre();
 * Double getPrecio();
 * Boolean getReceta();
 * // métodos modificadores
 * void setPrecio(Double np) throws ExcepcionPrecioMenorCero;
 * void setReceta(Boolean nr);
 * void incrementaPrecio(Integer p);
 * }
 */
public interface Medicamento extends Comparable<Medicamento>{ //smp que sea una interfaz y lleve comparable, se hace con extends y no con implements
	
	// Métodos consultores //hemos retocado las iniciales que estaban en capital letter y cambiando algun Interger por int 
	public int getCodigo();
	public String getNombre();
	public double getPrecio();
	public boolean getReceta();
	 
	// métodos modificadores //hemos retocado las iniciales que estaban en capital letter y cambiando algun Interger por int 
	public void setPrecio(double np) throws ExcepcionPrecioMenorCero; //aqui veo que hay que crear la clase de la excepción...
	public void setReceta(boolean nr);
	public void incrementaPrecio(double p) throws ExcepcionPrecioMenorCero; //OJO todo lo que tiene que ver con un "precio" le ponemos la excepcion nuestra del precio menos que 0
}
