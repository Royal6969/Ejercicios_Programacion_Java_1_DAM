package Proyecto_Fichero_Binario;

import java.io.*;
import java.util.*;


public class Prueba_Alumno {

	static char opcion;
	static boolean hechoB = false;
	static boolean hechoC = false;
	
	static ArrayList<Alumno> listAlumnos = new ArrayList<Alumno>();
	
	public static void main(String[] args) {

		while (opcion != 'g') {
			menu();
		}
	}
	
	public static void menu() {
		Scanner s=new Scanner(System.in);
		char opc;
		
		System.out.println("Ficheros de notas de alumnos.");
		System.out.println("-----------------------------------------");
		System.out.println("a) Listar los tres ficheros con las notas de los alumnos");
		System.out.println("b) Listar datos de alumnos antes de las recuperaciones ordenado por apellidos y nombre.");
		System.out.println("c) Listar media de los alumnos ordenado por media.");
		System.out.println("d) Listar los tres ficheros con las notas del examen de recuperación");
		System.out.println("e) Listar alumn.dat post recuperaciones ordenado por apellidos y nombre");
		System.out.println("f) Añadir alumnos con baja medica y listar notas y media.");
		System.out.println("g) Salir del programa");
		System.out.print("Introduce una de las opciones: ");
		
		String opt = s.next();
		opcion = opt.charAt(0);
		
		switch(opcion) {
		case 'a':
			ej1();
			break;
		case 'b':
			ej2();
			break;
		case 'c':
			if (hechoB == false) {
				System.out.println("Tienes que ejecutar la opcion 'b' anteriormente");
			}
			else {ej3();}
			break;
		case 'd':
			ej4();
			break;
		case 'e':
			if (hechoB == false) {
				System.out.println("Tienes que ejecutar la opcion 'b' anteriormente");
			}
			else {ej5();}
			break;
		case 'f':
			if(hechoB==false || hechoC ==false) {
				System.out.println("Tienes que ejecutar la opcion 'b' y 'c' anteriormente");
			}
			else {anexo();}
			break;
		case 'g':
			System.out.println("Has salido del programa exitosamente.");
			break;
		default:
			System.out.println("Introduce una de las letras anteriormente mencionadas.");
			break;
		}
	}
	
