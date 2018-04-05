package ficheroLogTxt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FicheroLogTxt {

	private static final Logger logger = LoggerFactory.getLogger(FicheroLogTxt.class);
	
	public static void main(String[] args) {
	
		
		FileWriter file = null;
		PrintWriter pw = null;
		File fichero = null;
		
		logger.info("Iniciando...");
		String nombreFichero = "log.txt";
		
		fichero = new File (nombreFichero);
		
		if (fichero.exists()) {
			//Si existe escribe la traza exise y hay que modificar
			logger.info("El fichero existe, modificando fichero...");
			
		}else {
			//Sino, hay que crearlo				
			logger.info("Creando el fichero...");
			
		}
		
		try {			
			
			file = new FileWriter (nombreFichero,true);
			pw = new PrintWriter (file);
			
			pw.println("¿Qué es poesía? Dices mientras clavas");
			pw.println("en mi pupila tu pupila azul;");
			pw.println("¿Qué es poesía..? ¿Y tú me lo preguntas?");
			pw.println("¡Poesía...eres tú!");
					
			pw.close();
			
			logger.info("Escribiendo en el fichero");
			
		} catch (IOException e) {
			System.out.println("Ha habido un error");
			e.printStackTrace();
			pw.close();
		}
		
		System.out.println("");
		logger.info("Escritura terminada");		
		

	}

}

