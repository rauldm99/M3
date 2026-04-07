package tascaHospitalEXAM;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Pacient extends Persona {

	private String codi;
	private String histMedic; // OPCIONAL
	private int total;

	public Pacient(String nom, String dni, LocalDate dataNeix, String telefon, String codi, String histMedic, int total)
			throws InvalidCodiPacientException {
		super(nom, dni, dataNeix, telefon);
		if (!validarCodi(codi)) {
			throw new InvalidCodiPacientException("El codi es incorrecte!");
		}
		this.codi = codi;
		this.histMedic = histMedic;
		this.total = total;
	}

	/**
	 * Metodo para valdar el codi de pacient
	 * 
	 * @param codi
	 * @return true: es valid, false: no
	 */
	public static boolean validarCodi(String codi) {
		String regex1 = "^[a-zA-Z]{3}[0-9]{8}$";

		if (Pattern.matches(regex1, codi)) {
			return true;
		}
		return false;
	}

}