	public static void ej1() {
		try {
			
			//Mostramos fichero a fichero
			File fichero = new File("prog.txt");
			FileReader fr1 = new FileReader(fichero);
			BufferedReader br1 = new BufferedReader(fr1);
			String linea = br1.readLine();
			
			
			System.out.println("Fichero de programación: ");
			while (linea != null) {
				System.out.println(linea);
				linea = br1.readLine();
			}
			System.out.println(" ");
			br1.close();
			
			File fichero2 = new File("lm.txt");
			FileReader fr2 = new FileReader(fichero2);
			BufferedReader br2 = new BufferedReader(fr2);
			linea = br2.readLine();
			
		
			System.out.println("Fichero de lenguaje de marcas: ");
			while (linea != null) {
				System.out.println(linea);
				linea = br2.readLine();
			}
			System.out.println(" ");
			br2.close();
			
			
			File fichero3 = new File("bd.txt");
			FileReader fr3 = new FileReader(fichero3);
			BufferedReader br3 = new BufferedReader(fr3);
			linea = br3.readLine();
			
			
			System.out.println("Fichero de base de datos: ");
			while (linea != null) {
				System.out.println(linea);
				linea = br3.readLine();
			}
			System.out.println(" ");
			br3.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	public static void ej2() {
		try {
			listAlumnos.clear();
			
			//Programacion
			File fichero = new File("prog.txt");
			FileReader fr1 = new FileReader(fichero);
			BufferedReader br1 = new BufferedReader(fr1);
			
			String linea = br1.readLine();
			while (linea != null) {
				String[] datos = linea.split(",");
				//Siempre inicializamosalumnos en el primer fichero, ya que el array esta vacio,
				// por lo que todos los alumnos del fichero deben de ser inicializados
				inicializaralumno(datos, 0);
				linea = br1.readLine();
			} 
			br1.close();
			
			//Lenguaje de marcas
			File fichero2 = new File("lm.txt");
			FileReader fr2 = new FileReader(fichero2);
			BufferedReader br2 = new BufferedReader(fr2);
			
			linea = br2.readLine();
			while (linea != null) {
				String[] datos = linea.split(",");
				boolean enc = false;
				//Buscamos dentro del array si el nombre y apellido coincide con el del fichero, si coincide se actualiza su nota y si no coincide
				//se inicializa el alumno.
				for(int i = 0; i<listAlumnos.size(); i++) {
					if(datos[0].equalsIgnoreCase(listAlumnos.get(i).getNombre() + " " + listAlumnos.get(i).getApe())) {
						listAlumnos.get(i).setNota2(Integer.parseInt(datos[1]));
						enc = true;
					}
				}
				if(!enc) {
					inicializaralumno(datos, 1);
				}
				
				linea = br2.readLine();
			}
			br2.close();
			
			//Base de datos
			File fichero3 = new File("bd.txt");
			FileReader fr3 = new FileReader(fichero3);
			BufferedReader br3 = new BufferedReader(fr3);
			
			linea = br3.readLine();
			while (linea != null) {
				String[] datos = linea.split(",");
				boolean enc = false;
				
				//Idem que el anterior pero con el ultimo fichero.
				for(int i = 0; i<listAlumnos.size(); i++) {
					if(datos[0].equalsIgnoreCase(listAlumnos.get(i).getNombre() + " " + listAlumnos.get(i).getApe())) {
						listAlumnos.get(i).setNota3(Integer.parseInt(datos[1]));
						enc = true;
					}
				}
				if(!enc) {
					inicializaralumno(datos, 2);
				}
				
				linea = br3.readLine();
			}
			br3.close();
			
			//Ordenamos el arrayList antes de pasar al archivo.dat
			Collections.sort(listAlumnos, new NomApe_Comparator());
			
			
			
			FileOutputStream fos = new FileOutputStream("alumn.dat");
			ObjectOutputStream salida = new ObjectOutputStream(fos);
				
			for(int i = 0; i<listAlumnos.size(); i++) {
				salida.writeObject(listAlumnos.get(i)); 
			}
			salida.close();
			
			
			FileInputStream fis = new FileInputStream("alumn.dat");
			ObjectInputStream entrada = new ObjectInputStream(fis);
			
			
			
			Alumno a = (Alumno)entrada.readObject();
			while (a!=null) {
				System.out.println(a.toString());
				a = (Alumno)entrada.readObject();
			}
			entrada.close();
		}
		catch(EOFException e) {
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		hechoB = true;
	}	
	
	public static void inicializaralumno(String[] datos, int posicion) {
		//Rellenamos las notas con -99 ya que algunos alumnos no tienen todas las asignaturas
		//y luego hacemos set de la nota que hemos pasado para actualizarla.
		String[] nombre = datos[0].split(" ");
		Alumno a = new Alumno(nombre[0], nombre[1],-99,-99,-99);
		if(posicion==0) {
			a.setNota1(Integer.parseInt(datos[1]));
		}
		if(posicion==1) {
			a.setNota2(Integer.parseInt(datos[1]));
		}
		if(posicion==2) {
			a.setNota3(Integer.parseInt(datos[1]));
		}
		listAlumnos.add(a);
	}	
	
	public static void ej3() {
		ArrayList<Alumno_Media> listamed = new ArrayList<Alumno_Media>();
		
		try {
			
			FileInputStream fis = new FileInputStream("alumn.dat");
			ObjectInputStream entrada = new ObjectInputStream(fis);
			
			
			FileOutputStream fos = new FileOutputStream("media.dat");
			ObjectOutputStream salida = new ObjectOutputStream(fos);
			
			
			
			Alumno a = (Alumno)entrada.readObject();
			Alumno_Media am = new Alumno_Media();
				while (a!=null) {
					int cont = 0;
					int suma = 0;
					//Recorremos las notas de cada alumno, ignorando los -99 para que no cuenten para la media
						if (a.getNota1() != -99) {
							suma = suma + a.getNota1();
							cont++;
						}
						if (a.getNota2() !=-99) {
							suma=suma + a.getNota2();
							cont++;
						}
						if(a.getNota3()!=-99) {
							suma=suma + a.getNota3();
							cont++;
						}
				
					int media = suma/cont;
					am = new Alumno_Media(a.getNombre(), a.getApe(), media);
					//Si la media supera el 5, limpiamos las notas y dejamos la media puesta.
					if (media >= 5) {
						
						listamed.add(am);
						salida.writeObject(am);
				}
				
					//Escribimos al alumno en el media.dat
				a = (Alumno)entrada.readObject();
			}
			
			entrada.close();
			salida.close();
		}
		catch(EOFException e) {
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Ordenamos el array con los alumnos para luego mostrarlos.
		Collections.sort(listamed, new Media_Comparator());
		for (int i = 0; i<listamed.size(); i++) {
			System.out.println(listamed.get(i));
		}
		
		hechoC=true;
		
	}	
	
	public static void ej4() {
			
			try {
				
				//Mostramos los ficheros de recuperacion.
				File rec1 = new File("Rprog.txt");
				FileReader fr = new FileReader(rec1);
				BufferedReader br = new BufferedReader(fr);
				String linea=br.readLine();
				
				System.out.println("Recuperacion de Programación.");
				while(linea!=null) {
					System.out.println(linea);
					linea = br.readLine();
				}
				System.out.println(" ");
		
				
				File rec2 =new File("Rlm.txt");
				FileReader fr2 = new FileReader(rec2);
				BufferedReader br2 = new BufferedReader(fr2);
				
				linea=br2.readLine();
				
				System.out.println("Recuperacion de Lenguaje de Marcas.");
				while(linea!=null) {
					System.out.println(linea);
					linea = br2.readLine();
				}
				System.out.println(" ");
				
				File rec3 = new File("Rbd.txt");
				FileReader fr3 = new FileReader(rec3);
				BufferedReader br3 = new BufferedReader(fr3);
				
				linea=br3.readLine();
				
				System.out.println("Recuperacion de Programación.");
				while(linea!=null) {
					System.out.println(linea);
					linea = br3.readLine();
				}
				System.out.println(" ");
				
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	
	
	public static void ej5() {
		ArrayList<Alumno> auxrecup = new ArrayList<Alumno>();
		auxrecup=listAlumnos;
		try {	
			//Recuperacion de programacion
			File rec1 = new File("Rprog.txt");
			FileReader fr1 = new FileReader(rec1);
			BufferedReader br1 = new BufferedReader(fr1);
			String linea = br1.readLine();
			
			while (linea != null) {
				String[] datos = linea.split(",");
				for(int i=0;i<auxrecup.size();i++) {
					if(datos[0].equalsIgnoreCase(auxrecup.get(i).getNombre() + " " + auxrecup.get(i).getApe())) {
						auxrecup.get(i).setNota1(Integer.parseInt(datos[1]));
					}
				}
				linea = br1.readLine();
			}
			br1.close();		
			
			
			//Recuperacion de lenguaje de marcas
			File rec2 =new File("Rlm.txt");
			FileReader fr2 = new FileReader(rec2);
			BufferedReader br2 = new BufferedReader(fr2);
			linea = br2.readLine();
			
			while (linea != null) {
				String[] datos = linea.split(",");
				for(int i=0;i<auxrecup.size();i++) {
					if(datos[0].equalsIgnoreCase(auxrecup.get(i).getNombre() + " " + auxrecup.get(i).getApe())) {
						auxrecup.get(i).setNota2(Integer.parseInt(datos[1]));
					}
				}
				linea = br2.readLine();
			}
			br2.close();
			
			
			
			//Recuperacion base de datos
			File rec3 = new File("Rbd.txt");
			FileReader fr3 = new FileReader(rec3);
			BufferedReader br3 = new BufferedReader(fr3);
			linea = br3.readLine();
			
			while (linea != null) {
				String[] datos = linea.split(",");
				for(int i=0;i<auxrecup.size();i++) {
					if(datos[0].equalsIgnoreCase(auxrecup.get(i).getNombre() + " " + auxrecup.get(i).getApe())) {
						auxrecup.get(i).setNota3(Integer.parseInt(datos[1]));
					}
				}
				linea = br3.readLine();
			}
			br3.close();
			
			
			
			FileOutputStream fos = new FileOutputStream("alumn.dat");
			ObjectOutputStream salida = new ObjectOutputStream(fos);
			
			for(int i = 0; i<auxrecup.size(); i++) {
				salida.writeObject(auxrecup.get(i)); 
			}
			salida.close();
			
			
			FileInputStream fis2 = new FileInputStream("alumn.dat");
			ObjectInputStream entrada2 = new ObjectInputStream(fis2);
			
			Alumno a = (Alumno)entrada2.readObject();
			while (a!=null) {
				System.out.println(a.toString());
				a = (Alumno)entrada2.readObject();
			}
			entrada2.close();
			
			
		}
		catch(EOFException e) {
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
		
	
	public static void anexo() {
		ArrayList<Alumno> bajamed = añadirBaja();
		
		try {
			MiObjectOutputStream salida = new MiObjectOutputStream(new FileOutputStream("alumn.dat",true));
			for(int i=0;i<bajamed.size();i++) { 
				salida.writeObject(bajamed.get(i));
			}salida.close();
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		imprimirFicheroBinario("alumn.dat");
		imprimirMediaAnexo();
	}
	
	public static ArrayList<Alumno> añadirBaja() {
		ArrayList<Alumno> baja = new ArrayList<Alumno>();
		Alumno a1=new Alumno("Alejandro","Ortiz",6,4,5);
		Alumno a2=new Alumno("Lola","Cabañas",5,7,8);
		Alumno a3=new Alumno("Paloma", "Gomez",4,4,5);
		Alumno a4=new Alumno("Ismael","Gutierrez",7,6,8);
		Alumno a5=new Alumno("Claudia","Huertas",4,6,3);
		
		baja.add(a1);
		baja.add(a2);
		baja.add(a3);
		baja.add(a4);
		baja.add(a5);
		return baja;
	}
	
	public static void imprimirFicheroBinario(String nomFile) {
		try {
			ObjectInputStream salida= new ObjectInputStream(new FileInputStream(nomFile));
			
			Alumno a=(Alumno) salida.readObject();
			if(nomFile.equalsIgnoreCase("media.dat")) {
				while(a!=null) {
					System.out.println(a.toString());
					a=(Alumno) salida.readObject();
				}
			}else {
				while(a!=null) {
					System.out.println(a.toString());
					a=(Alumno) salida.readObject();
				}
			}
			salida.close();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void imprimirMediaAnexo() {
		ArrayList<Alumno_Media> listamed = new ArrayList<Alumno_Media>();
		
		try {
			
			FileInputStream fis = new FileInputStream("alumn.dat");
			ObjectInputStream entrada = new ObjectInputStream(fis);
			
			
			FileOutputStream fos = new FileOutputStream("media.dat");
			ObjectOutputStream salida = new ObjectOutputStream(fos);
			
			
			
			Alumno a = (Alumno)entrada.readObject();
			Alumno_Media am = new Alumno_Media();
				while (a!=null) {
					int cont = 0;
					int suma = 0;
					//Recorremos las notas de cada alumno, ignorando los -99 para que no cuenten para la media
						if (a.getNota1() != -99) {
							suma = suma + a.getNota1();
							cont++;
						}
						if (a.getNota2() !=-99) {
							suma=suma + a.getNota2();
							cont++;
						}
						if(a.getNota3()!=-99) {
							suma=suma + a.getNota3();
							cont++;
						}
				
					int media = suma/cont;
					am = new Alumno_Media(a.getNombre(),a.getApe(),media);
					//Si la media supera el 5, limpiamos las notas y dejamos la media puesta.
					if (media >= 5) {
						
						listamed.add(am);
						salida.writeObject(am);
				}
				
					//Escribimos al alumno en el media.dat
				a = (Alumno)entrada.readObject();
			}
			
			entrada.close();
			salida.close();
		}
		catch(EOFException e) {
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	     //No ordeno en este metodo al mostrar para que se vea que el append funciona (alguno de los alumnos se omiten porque la media no es mayor a 5)
		for (int i = 0; i<listamed.size(); i++) {
			System.out.println(listamed.get(i));
		}
	}

	
}
