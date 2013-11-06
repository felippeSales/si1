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
		
		assertEquals(transformador.transformaExtenso("1"), "um");
		assertEquals(transformador.transformaExtenso("2"), "dois");
		assertEquals(transformador.transformaExtenso("3"), "tres");
		assertEquals(transformador.transformaExtenso("4"), "quatro");
		assertEquals(transformador.transformaExtenso("5"), "cinco");
		assertEquals(transformador.transformaExtenso("6"), "seis");
		assertEquals(transformador.transformaExtenso("7"), "sete");
		assertEquals(transformador.transformaExtenso("8"), "oito");
		assertEquals(transformador.transformaExtenso("9"), "nove");
		assertEquals(transformador.transformaExtenso("10"), "dez");
		
	}

}
