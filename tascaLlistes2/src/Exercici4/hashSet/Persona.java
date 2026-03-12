package Exercici4;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Persona {
	
	private String nom;
	private LocalDate dataNeix;
	private String tlf;
	
	public Persona(String nom, LocalDate dataNeix, String tlf) {
		super();
		this.nom = nom;
		if (!validarFecha(dataNeix)) {
			throw new IllegalArgumentException("La data de neixement no pot ser posterior a la data d'avui");
		}
		this.dataNeix = dataNeix;
		if (!validarTlf(tlf)) {
			throw new IllegalArgumentException("Format del telefon erroni");
		}
		this.tlf = tlf;
	}
	
	public boolean equals(Object a) {
		return this.nom.equals(((Persona) a).getNom());
	}
	
	public int hashCode () {
		return this.nom.hashCode();
	}
	
	public static boolean validarTlf(String tlf) {
		String regex1 = "^(\\+34\\s)([0-9]){9}$";
		String regex2 = "^([0-9]{3}\\s[0-9]{2}\\s[0-9]{2}\\s[0-9]{2})$";
		String regex3 = "^([0-9]){9}$";
		String regex4 = "^(\\+34)([0-9]){9}$";
		if (tlf==null) {
			return true;
		}
		if (Pattern.matches(regex1, tlf)) {
			return true;
		} 
		if (Pattern.matches(regex2, tlf)) {
			return true;
		}
		if (Pattern.matches(regex3, tlf)) {
			return true;
		}
		if (Pattern.matches(regex4, tlf)) {
			return true;
		}
		return false;
	}
	
	public static boolean validarFecha(LocalDate dataNeix) {
		
		if (dataNeix.isAfter(LocalDate.now())) {
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

	public LocalDate getDataNeix() {
		return dataNeix;
	}

	public void setDataNeix(LocalDate dataNeix) {
		this.dataNeix = dataNeix;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

}
