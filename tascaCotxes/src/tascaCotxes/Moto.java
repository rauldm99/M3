package tascaCotxes;

public class Moto extends Vehicle {
	
	private int cilindrada;
	private String tipus;
	
	public Moto(String matricula, int km, String marca, String model, String color, int cilindrada, String tipus) {
		super(matricula, km, marca, model, color);
		this.cilindrada = cilindrada;
		this.tipus = tipus;
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
	
	
}
