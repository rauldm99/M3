package tascaCotxes;

public class Cotxe extends Vehicle {
	
	private int numPuertas;
	private boolean esAutomatic;
	
	public Cotxe(String matricula, int km, String marca, String model, String color, int numPuertas,
			boolean esAutomatic) {
		super(matricula, km, marca, model, color);
		this.numPuertas = numPuertas;
		this.esAutomatic = esAutomatic;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public boolean isEsAutomatic() {
		return esAutomatic;
	}

	public void setEsAutomatic(boolean esAutomatic) {
		this.esAutomatic = esAutomatic;
	}
	
}
