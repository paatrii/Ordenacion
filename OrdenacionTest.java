import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenacionTest {

	@Test
	void test() {
		String resultado = Ordenacion.ordenar3(1, 2, 3);
		String esperado = "1, 2, 3";
		assertEquals(esperado, resultado);
	}
	@Test
	void test2() {
		String resultado = Ordenacion.ordenar3(3, 2, 1);
		String esperado = "1, 2, 3";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void test3() {
		String resultado = Ordenacion.ordenar3(1, 3, 2);
		String esperado = "1, 2, 3";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void test4() {
		String resultado = Ordenacion.ordenar3(2, 3, 1);
		String esperado = "1, 2, 3";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void test5() {
		String resultado = Ordenacion.ordenar3(3, 1, 2);
		String esperado = "1, 2, 3";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void test6() {
		String resultado = Ordenacion.ordenar3(2, 1, 3);
		String esperado = "1, 2, 3";
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testConstructor() {
	  new Ordenacion();
	  assertTrue(true);
	}
	

}
