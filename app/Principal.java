package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		int randoma = (int) ((Math.random() * (10 - 2)) + 2);
		int randomb = (int) ((Math.random() * (10 - 2)) + 2);
		
		TrianguloRectangulo TrianguloA = new TrianguloRectangulo(randoma, randomb);
		TrianguloRectangulo TrianguloB = new TrianguloRectangulo();
		
		
		double areaA = TrianguloA.area();
		double areaB = TrianguloB.area();
		
		double perimetroA = TrianguloA.perimetro();
		double perimetroB = TrianguloB.perimetro();
		
	}

}









