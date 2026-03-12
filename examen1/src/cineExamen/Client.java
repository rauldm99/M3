package cineExamen;

import java.util.regex.Pattern;

public class Client implements Comparable<Client> {

	private String name;
	private String phone;

	public Client(String name, String phone) {
		super();
		this.name = name;
		if (!validarTlf(phone)) {
			throw new IllegalArgumentException("Format del telefon erroni!");
		}
		this.phone = phone;
	}

	public boolean validarTlf(String tlf) {
		String regex1 = "^[0-9]{9}$";

		if (Pattern.matches(regex1, tlf)) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(Client c) {
		return this.phone.compareTo(c.getPhone());
	}

}
