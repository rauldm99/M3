package tascaHospitalEXAM;

public class Especialitat {

	private String nom;
	private String descripcio;
	private int edatMin;
	private int edatMax;

	public Especialitat(String nom, String descripcio, int edatMin, int edatMax) {
		super();
		this.nom = nom;
		this.descripcio = descripcio;
		this.edatMin = edatMin;
		this.edatMax = edatMax;
	}

	public boolean equals(Object e) {
		return this.nom.equals(((Especialitat) e).getNom());
	}

	public int hashCode() {
		return this.nom.hashCode();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public int getEdatMin() {
		return edatMin;
	}

	public void setEdatMin(int edatMin) {
		this.edatMin = edatMin;
	}

	public int getEdatMax() {
		return edatMax;
	}

	public void setEdatMax(int edatMax) {
		this.edatMax = edatMax;
	}

	@Override
	public String toString() {
		return "Especialitat [nom=" + nom + ", descripcio=" + descripcio + ", edatMin=" + edatMin + ", edatMax="
				+ edatMax + "]";
	}

}
