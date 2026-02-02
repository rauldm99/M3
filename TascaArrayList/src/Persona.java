
public class Persona {
	
	protected String Nom;
	protected String DNI;
	
	public Persona(String nom, String dNI) {
		super();
		Nom = nom;
		DNI = dNI;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "Persona [Nom=" + Nom + ", DNI=" + DNI + "]";
	}
	
	
		
}
