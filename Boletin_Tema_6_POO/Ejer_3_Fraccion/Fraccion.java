package Ejer_3_Fraccion;

/*
3. Crea la clase Fracción . 
Los atributos serán numerador y denominador . 
Y algunos de los métodos pueden ser: invierte , simplifica , multiplica , divide , etc.
http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/estatico/fraccion/fraccion.htm
https://www.youtube.com/watch?v=QphiKKGkCsM&ab_channel=HiZTech
 */
	public class Fraccion {

	/*
	 Consideremos la clase que describe una fracción que denominaremos Fraccion. 
	 Consta de dos miembros ambos enteros, el numerador num, y del denominador den.
	 */
	//ATRIBUTOS//
	int numerador;
	int denominador;

//Definiremos dos constructores, 
//el constructor por defecto, que da al numerdor el valor cero, y al denominador el valor uno, 
//y el constructor explícito.
	
	//CONSTRUCTOR vacio//
	public Fraccion() {
		super();
		
		numerador = 0;
		denominador = 1;
	}

	//CONSTRUCTOR lleno
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
//Mas adelante, redefiniremos la función toString para obtener una representación en forma de texto de una fracción.
/*	//TO String//
	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
*/
	
	//METODOS//
	
//definir una función denominada sumar, que realice las operación de sumar dos fracciones. 
//Por tanto, la función sumar tendrá dos parámetros que son dos fracciones a y b,
//Para codificar la función plantearemos el procedimiento de sumar dos fracciones a y b, 
//cuyos numeradores son a.num y b.num, y cuyos denominadores son a.den y b.den, respectivamente. 
//El resultado se guarda en la fracción c.
	static Fraccion sumar(Fraccion a, Fraccion b){
	     Fraccion c = new Fraccion();
	     c.numerador = (a.numerador*b.denominador) + (b.numerador*a.denominador);
	     c.denominador = a.denominador*b.denominador;
	     return c;
	  }
	
	static Fraccion restar(Fraccion a, Fraccion b){
	     Fraccion c = new Fraccion();
	     c.numerador = (a.numerador*b.denominador)- (b.numerador*a.denominador);
	     c.denominador = a.denominador*b.denominador;
	     return c;
	  }

//Cuando se multiplican dos fracciones a y b, se obtiene otra fracción c cuyo numerador es el producto de los numeradores, 
//y cuyo denominador es el producto de sus denominadores respectivos.
	static Fraccion multiplicar(Fraccion a, Fraccion b){
	     Fraccion c = new Fraccion();
	     c.numerador = a.numerador*b.numerador;
	     c.denominador = a.denominador*b.denominador;
	     return c;
	  }

//La función inversa, recibe una fracción en su único argumento 
//y devuelve una fracción cuyo numerador es el denominador de la fracción argumento, 
//y cuyo denominador es el numerador de dicha fracción.
	static Fraccion inversa(Fraccion a){
	     return new Fraccion(a.denominador, a.numerador);
	  }
	
//Cuando se dividen dos fracciones a y b, se obtiene otra fracción c cuyo numerador 
//es el producto del numerador de la primera por del denominador de la segunda, 
//y cuyo denominador es el producto del denominador de la primera por el numerador de la segunda.
	static Fraccion dividir(Fraccion a, Fraccion b){
	     return new Fraccion(a.numerador*b.denominador, a.denominador*b.numerador);
	  }
//La operación división de dos fracciones es equivalente a multiplicar la fracción a por la inversa de b, 
//de este modo aprovechamos el código de la función inversa.
/*
	 Fraccion dividir(Fraccion a, Fraccion b){
	     return multiplicar(a, inversa(b));
	  }
*/
//Para simplificar una fracción primero hay que hallar el máximo común divisor del numerador y del denominador. 
//la función mcd se encarga de esta tarea. Para ello emplea el algoritmo de Euclides
//1. En la primera iteración, se halla el resto r de dividir el primero u entre el segundo v.  
//Se asigna a u el divisor v, y se asigna a v el resto r.
//2. En la segunda iteracción, se halla el resto r de dividir u entre v. Se asigna a u el divisor v, y se asigna a v el resto r.
//3. Se repite el proceso hasta que el resto r sea cero. El máximo común divisor será el último valor de v.
	
//Definimos en la clase Fraccion una función mcd que calcula y devuelve el máximo común divisor del numerador y del denominador.
	int mcd(){
	     int u=Math.abs(numerador);
	     int v=Math.abs(denominador);
	     if(v==0){
	          return u;
	     }
	     int r;
	     while(v!=0){
	          r=u%v;
	          u=v;
	          v=r;
	     }
	     return u;
	  }

//A continuación definimos la función simplificar, de modo que al aplicarlo sobre una fracción, 
//dicha fracción se reduzca a la fracción equivalente más simple. 
//Para ello, se divide numerador y denominador por el máximo común divisor de ambos números, 
//y devuelve la fracción simplificada.
	Fraccion simplificar(){
	     int dividir = mcd();
	     numerador /= dividir;
	     denominador /= dividir;
	     return this;
	  }
//Los miembros dato cambian al dividirlos entre el máximo común divisor y la función devuelve el objeto actual, this.

	
	@Override
	public String toString() {
		return numerador+" / "+denominador;
	}
//En la definición de toString vemos que el operador + se usa para concatenar strings 
//(el lenguaje Java convierte automáticamente un dato primitivo en su representación textual cuando se concatena con un string).
//La redefinición de la función toString devuelve un string un objeto de la clase String 
//que guarda la representación en forma de texto de los objetos de una determinada clase. 
//De este modo, una clase que redefina toString puede emplearse en cualquier ámbito.
}
