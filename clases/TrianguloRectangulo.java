package clases;

public class TrianguloRectangulo {

	private int a;
	private int b;
	private double c;
	
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	public TrianguloRectangulo(int a, int b) {
		if (a <= 0 || b <= 0) throw new IllegalArgumentException("eh!! tiene que ser positivo el numero!!");
		this.a = a;
		this.b = b;
		
	}
	
	/**
	 * Este es el metodo para devolver el area del triangulo
	 * @return (this.a*this.b)/2;
	 * */
	
	public double area() {
		double area = (double)(this.a*this.b)/2;
		return area;
	}
	
	/**
	 * Este es el metodo para devolver la hipotenusa del triangulo
	 * @return this.c;
	 * */
	
	public double hipotenusa() {
		this.c = Math.sqrt((this.a*this.a) + (this.b*this.b));
		return Math.round(c);
	}
	
	/**
	 * Este es el metodo para devolver el perimetro del triangulo
	 * @return (this.a + this.b + this.c);
	 * */
	
	public double perimetro() {
		return (this.a + this.b + this.hipotenusa());
	}
	
	/**
	 * Estos son los getters y setters
	 * @return this.a,this.b,this.hipotenusa();
	 * */
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public double getC() {
		return this.hipotenusa();
	}
	
	/**
	 * Estos son los setters
	 * */
	
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public String toString() {
		String res = "";
		res += "Cateto 1: "+this.a + "\n";
		res += "Cateto 2: "+this.b + "\n";
		res += "Hipotenusa: "+this.hipotenusa();
		return res;
	}
}








