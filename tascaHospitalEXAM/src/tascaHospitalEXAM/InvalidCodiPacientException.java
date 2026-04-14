package tascaHospitalEXAM;

public class InvalidCodiPacientException extends Exception {

	public InvalidCodiPacientException(String message) {

		super(message);

	}

	public String getLocalizedMessage() {

		String error = super.getMessage();

		error += "\nEl codi es incorrecte!";

		return error;

	}
}
