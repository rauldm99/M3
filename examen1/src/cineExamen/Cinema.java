package cineExamen;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Cinema {

	private String name;
	private String address;
	private TreeSet<Client> clients;
	private LinkedList<Movie> movies;
	private LinkedList<Session> sessions;

	public Cinema(String name, String address) {
		super();
		this.name = name;
		this.address = address;
		clients = new TreeSet<>();
		movies = new LinkedList<>();
		sessions = new LinkedList<>();
	}

	public boolean registerClient(Client c) {
		return clients.add(c);
	}

	public void showClients() {
		for (Client c : clients) {
			System.out.println(c.toString());
		}
	}

	public boolean registerMovie(Movie m) {
		return movies.add(m);
	}

	public void showMovies() {
		System.out.println(movies.toString());
	}

	public boolean registerSession(Session s) {
		return sessions.add(s);
	}

	public void showSessions() {
		for (Session s : sessions) {
			System.out.println(s.toString());
		}
	}

	public boolean sellTicket(int CodeS, Client c) {
		for (Session s : sessions) {
			if (s.getCode() == CodeS) {
				if (s.getDate().isBefore(LocalDate.now())) {
					return false;
				}
				if (s.getStatus().equals("CANCEL_LADA")) {
					return false;
				}
				if (s.buscarClient(c)) {
					return false;
				}
				if (s.getNumClients() >= s.getMaximumCapacity()) {
					s.setStatus("COMPLETA");
					throw new IllegalArgumentException("Aforament maxim!");
				}
				s.addClient(c);
			}
		}
		return true;
	}

	public boolean changeSessionStatus(int codeS2, String status) {
		for (Session s : sessions) {
			if (s.getCode() == codeS2) {
				if (s.getDate().isBefore(LocalDate.now())) {
					return false;
				}
				s.setStatus(status);
			}
		}
		return true;
	}

	public boolean modifySession(int code, LocalDate of, LocalTime of2) {
		for (Session s : sessions) {
			if (s.getDate().isBefore(LocalDate.now())) {
				return false;
			}
			if (s.getStatus().equals("CANCEL_LADA")) {
				return false;
			}
			if (s.getCode() == code) {
				if (s.getDate().isBefore(LocalDate.now())) {
					return false;
				}
				s.setDate(of);
				s.setTime(of2);
			}
		}
		return true;
	}

	public boolean removeClient(String phone) {
		Iterator<Client> itr = clients.iterator();
		while (itr.hasNext()) {
			if (itr.next().getPhone().equals(phone)) {
				itr.remove();
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
