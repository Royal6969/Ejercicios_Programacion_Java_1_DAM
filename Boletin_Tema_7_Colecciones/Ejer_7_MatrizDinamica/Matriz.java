package Ejer_7_MatrizDinamica;

import java.util.ArrayList;

public class Matriz {

	//ATRIBUTOS
	private ArrayList<Lista_Numeros> matriz = new ArrayList<Lista_Numeros>();
	private int nRow, nCol;
	
	//crear un constructor que solo tenga las filas y columnas
	public Matriz(int nRow, int nCol) {
		//super();
		this.nRow = nRow;
		this.nCol = nCol;
		
		for(int i=0; i<nRow; i++) {
			Lista_Numeros nums = new Lista_Numeros();
			
			for(int j=0; j<nCol; j++) {
				Numeros n = new Numeros(0);
				
				nums.getObjeto().add(n);
			}
			this.getMatriz().add(nums);
		}
	}

	//esto me lo va a decir JC
	public Matriz(int nRow, int nCol, int[][]matrizAUX) {
		//super();
		this.nRow = nRow;
		this.nCol = nCol;
		
		for(int i=0; i<nRow; i++) {
			Lista_Numeros nums = new Lista_Numeros();
			
			for(int j=0; j<nCol; j++) {
				Numeros n = new Numeros(matrizAUX[i][j]);
				
				nums.getObjeto().add(n);
			}
			this.getMatriz().add(nums);
		}
	}

	//GETTER y SETTER
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
	
	//Aqui no hay To String
	
	//METODOS
	public void sett(int fila, int columna, Numeros number) { //esto es el settear
		
		this.getMatriz().get(fila).getObjeto().set(columna, number);
	}
	public Numeros gett(int fila, int columna) {
		
		Numeros entero = this.getMatriz().get(fila).getObjeto().get(columna);
		
		return entero;
	}
	public void espejo() { //este método pone en orden inverso las filas
		
		int[][] aux = new int[nRow][nCol];
		int contador = 0;
		
		for(int i=0; i<nRow; i++) {
			for(int j=nCol-1; j>=0; j--) {
				aux[i][contador] = this.getMatriz().get(i).getObjeto().get(j).getNum();
				contador++;
			}
			contador = 0;
		}
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<nCol; j++) {
				Numeros a = new Numeros(aux[i][j]);
				
				this.getMatriz().get(i).getObjeto().set(j, a);
			}
		}
	}
	public void traspuesta() { //esto cambia las filas por columnas y viceversa
		
		int[][] aux = new int[nRow][nCol];
		
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<nCol; j++) {
				aux[j][i] = this.getMatriz().get(i).getObjeto().get(j).getNum();
			}
		}
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<nCol; j++) {
				Numeros a = new Numeros(aux[i][j]);
				
				this.getMatriz().get(i).getObjeto().set(j, a);
			}
		}
	}
	public void imprimir() {
		
		for(int i=0; i<nRow; i++) {
			for(int j=0; j<nCol; j++) {
				System.out.print(this.getMatriz().get(i).getObjeto().get(j).getNum());
			}
			System.out.println();
		}
	}
	
}
