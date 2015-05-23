package Principal;

import java.io.File;
import java.io.IOException;

public class Speak {
	
	private String pathAbsoluto = path();  
	private String[] directorios;
	private String voz = "es";
	
	public void setVoz(String voz) {
		this.voz = voz;
	}

	private String path(){
		StringBuilder comando = new StringBuilder("");
		pathAbsoluto = new File ("").getAbsolutePath(); //ME GUARDO EL PATH ABSOLUTO DE DONDE SE ESTA EJECUTANDO LA APLICACION
		directorios = pathAbsoluto.split("\\\\");		//SEPARO CADA CARPETA DEL ARBOL SUPERIOR
		for (int i=0;i<directorios.length;i++){   		//CONCATENO CADA CARPETA DEL ARBOL SUPERIOR CON \\ PARA PODER USARLO EN .exec
			comando.append(directorios[i]);
			comando.append("\\\\");
		}
		return comando.toString();
	}
	
	public void eSpeak(String txt){
		String[] oracion = txt.split(".");
		String[] palabras = oracion[oracion.length-1].split(" ");
		try {
			for(int i=0 ; i<palabras.length ; i++){
				Runtime.getRuntime().exec(pathAbsoluto + "eSpeak\\command_line\\espeak -v" + voz + " " + palabras[i]);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
