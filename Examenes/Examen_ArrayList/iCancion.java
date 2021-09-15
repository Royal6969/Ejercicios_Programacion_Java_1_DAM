package Examen_ArrayList;

public interface iCancion extends Comparable<Cancion>{

	public String getNombre();
	public String getInterprete();
	public Genero getGenero();
	public Duracion getDuracion();
	public int getAño();
	public int getCalificacion();
	public double getPrecio();
	public void setCalificacion(int calificacion);
	public void setPrecio(double precio);
}
