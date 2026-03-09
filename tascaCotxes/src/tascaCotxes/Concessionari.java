package tascaCotxes;

import java.util.Iterator;
import java.util.TreeSet;

public class Concessionari {

	private String adreca;
	private final static int MAX_VEHICLES = 100;
	private TreeSet<Vehicle> vehicles;

	public Concessionari(String adreca) {
		super();
		this.adreca = adreca;
		vehicles = new TreeSet<>();
	}

	public boolean afegirVehicle(Cotxe c) {
		if (vehicles.size() > MAX_VEHICLES) {
			return false;
		}
		return vehicles.add(c);
	}
	
	public boolean afegirVehicle(Moto m) {
		if (vehicles.size() > MAX_VEHICLES) {
			return false;
		}
		return vehicles.add(m);
	}

	public boolean eliminarVehicle(Vehicle vehicle) {
		return vehicles.remove(vehicle);
	}

	public boolean eliminarVehicle(String matricula) {
		Iterator<Vehicle> itr = vehicles.iterator();
		while (itr.hasNext()) {			
			if (itr.next().getMatricula().equals(matricula)) {
				itr.remove();
				return true;
			}
		}
		return false;
	}

	public int nombreVehicles() {
		return vehicles.size();
	}

	public void mostrarVehicles() {
		for (Vehicle v : vehicles) {
			if (v instanceof Cotxe) {
				Cotxe c = (Cotxe) v;
				System.out.println(c.toString()); 
			} else {
				Moto m = (Moto) v;
				System.out.println(m.toString()); 
			}
		}
	}

	
	public int mitjanaKm(){
		Iterator<Vehicle> itr = vehicles.iterator();
		int suma = 0;
		while (itr.hasNext()) {		
			suma = suma + itr.next().getKm();
			}
		return suma/vehicles.size();
	}
	
}
