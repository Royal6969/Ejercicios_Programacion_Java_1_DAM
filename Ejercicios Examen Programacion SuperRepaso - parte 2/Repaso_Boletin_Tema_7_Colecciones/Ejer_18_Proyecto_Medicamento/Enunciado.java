package Ejer_18_Proyecto_Medicamento;

public class Enunciado {
/*
 * 18. PROYECTO MEDICAMENTO:
 * 
 * A. Clase Medicamento:
 * public interface Medicamento extends Comparable<Medicamento>{
 * // M�todos consultores
 * Integer getCodigo();
 * String getNombre();
 * Double getPrecio();
 * Boolean getReceta();
 * // m�todos modificadores
 * void setPrecio(Double np) throws ExcepcionPrecioMenorCero;
 * void setReceta(Boolean nr);
 * void incrementaPrecio(Integer p);
 * }
 * 
 * B. Clase MedicamentoImpl: establecer que dos medicamentos no son iguales si tienen c�digos distintos (redefinir equals)
 * ATRIBUTOS:
 * private Integer codigo;
 * private String nombre;
 * private Double precio;
 * private Boolean receta;
 * CONSTRUCTOR:
 * public MedicamentoImpl(Integer c, String n, Double p, Boolean r) throws
 * ExcepcionPrecioMenorCero{
 * if (p<0){
 * throw new ExcepcionPrecioMenorCero(" Error intento de crear un medicamento con precio negativo");
 * }
 * codigo=c;
 * nombre=n;
 * // comprobar que p es positivo
 * precio=p;
 * receta=r;
 * }
 * 
 * C. Clase ExcepcionPrecioMenorCero: al dar de alta un medicamento, 
 * saltar� dicha excepci�n si el precio es negativo.
 * 
 * D. Clase ListaMedicamentos
 * 
 * E. PruebaMedicamento: men� de opciones:
 * a. INSERTAR MEDICAMENTO (con su c�digo, nombre, precio y si tiene o no receta)
 * b. LISTAR MEDICAMENTOS (ordenados por nombre y en caso de igualdad por su precio)
 * c. INCREMENTAR PRECIO %
 * d. DECIR SI DOS MEDICAMENTOS SON IGUALES
 * e. SALIR
 */
}
