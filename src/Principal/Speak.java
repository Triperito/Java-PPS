package Principal;

import java.io.File;
import java.io.IOException;

public class Speak {

	private static String pathAbsoluto = path();  
	private static String[] directorios;

	private static String voz = "mb-es1+m6";

	public static void setVoz(String vozElegida) {
		voz = vozElegida;
	}

	public static String path(){
		StringBuilder comando = new StringBuilder("");
		pathAbsoluto = new File ("").getAbsolutePath(); //ME GUARDO EL PATH ABSOLUTO DE DONDE SE ESTA EJECUTANDO LA APLICACION
		directorios = pathAbsoluto.split("\\\\");		//SEPARO CADA CARPETA DEL ARBOL SUPERIOR
		for (int i=0;i<directorios.length;i++){   		//CONCATENO CADA CARPETA DEL ARBOL SUPERIOR CON \\ PARA PODER USARLO EN .exec
			comando.append(directorios[i]);
			comando.append("\\\\");
		}
		return comando.toString();
	}

	public static void eSpeak(String txt){
		try {
			Runtime.getRuntime().exec(pathAbsoluto + "\\eSpeak\\command_line\\espeak -v" + voz + " \"" + txt + "\"");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void eSpeakFile(String file){
		try {
			Runtime.getRuntime().exec(pathAbsoluto + "\\eSpeak\\command_line\\espeak -v" + voz + " -f "+file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getPathAbsoluto() {
		return pathAbsoluto;
	}

}
