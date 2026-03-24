package tascaCotxes;

public class Moto extends Vehicle {

	private int cilindrada;
	private String tipus;

	public Moto(String matricula, int km, String marca, String model, String color, int cilindrada, String tipus) {
		super(matricula, marca, model, color, km);
		this.cilindrada = cilindrada;
		this.tipus = tipus;
	}

	public Moto() {

	}

	public int calcularDescompte() {
		if (this.getCilindrada() <= 125) {
			int desc = (this.getKm() / 5000) * 2;
			if (desc > 20) {
				return 20;
			}
			return desc;
		}
		int desc = this.getKm() / 10000;
		if (desc > 10) {
			return 10;
		}
		return desc;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	@Override
	public String toString() {
		return "Moto [matricula=" + matricula + ", km=" + km + ", marca=" + marca + ", model=" + model + ", color="
				+ color + ", cilindrada=" + cilindrada + ", tipus=" + tipus + "]";
	}

	public String toCsv() {
		return "moto; " + this.getMatricula() + "; " + this.getKm() + " ;" + this.getMarca() + "; " + this.getModel()
				+ "; " + this.getColor() + "; " + this.getCilindrada() + "; " + this.getTipus() + "; ";
	}

}
