package Exercici5;

public class Triangle extends Figura {
	
	private int alt;
	private int base;
			
	public Triangle(int alt, int base) {
		super();
		this.alt = alt;
		this.base = base;
	}

	public int numCostats() {
		return 3;
	}
	
	public int area() {
		return (alt*base)/2;
	}
}
