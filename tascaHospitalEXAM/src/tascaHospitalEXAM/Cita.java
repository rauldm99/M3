package tascaHospitalEXAM;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita implements Comparable<Cita> {

	private Pacient pacient;
	private Doctor doctor;
	private LocalDate data;
	private LocalTime hora;
	private Estat estat;

	public int compareTo(Cita c) {
		int comparacioData = this.data.compareTo(c.data);

		if (comparacioData != 0) {
			return comparacioData;
		}

		return this.hora.compareTo(c.hora);
	}

	public Cita(Pacient pacient, Doctor doctor, LocalDate data, LocalTime hora) {
		super();
		this.pacient = pacient;
		this.doctor = doctor;
		this.data = data;
		this.hora = hora;
		this.estat = estat.PENDENT;
	}

	public void confirmarCita() {
		this.estat = estat.REALITZADA;
	}

	public boolean cancellarCita() {
		if (this.estat == estat.REALITZADA) {
			return false;
		} else {
			this.estat = estat.CANCEL_LADA;
			return true;
		}
	}

	public boolean comprovarEdat() {
		if (this.pacient.getEdat() <= this.doctor.getEspecialitat().getEdatMin()
				|| this.pacient.getEdat() >= this.doctor.getEspecialitat().getEdatMax()) {
			return false;
		}
		return true;
	}

	public Pacient getPacient() {
		return pacient;
	}

	public void setPacient(Pacient pacient) {
		this.pacient = pacient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Estat getEstat() {
		return estat;
	}

	public void setEstat(Estat estat) {
		this.estat = estat;
	}

	@Override
	public String toString() {
		return "Cita [pacient=" + pacient + ", doctor=" + doctor + ", data=" + data + ", hora=" + hora + ", estat="
				+ estat + "]";
	}

}
