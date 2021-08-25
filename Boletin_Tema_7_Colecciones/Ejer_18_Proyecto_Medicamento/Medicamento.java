package Ejer_18_Proyecto_Medicamento;

/*
 * A. Clase Medicamento:
 * 
 * public interface Medicamento extends Comparable<Medicamento>{
 * // M�todos consultores
 * 
 * Integer getCodigo();
 * String getNombre();
 * Double getPrecio();
 * Boolean getReceta();
 * 
 * // m�todos modificadores
 * 
 * void setPrecio(Double np) throws ExcepcionPrecioMenorCero;
 * void setReceta(Boolean nr);
 * void incrementaPrecio(Integer p);
 * }
 */

public interface Medicamento extends Comparable<Medicamento>{

	public int getCodigo();
	public String getNombre();
	public double getPrecio();
	public boolean getReceta();

	//M�TODOS
	public void setPrecio(double np) throws ExcepcionPrecioMenorCero;
	public void setReceta(boolean nr);
	public void incrementaPrecio(double p) throws ExcepcionPrecioMenorCero;
}
