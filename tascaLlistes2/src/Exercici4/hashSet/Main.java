package Exercici4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Persona p;
		HashSet<Persona> persones = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			System.out.println("Introduce los datos, ej: nombre, fecha de nacimiento, telefono (opcional)");
			String datos = sc.nextLine();
			
			if (datos.isEmpty()) {break;}
			
			String separar[] = datos.split(",");
			
			if (separar.length <= 1) {
				System.out.println("Faltan datos!");
			} else {
				try {
					String nombre = separar[0];
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate fecha = LocalDate.parse(separar[1].trim(), formato);
					String tlf = null;
					if (separar.length > 2) {
						tlf = separar[2].trim();
					}
					
					persones.add(new Persona(nombre, fecha, tlf));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}						
		}
		
		Iterator<Persona> iter = persones.iterator();
		while (iter.hasNext()) {
			p = iter.next();
			System.out.println(p.getNom() + " " + (LocalDate.now().getYear() - p.getDataNeix().getYear()) + " " + p.getTlf());
		}
		
	}

}
