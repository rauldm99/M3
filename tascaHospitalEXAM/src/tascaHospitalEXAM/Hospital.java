package tascaHospitalEXAM;

import java.util.HashSet;
import java.util.TreeSet;

public class Hospital {
	private String nom;
	private String adreca;
	HashSet<Pacient> pacients = new HashSet<>();
	HashSet<Doctor> doctors = new HashSet<>();
	HashSet<Especialitat> especialitats = new HashSet<>();
	TreeSet<Cita> cites = new TreeSet<>();

	public Hospital(String nom, String adreca) {
		super();
		this.nom = nom;
		this.adreca = adreca;
	}

	public void registarPacient(Pacient p) {
		pacients.add(p);
	}

	public void eliminarPacient(Pacient p) {
		pacients.remove(p);
	}

}
