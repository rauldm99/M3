package cineExamen;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Session {

	private int code;
	private static int cont = 0;
	private LocalDate date;
	private LocalTime time;
	private Movie movie;
	private int room;
	private int maximumCapacity;
	private String status;
	private HashSet<Client> sessionClients; // Llista de clients de la sessió

	public Session(LocalDate date, LocalTime time, Movie movie, int room, int maximumCapacity) {
		super();
		this.code = cont++;
		this.date = date;
		this.time = time;
		this.movie = movie;
		this.room = room;
		this.maximumCapacity = maximumCapacity;
		this.status = "PROGRAMADA";
		this.sessionClients = new HashSet<>();
	}

	public boolean equals(Object a) {
		return this.movie.equals(((Movie) a).getTitle());
	}

	public int hashCode() {
		return this.movie.hashCode();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getMaximumCapacity() {
		return maximumCapacity;
	}

	public void setMaximumCapacity(int maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	public String getStatus() {
		return this.status;
	}

	public int getNumClients() {
		return this.sessionClients.size();
	}

	public void addClient(Client c) {
		this.sessionClients.add(c);
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean buscarClient(Client client) {
		for (Client c : sessionClients) {
			if (c.getPhone().equals(client.getPhone())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Session [code=" + code + ", date=" + date + ", time=" + time + ", movie=" + movie + ", room=" + room
				+ ", maximumCapacity=" + maximumCapacity + ", status=" + status + "]";
	}

}
