package PorExtenso;

import java.util.HashMap;
import java.util.Hashtable;


public class PorExtenso {

	public String transformaExtenso(String i) {
		
		Hashtable<String, String> numeros = new Hashtable<String, String>();
		
		numeros.put("0", "zero");
		numeros.put("1", "um");
		numeros.put("2", "dois");
		numeros.put("3", "tres");
		numeros.put("4", "quatro");
		numeros.put("5", "cinco");
		numeros.put("6", "seis");
		numeros.put("7", "sete");
		numeros.put("8", "oito");
		numeros.put("9", "nove");
		numeros.put("10", "dez");
		
		String resultado = "";
		
		resultado += numeros.get(i);
		
		return resultado;
	}

}
