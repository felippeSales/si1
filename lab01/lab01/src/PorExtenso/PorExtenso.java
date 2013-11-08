package PorExtenso;

import java.util.HashMap;
import java.util.Hashtable;


public class PorExtenso {
		
	public String transformaExtenso(String numero) throws Exception {
		
		if(numero.equals("")){
			throw new Exception("Entrada vazia");
		}
			
		try{
			Integer.parseInt(numero);
		}catch(Exception e){
			throw new Exception("Entrada invalida");
		}
		
		Hashtable<String, String> listaNumeros = new Hashtable<String, String>();

		String[] numeros = {"zero","um", "dois","tres", "quatro","cinco","seis","sete","oito"
				,"nove", "dez","onze","doze", "treze", "catorze", "quinze", "dezesseis", "dezessete"
				,"dezoito", "dezenove", "vinte","trinta","quarenta","cinquenta", "sessenta",
				"setenta", "oitenta", "noventa", "cem","duzentos", "trezentos", "quatrocentos",
				"quinhentos", "seiscentos", "setecentos","oitocentos", "novecentos", "mil"}; 
		
		for (int j = 0; j < 21; j++) {
			listaNumeros.put(j+"", numeros[j]);
		}
		
		int contador = 30;
		
		for(int n = 21; n < 29; n++){
			listaNumeros.put(contador+"", numeros[n]);
			contador += 10;
		}
		
		contador = 100;
		
		for(int n2 = 29; n2 < 38; n2++){
			contador += 100;
			
			listaNumeros.put(contador+"", numeros[n2]);
		}
						
		String resultado = "";
		resultado += listaNumeros.get(numero);
		
		return resultado;
	}

}
