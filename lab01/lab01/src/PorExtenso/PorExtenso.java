package PorExtenso;

import java.util.HashMap;
import java.util.Hashtable;


public class PorExtenso {

	public String transformaExtenso(String i) {
		
		Hashtable<String, String> listaNumeros = new Hashtable<String, String>();
		String[] numeros = {"zero","um", "dois","tres", "quatro","cinco","seis","sete","oito","nove", "dez"}; 
		
		for (int j = 0; j < numeros.length; j++) {
			listaNumeros.put(j+"", numeros[j]);
		}
						
		String resultado = "";
		
		resultado += listaNumeros.get(i);
		
		return resultado;
	}

}
