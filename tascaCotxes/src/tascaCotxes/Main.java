package tascaCotxes;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ======================
		// MENU SWITCH
		// ======================

		Scanner sc = new Scanner(System.in);
		int opcio = -1;
		Concessionari c = new Concessionari("Carrer Inventat, n5");
		GestorCSV gCsv = new GestorCSV();
		GestorXml gXml = new GestorXml();

		do {
			System.out.println("\n--- GESTIÓ DE VEHICLES ---");
			System.out.println("1. Carregar vehicles des de fitxer CSV");
			System.out.println("2. Carregar vehicles des de fitxer XML");
			System.out.println("3. Carregar vehicles des d'un fitxer binari");
			System.out.println("4. Mostrar la llista de vehicles");
			System.out.println("5. Afegir un vehicle");
			System.out.println("6. Eliminar un vehicle (per matrícula)");
			System.out.println("7. Quin és el cotxe amb més quilòmetres?");
			System.out.println("8. Desar els vehicles a un fitxer CSV");
			System.out.println("9. Desar els vehicles a un fitxer XML");
			System.out.println("10. Desar els vehicles a un fitxer binari");
			System.out.println("0. Sortir");
			System.out.print("Selecciona una opció: ");

			try {
				opcio = Integer.parseInt(sc.nextLine());

				switch (opcio) {
				case 1:
					c.setVehicles(gCsv.llegir(sc.nextLine()));
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					c.mostrarVehicles();
					break;
				case 5:
					break;
				case 6:
					c.eliminarVehicle(sc.nextLine());
					break;
				case 7:
					break;
				case 8:
					gCsv.guardar(null);
					break;
				case 9:
					try {
						gXml.guardar(c.getVehicles());
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 10:
					break;
				case 0:
					System.out.println("Sortint del programa...");
					break;
				default:
					System.out.println("Opció no vàlida.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Si us plau, introdueix un número.");
			}
		} while (opcio != 0);

//		System.out.println("===== INICI PROVES CONCESSIONARI =====\n");
//
//		// Crear concessionari
//		Concessionari concessionari = new Concessionari("Calle Mayor 123");
//
//		try {
//			concessionari.setVehicles(Fitxers.llegirCSV("/home/cfgs/Baixades/prova1"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			Fitxers.desaCSV(concessionari.getVehicles());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// ==============================
//		// PROVA VALIDACIÓ CONSTRUCTORS
//		// ==============================

//		try {
//			Cotxe cInvalid = new Cotxe("1234", 15200, "Model 3", "Blanco", "Tesla", 5, true);
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error en les dades: " + e.getMessage());
//		}
//
//		// Moto mInvalida = new Moto("1878-KRT", "Triumph", "Rocket 3 R", "Sapphire
//		// Black", -500, 2458, "Muscle Roadster");
//
//		// ==============================
//		// CREAR VEHICLES VÀLIDS
//		// ==============================
//
//		Cotxe cotxe1 = new Cotxe("1111FFF", 25000, "Corolla", "Rojo", "Toyota", 5, false);
//		Cotxe cotxe2 = new Cotxe("2222BBB", 80000, "Serie 3", "Negro", "BMW", 3, true);
//		Moto moto1 = new Moto("3333CCC", 10000, "CB125", "Blanco", "Honda", 125, "Urbana");
//		Moto moto2 = new Moto("4444DDD", 60000, "Z900", "Verde", "Kawasaki", 900, "Deportiva");
//
//		// ==============================
//		// AFEGIR VEHICLES
//		// ==============================
//
//		System.out.println(concessionari.afegirVehicle(cotxe1)); // true
//		System.out.println(concessionari.afegirVehicle(cotxe2)); // true
//		System.out.println(concessionari.afegirVehicle(moto1)); // true
//		System.out.println(concessionari.afegirVehicle(moto2)); // true
//
//		System.out.println("Vehicles afegits correctament.");
//
//		// Intentar afegir duplicat
//		boolean duplicat = concessionari.afegirVehicle(cotxe1);
//		if (!duplicat) {
//			System.out.println("No es permeten matrícules repetides");
//		}
//
//		// ==============================
//		// MOSTRAR VEHICLES
//		// ==============================
//
//		System.out.println("\n===== LLISTAT VEHICLES =====");
//		concessionari.mostrarVehicles();
//
//		// ==============================
//		// QUANTITAT DE VEHICLES
//		// ==============================
//
//		System.out.println("\nQuantitat total de vehicles: " + concessionari.nombreVehicles());
//
//		// ==============================
//		// CÀLCUL DE DESCOMPTES
//		// ==============================
//
//		System.out.println("\n===== DESCOMPTES =====");
//
//		System.out.println("Descompte cotxe1 (manual 25.000 km): " + cotxe1.calcularDescompte() + "%");
//		System.out.println("Descompte cotxe2 (automático 80.000 km): " + cotxe2.calcularDescompte() + "%");
//		System.out.println("Descompte moto1 (125cc 10.000 km): " + moto1.calcularDescompte() + "%");
//		System.out.println("Descompte moto2 (900cc 60.000 km): " + moto2.calcularDescompte() + "%");
//
//		// ==============================
//		// MITJANA DE KILOMETRATGE
//		// ==============================
//
//		System.out.println("\nMitjana de km del concessionari: " + concessionari.mitjanaKm() + "\n");
//
//		// ==============================
//		// ELIMINAR VEHICLE
//		// ==============================
//
//		boolean res = concessionari.eliminarVehicle(cotxe2);
//		if (res)
//			System.out.println("Eliminat cotxe2");
//		else
//			System.out.println("No s'ha pogut eliminar cotxe2");
//
//		res = concessionari.eliminarVehicle(cotxe2); // Ja no hi és, perquè s'ha eliminat abans
//		if (res)
//			System.out.println("Eliminat cotxe2");
//		else
//			System.out.println("No s'ha pogut eliminar cotxe2");
//
//		System.out.println("Quantitat de vehicles: " + concessionari.nombreVehicles());
//
//		System.out.println("\n===== LLISTAT VEHICLES =====");
//		concessionari.mostrarVehicles();
//
//		System.out.println();
//		// Eliminar per matrícula
//		res = concessionari.eliminarVehicle("3333CCC");
//		if (res)
//			System.out.println("Eliminat vehicle 3333CCC");
//		else
//			System.out.println("No s'ha pogut eliminar vehicle 3333CCC");
//
//		res = concessionari.eliminarVehicle("7777CCC");
//		if (res)
//			System.out.println("Eliminat vehicle 7777CCC");
//		else
//			System.out.println("No s'ha pogut eliminar vehicle 7777CCC");
//
//		System.out.println("\n===== LLISTAT FINAL =====");
//		concessionari.mostrarVehicles();
//
//		System.out.println("\n===== FI PROVES =====");

	}
}

// PERMETEN REPETITS: ArrayList, LinkedList
// NO PERMETEN: HashSet no ord  (hashcode, equals), TreeSet ord(compareto)
// Diccionari clau-valor no ord HashMap
