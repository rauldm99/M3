
public class Pacient extends Persona {
	
	private String historialMedic;

	public Pacient(String nom, String dNI, String historialMedic) {
		super(nom, dNI);
		this.historialMedic = historialMedic;
	}

	public String getHistorialMedic() {
		return historialMedic;
	}

	public void setHistorialMedic(String historialMedic) {
		this.historialMedic = historialMedic;
	}

	
}
