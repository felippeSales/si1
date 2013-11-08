package PorExtenso;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TestPorExtenso {

	PorExtenso transformador;

	@Before
	public void setUP(){
		transformador = new PorExtenso();
	}

	@Test
	public void test0(){
		try{
			assertEquals(transformador.transformaExtenso("0"), "zero");
		}catch(Exception e){}

	}

	@Test
	public void testAte10(){

		String[] numeros = {"zero","um", "dois","tres", "quatro","cinco","seis","sete","oito","nove", "dez"};
		try{
			for (int i = 1; i < numeros.length; i++) {
				assertEquals(transformador.transformaExtenso(i+""), numeros[i]);
			}
		}catch(Exception e){}


	}

	@Test
	public void testNumerosDeUmaPalavra(){

		String[] numeros = {"zero","um", "dois","tres", "quatro","cinco","seis","sete","oito"
				,"nove", "dez","onze","doze", "treze", "catorze", "quinze", "dezesseis", "dezessete"
				,"dezoito", "dezenove", "vinte","trinta","quarenta","cinquenta", "sessenta",
				"setenta", "oitenta", "noventa", "cem","duzentos", "trezentos", "quatrocentos",
				"quinhentos", "seiscentos", "setecentos","oitocentos", "novecentos", "mil" }; 

		try{
			// Testa ate 20
			for (int i = 11; i < 21; i++) {					
				assertEquals(transformador.transformaExtenso(i+""), numeros[i]);
			}

			//Testa de 30 ate 100
			int contador = 30;
			for(int n = 21; n < 29; n++){
				assertEquals(transformador.transformaExtenso(contador+""), numeros[n]);
				contador += 10;
			}

			// Testa ate 1000
			int i = 29;
			for(int n = 200; n <= 1000; n += 100){
				assertEquals(transformador.transformaExtenso(n + ""), numeros[i]);
				i += 1;
			}		

		}catch(Exception e){}
	}

	@Test
	public void testEntradaVazia(){
		try{
		transformador.transformaExtenso("");
		fail();
		}catch(Exception e){}

	}
}
