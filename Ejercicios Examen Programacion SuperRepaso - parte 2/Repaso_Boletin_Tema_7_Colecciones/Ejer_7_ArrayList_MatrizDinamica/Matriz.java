package Ejer_7_ArrayList_MatrizDinamica;

import java.util.ArrayList;

public class Matriz {

	//a. Un atributo m que es un array de ArrayList, de forma que su primer elemento
	//(coincidiría con m[0]) contendrá un ArrayList con la primera fila de la matriz; 
	//su segundo elemento contendrá un ArrayList con la segunda fila de la matriz; y así sucesivamente.
	//ATRIBUTOS
	private ArrayList<Lista_Numeros> matriz = new ArrayList<Lista_Numeros>();
	
	//b. Dos atributos más con el número de filas y el número de columnas de la matriz.
	private int nRow, nCol;

	//c. Un constructor que reciba dos parámetros: el número de filas y el número de columnas, 
	//e inicialice m con elementos de tipo Elemento de valor cero.
	public Matriz(int nRow, int nCol) { //le he dao al constructor lleno y le he quitado el parametro de la matriz
		//super(); //por qué le quito el super?
		//this.matriz = matriz; //tmb le he quitado el "this.matriz" ya que quité antes su parámetro
		this.nRow = nRow;
		this.nCol = nCol;
		
		for(int i=0; i<nRow; i++) { //1º creamos tantas filas como se indiquen
			Lista_Numeros nums = new Lista_Numeros(); //creamos un objeto "nums" de la clase Lista_Numeros
			for(int j=0; j<nCol; j++) { //2º creamos tantas columnas como posiciones haya en "nums"
				Numero num = new Numero(0); //inicializamos los numeros de la fila con un 0
				nums.getLista_numeros().add(num); //añadimos el num que acabábamos de crear a la Lista_Numeros de "nums"
			}
			this.matriz.add(nums); //por qué aquí no me ha salido el getMatriz ?? //añadimos las filas de "nums" a la matriz 
		}
	}

	//d. Otro constructor que reciba tres parámetros: el número de filas, el número de columnas 
	//y un array bidimensional de tipo int, que contendrá los valores iniciales de la matriz.
	public Matriz(int nRow, int nCol, int[][]matrizAux) { //le he dao al constructor lleno y le he quitado el parametro de la matriz
		//super(); //por qué le quito el super?
		//this.matriz = matriz; //tmb le he quitado el "this.matriz" ya que quité antes su parámetro
		this.nRow = nRow;
		this.nCol = nCol;
		
		for(int i=0; i<nRow; i++) {
			Lista_Numeros nums = new Lista_Numeros(); //creamos un objeto "nums" de la clase Lista_Numero
			for(int j=0; j<nCol; j++) { //2º creamos tantas columnas como posiciones haya en "nums"
				Numero num = new Numero(matrizAux[i][j]); //inicializamos los valores iniciales de la matrizAux
				nums.getLista_numeros().add(num); //añadimos el num que acabábamos de crear a la Lista_Numeros de "nums"
			}
			this.matriz.add(nums); //por qué aquí no me ha salido el getMatriz ?? //añadimos las filas de "nums" a la matriz 
		}
	}

	//aquí ya vendrían los GETTER Y SETTER
	public ArrayList<Lista_Numeros> getMatriz() {
		return matriz;
	}

	public void setMatriz(ArrayList<Lista_Numeros> matriz) {
		this.matriz = matriz;
	}

	public int getnRow() {
		return nRow;
	}

	public void setnRow(int nRow) {
		this.nRow = nRow;
	}

	public int getnCol() {
		return nCol;
	}

	public void setnCol(int nCol) {
		this.nCol = nCol;
	}
	
	//¿por qué no hay To String aquí?
	
	//MÉTODOS
	
	//e. Un método set que reciba una fila, una columna y un Elemento 
	//y modifique el valor correspondiente a esa fila y columna con el argumento Elemento.
	//Utilice para ello el método set de la interfaz List.
	public void set_v2 (int nRow, int nCol, Numero num) {
		this.getMatriz().get(nRow).getLista_numeros().set(nCol, num);
	}
	
	//f. Un método get que reciba dos argumentos de tipo int 
	//y devuelva el Elemento que está en la posición indicada.
	public Numero get_v2 (int nRow, int nCol) { //se le está dando una coordenada
		
		Numero num = this.getMatriz().get(nRow).getLista_numeros().get(nCol);
		
		return num;
	}
	//g. Un método denominado espejo de tal manera que el objeto que invoca se modifique, 
	//devolviendo una matriz con su imagen especular:
		//-1 2 3 7 7 3 2 -1
		//7 8 8 1 1 8 8 7
	//en otras palabras, poner en orden inverso las filas
	public void espejo () {
		int[][]aux = new int[nRow][nCol]; // creamos una matriz auxiliar igual que la principal
		int posicion = 0;
		
		for(int i=0; i<nRow; i++) { //se recorren las filas normales
			for(int j=nCol-1; j>=0; j--) { //se recorren las columnas al revés
				aux[i][posicion] = this.getMatriz().get(i).getLista_numeros().get(j).getNum(); //¿que hace exactamente esto?
				posicion ++;
			}
			posicion = 0;
		}
		for(int i=0; i<nRow; i++) { //no entiendo nadaaaaa
			for(int j=0; j<nCol; j++) {
				Numero n = new Numero(aux[i][j]);
				this.getMatriz().get(i).getLista_numeros().set(j, n);
			}
		}
	}
	//h. Un método denominado trasponer que hace que el objeto que invoca se modifique, 
	//devolviendo una matriz traspuesta: cambiar filas por columnas
	public void traspuesta () {
		int[][] aux = new int[nRow][nCol]; //volvemos a crear una matrzi auxiliar
		
		for(int i=0; i<nRow; i++){ //recorrer el número de filas 
			for(int j=0; j<nCol; j++) { //recorrer el número columnas 
				aux[j][i] = this.getMatriz().get(i).getLista_numeros().get(j).getNum(); //por que no se coge el nRow/nCol??
			}
		}
		for(int i=0; i<nRow; i++) { //no entiendo estoo
			for(int j=0; j<nCol; j++) {
				Numero n = new Numero(aux[i][j]);
				
				this.getMatriz().get(i).getLista_numeros().set(j, n);
			}
		}
	}
	//imprimir
	public void imprimir () {
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<nCol; j++) {
				System.out.print(this.getMatriz().get(i).getLista_numeros().get(j).getNum());
			}
			System.out.println();
		}
	}
}
