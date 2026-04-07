package tascaHospitalEXAM;

import java.time.LocalDate;

public class Persona {

	protected String nom;
	protected String dni; // VALIDAR!
	protected LocalDate dataNeix;
	protected String telefon;

	public Persona(String nom, String dni, LocalDate dataNeix, String telefon) {
		super();
		this.nom = nom;
		if (!validarDNI(dni)) {
			throw new IllegalArgumentException("Format del DNI erroni!");
		}
		this.dni = dni;
		this.dataNeix = dataNeix;
		this.telefon = telefon;
	}

	/**
	 * Metodo para validar el DNI
	 * 
	 * @param dni
	 * @return true: si el formato del DNI es valido, false: si no lo es
	 */
	public static boolean validarDNI(String dni) {
		if (dni.length() != 9) {
			return false;
		}
		int numeros = Integer.parseInt(dni.substring(0, 8));
		int resto = numeros % 23;
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		if (letra.charAt(resto) != dni.charAt(8)) {
			return false;
		}
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (!validarDNI(dni)) {
			throw new IllegalArgumentException("Format del DNI erroni!");
		}
	}

	public LocalDate getDataNeix() {
		return dataNeix;
	}

	public void setDataNeix(LocalDate dataNeix) {
		this.dataNeix = dataNeix;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
