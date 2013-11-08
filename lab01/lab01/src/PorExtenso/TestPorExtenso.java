package PorExtenso;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPorExtenso {

	@Test
	public void test0(){
		
		PorExtenso transformador = new PorExtenso();
		
		assertEquals(transformador.transformaExtenso("0"), "zero");
		
	}
	
	@Test
	public void testAte10(){
		
		PorExtenso transformador = new PorExtenso();
		
		String[] numeros = {"zero","um", "dois","tres", "quatro","cinco","seis","sete","oito","nove", "dez"};
		
		for (int i = 1; i < numeros.length; i++) {
			assertEquals(transformador.transformaExtenso(i+""), numeros[i]);
		}
		
	}
	
	

}
