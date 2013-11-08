package PorExtenso;

import java.util.Hashtable;


public class PorExtenso {

	private Hashtable<String, String> listaNumeros =  new Hashtable<String, String>();

	private void adicionaNoMapa(){
		String[] numeros = {"zero","um", "dois","tres", "quatro","cinco","seis","sete","oito"
				,"nove", "dez","onze","doze", "treze", "catorze", "quinze", "dezesseis", "dezessete"
				,"dezoito", "dezenove", "vinte","trinta","quarenta","cinquenta", "sessenta",
				"setenta", "oitenta", "noventa", "cento","duzentos", "trezentos", "quatrocentos",
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

		numero = limpaZeroAEsquerda(numero);
		
		adicionaNoMapa();

		if(numero.equals("")){
			throw new Exception("Entrada vazia");
		}

		try{
			Integer.parseInt(numero);
		}catch(Exception e){
			throw new Exception("Entrada invalida");
		}

		if(listaNumeros.get(numero) == null || numero.equals("100")){
			if(numero.length() > 6){
				resultado += transformaMilhoes(numero);
			}else if(numero.length() <= 6 && numero.length() >= 4){
				resultado += transformaMilhar(numero);

			}else if(numero.length() == 3){
				resultado += transformaCentenas(numero);
			}else{
				resultado += transformaDezenas(numero);
			}

		}else{
			resultado += listaNumeros.get(numero);
		}

		return resultado;
	}

	private String limpaZeroAEsquerda(String numero){

		if (numero.length() > 0) {

			if ((numero.charAt(0)+"").equals("0")) {

				return limpaZeroAEsquerda(numero.substring(1));
			}
		}

		return numero;

	}

	private String transformaDezenas(String numero){
		String resultado = ""; 

		if(numero.length() == 2 && listaNumeros.get(numero) == null){
			String aux = "";

			aux += numero.charAt(0) + "0";

			resultado += listaNumeros.get(aux) + " e " + listaNumeros.get(numero.charAt(1) + ""); 
		}else{
			resultado += listaNumeros.get(numero);
		}

		return resultado;
	}

	private String transformaCentenas(String numero) throws Exception{
		String resultado = ""; 
		
		if(numero.equals("100")){
			resultado += "cem";
			
		}else if(listaNumeros.get(numero) != null){
			resultado = listaNumeros.get(numero);
		}else if(limpaZeroAEsquerda(numero).length() < 3){
			resultado += transformaDezenas(numero);
		}else if(!numero.equals("100")){

			String aux = "";

			aux += numero.charAt(0)  + "00";

			resultado += listaNumeros.get(aux) + " e " +  transformaDezenas(limpaZeroAEsquerda(numero.substring(1)));

		}

		return resultado;

	}

	private String transformaMilhar(String numero) throws Exception{
		String resultado = ""; 

		if(!("1").equals("" + numero.charAt(0))){

			String aux = numero.substring(0,numero.length() - 3);
			String aux2 = numero.substring(numero.length() - 3, numero.length() );

			if(aux2.equals("000")){
				resultado += transformaCentenas(aux) + " mil";
			}else{
				resultado += transformaCentenas(aux) + " mil e " +  transformaCentenas(limpaZeroAEsquerda(aux2));
			}
		}else{
			String aux = "";
			
			if((limpaZeroAEsquerda(numero.substring(1))).length() < 3 ||listaNumeros.get(numero.substring(1)) != null){
				resultado +=  "mil e " +  transformaCentenas(limpaZeroAEsquerda(numero.substring(1)));
			}else{
				resultado +=  "mil " +  transformaCentenas(limpaZeroAEsquerda(numero.substring(1)));
			}
			
			if(numero.equals("1100")){
				resultado = "mil e cem";
			}
		}

		return resultado;
	}

	private String transformaMilhoes(String numero) throws Exception{
		String resultado = "";

		if(!("1").equals("" + numero.charAt(0))){

			String aux = numero.substring(0,numero.length() - 6);
			String aux2 = numero.substring(numero.length() - 6, numero.length() );

		
			if(aux2.equals("000")){
				resultado += transformaCentenas(aux) + " milhões";
			}else{
				resultado += transformaCentenas(aux) + " milhões e " +  transformaMilhar(limpaZeroAEsquerda(aux2));
			}
		}/*else{
			String aux = "";
			
			if((limpaZeroAEsquerda(numero.substring(1))).length() < 3 ||listaNumeros.get(numero.substring(1)) != null){
				resultado +=  "mil e " +  transformaCentenas(limpaZeroAEsquerda(numero.substring(1)));
			}else{
				resultado +=  "mil " +  transformaCentenas(limpaZeroAEsquerda(numero.substring(1)));
			}
			
			if(numero.equals("1100")){
				resultado = "mil e cem";
			}
		}
*/
		return resultado;
	}

}
