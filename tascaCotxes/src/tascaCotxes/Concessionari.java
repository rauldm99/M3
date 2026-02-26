package tascaCotxes;

import java.util.TreeSet;

public class Concessionari {
	
	private String adreca;
	private final static int MAX_VEHICLES = 50;
	TreeSet<Vehicle> vehicles = new TreeSet<>();
	
	public Concessionari(String adreca) {
		super();
		this.adreca = adreca;
	}
	
	
	
	public boolean afegirVehicle(Vehicle vehicle) {
		if (vehicles.size()<MAX_VEHICLES) {
			return false;
		}
		if (vehicles.add(vehicle)) {
			return true;
		} 
		return false;
	}
	
	public boolean treureVehicle(Vehicle vehicle) {
		if (vehicles.remove(vehicle)) {
			return true;
		} 
		return false;
	}
	
	public boolean treureVehicle(String matricula) {
		
		return false;
	}
	
	public int quantitatVehicles() {
		return vehicles.size();
	}
	
}
