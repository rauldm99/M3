
public class Doctor extends Persona {
	
	private String especialitat;

	public Doctor(String nom, String dNI, String especialitat) {
		super(nom, dNI);
		this.especialitat = especialitat;
	}

	public String getEspecialitat() {
		return especialitat;
	}

	public void setEspecialitat(String especialitat) {
		this.especialitat = especialitat;
	}
	
		
}
