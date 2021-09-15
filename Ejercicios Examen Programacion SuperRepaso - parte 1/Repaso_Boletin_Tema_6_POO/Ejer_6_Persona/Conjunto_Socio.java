package Ejer_6_Persona;

import java.util.Arrays;

public class Conjunto_Socio {

	//ATRIBUTOS
	private Socio[] conjunto_socios = new Socio[10];

	//CONSTRUCTOR Vacío
	public Conjunto_Socio() { //en los conjuntos_x smp va constructor vacío
		super();
	}

	//CONSTRUCTOR Lleno
	public Conjunto_Socio(Socio[] conjunto_socios) {
		super();
		this.conjunto_socios = conjunto_socios;
	}

	//GETTER Y SETTER
	public Socio[] getConjunto_socios() {
		return conjunto_socios;
	}

	public void setConjunto_socios(Socio[] conjunto_socios) {
		this.conjunto_socios = conjunto_socios;
	}

	//To String
	@Override
	public String toString() {
		return "Conjunto_Socio [conjunto_socios=" + Arrays.toString(conjunto_socios) + "]";
	}
	
	//MÉTODOS
	public void listadoCompleto() { //aqui no se pasa nada como parametro
		
		for(int i=0; i<Socio.getnSocio(); i++) {
			System.out.println(this.getConjunto_socios()[i]);
		}
		System.out.println();
	}
	public void listadoSegunNombre() {
		//METODO BURBUJA
        for (int i=0; i<Socio.getnSocio()-1; i++) { //a los atributos estaticos smp se les llama a traves del nombre de la clase que los parió
            for (int j=i+1; j<Socio.getnSocio(); j++) {
                if (this.getConjunto_socios()[i].getNombre().compareToIgnoreCase(this.getConjunto_socios()[j].getNombre()) > 0) { //un 0 porque es el valor del return del metodo equals y compare ... -1, 0, +1
                    Socio aux = this.getConjunto_socios()[i];
                    this.getConjunto_socios()[i] = this.getConjunto_socios()[j];
                    this.getConjunto_socios()[j] = aux;
                }
            }
        }
        this.listadoCompleto();
	}
	public void listadoCompletoSegunNacimiento() {
		//METODO BURBUJA
        for (int i=0; i<Socio.getnSocio()-1; i++) { //a los atributos estaticos smp se les llama a traves del nombre de la clase que los parió
            for (int j=i+1; j<Socio.getnSocio(); j++) {
                if (this.getConjunto_socios()[i].getNacimiento().getAño() < this.getConjunto_socios()[j].getNacimiento().getAño()) {
                	Socio aux = this.getConjunto_socios()[i];
                    this.getConjunto_socios()[i] = this.getConjunto_socios()[j];
                    this.getConjunto_socios()[j] = aux;
                }
                if (this.getConjunto_socios()[i].getNacimiento().getMes() > this.getConjunto_socios()[j].getNacimiento().getMes()) {
                	Socio aux = this.getConjunto_socios()[i];
                    this.getConjunto_socios()[i] = this.getConjunto_socios()[j];
                    this.getConjunto_socios()[j] = aux;
                }
                if (this.getConjunto_socios()[i].getNacimiento().getDia() > this.getConjunto_socios()[j].getNacimiento().getDia()) {
                	Socio aux = this.getConjunto_socios()[i];
                    this.getConjunto_socios()[i] = this.getConjunto_socios()[j];
                    this.getConjunto_socios()[j] = aux;
                }
            }
        }
        this.listadoCompleto();
	}
}
