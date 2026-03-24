package tascaCotxes;

import java.io.Serializable;
import java.util.regex.Pattern;

public abstract class Vehicle implements Comparable<Vehicle>, Serializable {

	protected String matricula;
	protected int km;
	protected String marca;
	protected String model;
	protected String color;

	public int compareTo(Vehicle v) {
		return this.matricula.compareTo(v.getMatricula());
	}

	public Vehicle(String matricula, String marca, String model, String color, int km) {
		super();
		if (!validarMatricula(matricula)) {
			throw new IllegalArgumentException("Format de la matricula erroni.");
		}
		this.matricula = matricula;
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.km = km;
	}

	public Vehicle() {

	}

	public static boolean validarMatricula(String mat) {
		String regex1 = "^[0-9]{4}[a-zA-Z]{3}$";

		if (Pattern.matches(regex1, mat)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vehicle [matricula=" + matricula + ", km=" + km + ", marca=" + marca + ", model=" + model + ", color="
				+ color + "]";
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
