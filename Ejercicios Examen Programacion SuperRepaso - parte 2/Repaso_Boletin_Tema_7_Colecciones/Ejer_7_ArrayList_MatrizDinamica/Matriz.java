package Ejer_7_ArrayList_MatrizDinamica;

import java.util.ArrayList;

public class Matriz {

	//a. Un atributo m que es un array de ArrayList, de forma que su primer elemento
	//(coincidir�a con m[0]) contendr� un ArrayList con la primera fila de la matriz; 
	//su segundo elemento contendr� un ArrayList con la segunda fila de la matriz; y as� sucesivamente.
	//ATRIBUTOS
	private ArrayList<Lista_Numeros> matriz = new ArrayList<Lista_Numeros>();
	
	//b. Dos atributos m�s con el n�mero de filas y el n�mero de columnas de la matriz.
	private int nRow, nCol;

	//c. Un constructor que reciba dos par�metros: el n�mero de filas y el n�mero de columnas, 
	//e inicialice m con elementos de tipo Elemento de valor cero.
	public Matriz(int nRow, int nCol) { //le he dao al constructor lleno y le he quitado el parametro de la matriz
		//super(); //por qu� le quito el super?
		//this.matriz = matriz; //tmb le he quitado el "this.matriz" ya que quit� antes su par�metro
		this.nRow = nRow;
		this.nCol = nCol;
		
		for(int i=0; i<nRow; i++) { //1� creamos tantas filas como se indiquen
			Lista_Numeros nums = new Lista_Numeros(); //creamos un objeto "nums" de la clase Lista_Numeros
			for(int j=0; j<nCol; j++) { //2� creamos tantas columnas como posiciones haya en "nums"
				Numero num = new Numero(0); //inicializamos los numeros de la fila con un 0
				nums.getLista_numeros().add(num); //a�adimos el num que acab�bamos de crear a la Lista_Numeros de "nums"
			}
			this.matriz.add(nums); //por qu� aqu� no me ha salido el getMatriz ?? //a�adimos las filas de "nums" a la matriz 
		}
	}

	//d. Otro constructor que reciba tres par�metros: el n�mero de filas, el n�mero de columnas 
	//y un array bidimensional de tipo int, que contendr� los valores iniciales de la matriz.
	public Matriz(int nRow, int nCol, int[][]matrizAux) { //le he dao al constructor lleno y le he quitado el parametro de la matriz
		//super(); //por qu� le quito el super?
		//this.matriz = matriz; //tmb le he quitado el "this.matriz" ya que quit� antes su par�metro
		this.nRow = nRow;
		this.nCol = nCol;
		
		for(int i=0; i<nRow; i++) {
			Lista_Numeros nums = new Lista_Numeros(); //creamos un objeto "nums" de la clase Lista_Numero
			for(int j=0; j<nCol; j++) { //2� creamos tantas columnas como posiciones haya en "nums"
				Numero num = new Numero(matrizAux[i][j]); //inicializamos los valores iniciales de la matrizAux
				nums.getLista_numeros().add(num); //a�adimos el num que acab�bamos de crear a la Lista_Numeros de "nums"
			}
			this.matriz.add(nums); //por qu� aqu� no me ha salido el getMatriz ?? //a�adimos las filas de "nums" a la matriz 
		}
	}

	//aqu� ya vendr�an los GETTER Y SETTER
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
	
	//�por qu� no hay To String aqu�?
	
	//M�TODOS
	
	//e. Un m�todo set que reciba una fila, una columna y un Elemento 
	//y modifique el valor correspondiente a esa fila y columna con el argumento Elemento.
	//Utilice para ello el m�todo set de la interfaz List.
	public void set_v2 (int nRow, int nCol, Numero num) {
		this.getMatriz().get(nRow).getLista_numeros().set(nCol, num);
	}
	
	//f. Un m�todo get que reciba dos argumentos de tipo int 
	//y devuelva el Elemento que est� en la posici�n indicada.
	public Numero get_v2 (int nRow, int nCol) { //se le est� dando una coordenada
		
		Numero num = this.getMatriz().get(nRow).getLista_numeros().get(nCol);
		
		return num;
	}
	//g. Un m�todo denominado espejo de tal manera que el objeto que invoca se modifique, 
	//devolviendo una matriz con su imagen especular:
		//-1 2 3 7 7 3 2 -1
		//7 8 8 1 1 8 8 7
	//en otras palabras, poner en orden inverso las filas
	public void espejo () {
		int[][]aux = new int[nRow][nCol]; // creamos una matriz auxiliar igual que la principal
		int posicion = 0;
		
		for(int i=0; i<nRow; i++) { //se recorren las filas normales
			for(int j=nCol-1; j>=0; j--) { //se recorren las columnas al rev�s
				aux[i][posicion] = this.getMatriz().get(i).getLista_numeros().get(j).getNum(); //�que hace exactamente esto?
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
	//h. Un m�todo denominado trasponer que hace que el objeto que invoca se modifique, 
	//devolviendo una matriz traspuesta: cambiar filas por columnas
	public void traspuesta () {
		int[][] aux = new int[nRow][nCol]; //volvemos a crear una matrzi auxiliar
		
		for(int i=0; i<nRow; i++){ //recorrer el n�mero de filas 
			for(int j=0; j<nCol; j++) { //recorrer el n�mero columnas 
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
