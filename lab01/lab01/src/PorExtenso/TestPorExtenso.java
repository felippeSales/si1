package PorExtenso;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPorExtenso {

	@Test
	public void test(){
		
		PorExtenso transformador = new PorExtenso();
		
		assertEquals(transformador.transformaExtenso(0), "zero");
		
	}

}
