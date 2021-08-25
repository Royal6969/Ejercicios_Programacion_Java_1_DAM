package Ejer_3_Fraccion;

/*
3. Crea la clase Fracci�n . 
Los atributos ser�n numerador y denominador . 
Y algunos de los m�todos pueden ser: invierte , simplifica , multiplica , divide , etc.
http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/estatico/fraccion/fraccion.htm
https://www.youtube.com/watch?v=QphiKKGkCsM&ab_channel=HiZTech
 */
	public class Fraccion {

	/*
	 Consideremos la clase que describe una fracci�n que denominaremos Fraccion. 
	 Consta de dos miembros ambos enteros, el numerador num, y del denominador den.
	 */
	//ATRIBUTOS//
	int numerador;
	int denominador;

//Definiremos dos constructores, 
//el constructor por defecto, que da al numerdor el valor cero, y al denominador el valor uno, 
//y el constructor expl�cito.
	
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
//Mas adelante, redefiniremos la funci�n toString para obtener una representaci�n en forma de texto de una fracci�n.
/*	//TO String//
	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
*/
	
	//METODOS//
	
//definir una funci�n denominada sumar, que realice las operaci�n de sumar dos fracciones. 
//Por tanto, la funci�n sumar tendr� dos par�metros que son dos fracciones a y b,
//Para codificar la funci�n plantearemos el procedimiento de sumar dos fracciones a y b, 
//cuyos numeradores son a.num y b.num, y cuyos denominadores son a.den y b.den, respectivamente. 
//El resultado se guarda en la fracci�n c.
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

//Cuando se multiplican dos fracciones a y b, se obtiene otra fracci�n c cuyo numerador es el producto de los numeradores, 
//y cuyo denominador es el producto de sus denominadores respectivos.
	static Fraccion multiplicar(Fraccion a, Fraccion b){
	     Fraccion c = new Fraccion();
	     c.numerador = a.numerador*b.numerador;
	     c.denominador = a.denominador*b.denominador;
	     return c;
	  }

//La funci�n inversa, recibe una fracci�n en su �nico argumento 
//y devuelve una fracci�n cuyo numerador es el denominador de la fracci�n argumento, 
//y cuyo denominador es el numerador de dicha fracci�n.
	static Fraccion inversa(Fraccion a){
	     return new Fraccion(a.denominador, a.numerador);
	  }
	
//Cuando se dividen dos fracciones a y b, se obtiene otra fracci�n c cuyo numerador 
//es el producto del numerador de la primera por del denominador de la segunda, 
//y cuyo denominador es el producto del denominador de la primera por el numerador de la segunda.
	static Fraccion dividir(Fraccion a, Fraccion b){
	     return new Fraccion(a.numerador*b.denominador, a.denominador*b.numerador);
	  }
//La operaci�n divisi�n de dos fracciones es equivalente a multiplicar la fracci�n a por la inversa de b, 
//de este modo aprovechamos el c�digo de la funci�n inversa.
/*
	 Fraccion dividir(Fraccion a, Fraccion b){
	     return multiplicar(a, inversa(b));
	  }
*/
//Para simplificar una fracci�n primero hay que hallar el m�ximo com�n divisor del numerador y del denominador. 
//la funci�n mcd se encarga de esta tarea. Para ello emplea el algoritmo de Euclides
//1. En la primera iteraci�n, se halla el resto r de dividir el primero u entre el segundo v.  
//Se asigna a u el divisor v, y se asigna a v el resto r.
//2. En la segunda iteracci�n, se halla el resto r de dividir u entre v. Se asigna a u el divisor v, y se asigna a v el resto r.
//3. Se repite el proceso hasta que el resto r sea cero. El m�ximo com�n divisor ser� el �ltimo valor de v.
	
//Definimos en la clase Fraccion una funci�n mcd que calcula y devuelve el m�ximo com�n divisor del numerador y del denominador.
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

//A continuaci�n definimos la funci�n simplificar, de modo que al aplicarlo sobre una fracci�n, 
//dicha fracci�n se reduzca a la fracci�n equivalente m�s simple. 
//Para ello, se divide numerador y denominador por el m�ximo com�n divisor de ambos n�meros, 
//y devuelve la fracci�n simplificada.
	Fraccion simplificar(){
	     int dividir = mcd();
	     numerador /= dividir;
	     denominador /= dividir;
	     return this;
	  }
//Los miembros dato cambian al dividirlos entre el m�ximo com�n divisor y la funci�n devuelve el objeto actual, this.

	
	@Override
	public String toString() {
		return numerador+" / "+denominador;
	}
//En la definici�n de toString vemos que el operador + se usa para concatenar strings 
//(el lenguaje Java convierte autom�ticamente un dato primitivo en su representaci�n textual cuando se concatena con un string).
//La redefinici�n de la funci�n toString devuelve un string un objeto de la clase String 
//que guarda la representaci�n en forma de texto de los objetos de una determinada clase. 
//De este modo, una clase que redefina toString puede emplearse en cualquier �mbito.
}
