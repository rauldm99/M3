package tascaCotxes;

public abstract class Vehicle {
	
	protected String matricula;
	protected int km;
	protected String marca;
	protected String model;
	protected String color;
	
	public Vehicle(String matricula, int km, String marca, String model, String color) {
		super();
		this.matricula = matricula;
		this.km = km;
		this.marca = marca;
		this.model = model;
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
