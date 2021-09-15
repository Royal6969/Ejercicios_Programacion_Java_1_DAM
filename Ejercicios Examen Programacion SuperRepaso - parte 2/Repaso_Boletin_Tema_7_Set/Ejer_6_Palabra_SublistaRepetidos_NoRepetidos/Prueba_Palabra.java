package Ejer_6_Palabra_SublistaRepetidos_NoRepetidos;
/*
 * 6. Dado un array de palabras, donde existirán repeticiones (yo, vengo, yo, voy, yo, soy), 
 * se propone crear dos conjuntos para listar por separado las palabras que están sin repetir (vengo, voy ,soy), 
 * y las palabras que sí lo están (yo).
 */
public class Prueba_Palabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista_Palabras palabras = new Lista_Palabras();
		
		Palabra p1 = new Palabra("yo");
		Palabra p2 = new Palabra("vengo");
		Palabra p3 = new Palabra("yo");
		Palabra p4 = new Palabra("voy");
		Palabra p5 = new Palabra("yo");
		Palabra p6 = new Palabra("soy");
		
		palabras.getLista_palabras().add(p1);
		palabras.getLista_palabras().add(p2);
		palabras.getLista_palabras().add(p3);
		palabras.getLista_palabras().add(p4);
		palabras.getLista_palabras().add(p5);
		palabras.getLista_palabras().add(p6);
	}

}
