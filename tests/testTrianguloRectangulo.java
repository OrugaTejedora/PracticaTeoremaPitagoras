package tests;
import clases.TrianguloRectangulo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testTrianguloRectangulo {

	TrianguloRectangulo TrianguloA = new TrianguloRectangulo();
	TrianguloRectangulo TrianguloB = new TrianguloRectangulo(2,2);
	
	//TESTS DEL PRIMER TRIANGULO//
	
	@Test
	void testhipotenusaA() {
		
		assertEquals(1.0,TrianguloA.hipotenusa());

	}
	
	@Test
	void testareaA() {
		
		assertEquals(0.5,TrianguloA.area());

	}
	
	@Test
	void testperimetroA() {
		
		assertEquals(3.0,TrianguloA.perimetro());
	}
	
	// TESTS DEL SEGUNDO TRIANGULO //
	
	@Test
	void testhipotenusaB() {
		
		assertEquals(3.0,TrianguloB.hipotenusa());

	}
	
	@Test
	void testareaB() {
		
		assertEquals(2,TrianguloB.area());

	}
	
	@Test
	void testperimetroB() {
		
		assertEquals(7.0,TrianguloB.perimetro());
	}
}
