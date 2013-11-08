package PorExtenso;

import java.util.Hashtable;


public class PorExtenso {

	private Hashtable<String, String> listaNumeros =  new Hashtable<String, String>();

	private void adicionaNoMapa(){
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
	}

	public String transformaExtenso(String numero) throws Exception {

		String resultado = "";

		adicionaNoMapa();

		if(numero.equals("")){
			throw new Exception("Entrada vazia");
		}

		try{
			Integer.parseInt(numero);
		}catch(Exception e){
			throw new Exception("Entrada invalida");
		}

		
		if(listaNumeros.get(numero) == null){
			String aux = "";
			
			aux += numero.charAt(0);
		
			for (int i = 0; i < numero.length() -1; i++ ){
				aux += "0";
			}
			
			resultado += listaNumeros.get(aux) + " e " + listaNumeros.get(numero.charAt(1) + ""); 

		}else{
			resultado += listaNumeros.get(numero);
		}

		return resultado;
	}



}
