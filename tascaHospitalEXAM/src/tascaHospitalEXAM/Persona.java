package tascaHospitalEXAM;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

	protected String nom;
	protected String dni; // VALIDAR!
	protected String dataNeix;
	protected String telefon;

	public Persona(String nom, String dni, String dataNeix, String telefon) {
		super();
		this.nom = nom;
		if (!validarDNI(dni)) {
			throw new IllegalArgumentException("Format del DNI erroni!");
		}
		this.dni = dni;
		if (!validarFecha(dataNeix)) {
			throw new IllegalArgumentException("Data en format erroni, ha de ser dd/MM/yyy");
		}
		this.dataNeix = dataNeix;
		this.telefon = telefon;
	}

	/**
	 * Metodo para validar el DNI
	 * 
	 * @param dni
	 * @return true: es valid, false: no
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

	public boolean validarFecha(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if (LocalDate.parse(fecha, formatter) == null) {
			return false;
		}
		return true;
	}

	public int getEdat() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Period periodo = Period.between(LocalDate.parse(this.dataNeix, formatter), LocalDate.now());
		return periodo.getYears();
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

	public String getDataNeix() {
		return dataNeix;
	}

	public void setDataNeix(String dataNeix) {
		if (!validarFecha(dataNeix)) {
			throw new IllegalArgumentException("Data en format erroni, ha de ser dd/MM/yyy");
		}
		this.dataNeix = dataNeix;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", dni=" + dni + ", dataNeix=" + dataNeix + ", telefon=" + telefon + "]";
	}

}
