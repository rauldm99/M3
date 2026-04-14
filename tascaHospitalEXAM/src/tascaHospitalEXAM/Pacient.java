package tascaHospitalEXAM;

import java.util.regex.Pattern;

public class Pacient extends Persona {

	private String codi;
	private String histMedic; // OPCIONAL
	private static int total = 0;
	private int cont;

	public boolean equals(Object p) {
		return this.codi.equals(((Pacient) p).getCodi());
	}

	public int hashCode() {
		return this.codi.hashCode();
	}

	public Pacient(String nom, String dni, String dataNeix, String telefon, String codi, String histMedic, int total)
			throws InvalidCodiPacientException {
		super(nom, dni, dataNeix, telefon);
		if (!validarCodi(codi)) {
			throw new InvalidCodiPacientException("El codi es incorrecte!");
		}
		this.codi = codi;
		this.histMedic = histMedic;
		total = cont++;
	}

	/**
	 * Metodo para validar el codi de pacient
	 * 
	 * @param codi
	 * @return true: es valid, false: no
	 */
	public static boolean validarCodi(String codi) {
		String regex1 = "^[a-zA-Z]{3}//d{8}$";

		if (Pattern.matches(regex1, codi)) {
			return true;
		}
		return false;
	}

	public String getCodi() {
		return codi;
	}

	public String getHistMedic() {
		return histMedic;
	}

	public void setHistMedic(String histMedic) {
		this.histMedic = histMedic;
	}

	public static int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Pacient [nom=" + nom + ", dni=" + dni + ", dataNeix=" + dataNeix + ", telefon=" + telefon + ", codi="
				+ codi + ", histMedic=" + histMedic + "]";
	}

}
