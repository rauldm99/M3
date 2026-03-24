package tascaCotxes;

public class Cotxe extends Vehicle {

	private int numPuertas;
	private boolean esAutomatic;

	public Cotxe(String matricula, int km, String marca, String model, String color, int numPuertas,
			boolean esAutomatic) {
		super(matricula, marca, model, color, km);
		this.numPuertas = numPuertas;
		this.esAutomatic = esAutomatic;
	}

	public Cotxe() {

	}

	public int calcularDescompte() {
		if (!this.isEsAutomatic()) {
			int desc = this.getKm() / 10000;
			if (desc > 10) {
				return 10;
			}
			return desc;
		}
		return 0;
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

	@Override
	public String toString() {
		return "Cotxe [matricula=" + matricula + ", km=" + km + ", marca=" + marca + ", model=" + model + ", color="
				+ color + ", numPuertas=" + numPuertas + ", esAutomatic=" + esAutomatic + "]";
	}

	public String toCsv() {
		return "cotxe; " + this.getMatricula() + "; " + this.getKm() + " ;" + this.getMarca() + "; " + this.getModel()
				+ "; " + this.getColor() + "; " + this.getNumPuertas() + "; " + this.isEsAutomatic() + "; ";
	}

}
