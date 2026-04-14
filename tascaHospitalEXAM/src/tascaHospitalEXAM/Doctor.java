package tascaHospitalEXAM;

public class Doctor extends Persona {

	private Especialitat especialitat;
	private Integer codi;
	private int cont = 0;
	private static int totalDoctors = 0;

	public boolean equals(Object d) {
		return this.codi.equals(((Doctor) d).getCodi());
	}

	public int hashCode() {
		return this.codi.hashCode();
	}

	public Doctor(String nom, String dni, String dataNeix, String telefon, Especialitat especialitat) {
		super(nom, dni, dataNeix, telefon);
		this.codi = cont++;
		this.especialitat = especialitat;
	}

	public Especialitat getEspecialitat() {
		return especialitat;
	}

	public void setEspecialitat(Especialitat especialitat) {
		this.especialitat = especialitat;
	}

	public int getCodi() {
		return codi;
	}

	public static int getTotalDoctors() {
		return totalDoctors;
	}

	@Override
	public String toString() {
		return "Doctor [nom=" + nom + ", dni=" + dni + ", dataNeix=" + dataNeix + ", telefon=" + telefon
				+ ", especialitat=" + especialitat + ", codi=" + codi + "]";
	}

}
