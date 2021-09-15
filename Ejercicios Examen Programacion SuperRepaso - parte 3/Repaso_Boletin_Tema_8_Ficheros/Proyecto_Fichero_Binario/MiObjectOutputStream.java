package Proyecto_Fichero_Binario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {

	protected void writeStreamHeader() throws IOException{
		//No hace nada para que no lea la cabecera.
	}

	public MiObjectOutputStream() throws IOException{
		super();
	}
	
	
	public MiObjectOutputStream(OutputStream out) throws IOException{
		super(out);
	}
	
	
}