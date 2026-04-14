package tascaHospitalEXAM;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	        Hospital hospital = new Hospital("Clínica Salut Total", "Carrer de la Medicina, 123");

	        System.out.println("--- 1. Registrant Especialitats ---");
	        Especialitat pediatria = new Especialitat("Pediatria", "Atenció infantil", 0, 14);
	        Especialitat cardiologia = new Especialitat("Cardiologia", "Cor i sistema circulatori", 18, 120);
	        hospital.registrarEspecialitat(pediatria);
	        hospital.registrarEspecialitat(cardiologia);

	        System.out.println("\n--- 2. Registrant Doctors ---");
	        Doctor drGarca = new Doctor("Joan Garcia", "12345678Z", LocalDate.of(1980, 5, 10), "600111222", cardiologia);
	        Doctor drLopez = new Doctor("Marta Lopez", "87654321X", LocalDate.of(1985, 3, 15), "600333444", pediatria);
	        hospital.registrarDoctor(drGarca);
	        hospital.registrarDoctor(drLopez);
	        hospital.mostrarDoctors();

	        System.out.println("\n--- 3. Registrant Pacients (Validació de Codi) ---");
	        try {
	            // Cas correcte
	            Pacient p1 = new Pacient("Anna Pou", "11111111H", LocalDate.of(2015, 10, 20), "655000111", "MED04569001", "Cap");
	            hospital.registrarPacient(p1);
	            
	            // Cas incorrecte (llançarà InvalidCodiPacientException)
	            Pacient p2 = new Pacient("Pere Mas", "22222222J", LocalDate.of(1990, 1, 1), "655222333", "ERROR123", "Al·lèrgia pol·len");
	            hospital.registrarPacient(p2);
	        } catch (InvalidCodiPacientException e) {
	            System.err.println("Error en crear pacient: " + e.getMessage());
	        }

	        System.out.println("\n--- 4. Gestió de Cites i Validacions ---");
	        Pacient anna = hospital.getLlistaPacients().get(0); // L'Anna té 10-11 anys aprox.

	        // Intentar cita en pediatria (Edat OK)
	        System.out.println("Intentant cita Pediatria (Anna, 10 anys)...");
	        hospital.registrarCitaNova(anna, drLopez, LocalDate.now().plusDays(2), LocalTime.of(10, 0));

	        // Intentar cita en cardiologia (Error: Edat mínima 18)
	        System.out.println("Intentant cita Cardiologia (Anna, 10 anys)...");
	        hospital.registrarCitaNova(anna, drGarca, LocalDate.now().plusDays(3), LocalTime.of(11, 0));

	        // Intentar cita data passada (Error)
	        System.out.println("Intentant cita data passada...");
	        hospital.registrarCitaNova(anna, drLopez, LocalDate.of(2023, 1, 1), LocalTime.of(9, 0));

	        System.out.println("\n--- 5. Llistat de Cites Ordenades ---");
	        hospital.mostrarCitesPerDia(LocalDate.now().plusDays(2));

	        System.out.println("\n--- 6. Canvi d'estat i Cancel·lació ---");
	        // Cancel·lar cita existent
	        hospital.cancel·larCita("11111111H", LocalDate.now().plusDays(2), LocalTime.of(10, 0));
	        
	        // Intentar canviar estat d'una cita que no existeix o ja realitzada
	        hospital.canviarEstatCita("12345678Z", LocalDate.now().plusDays(2), LocalTime.of(10, 0)); // DNI Doctor

	        System.out.println("\n--- 7. Persistència de Dades ---");
	        GestorFitxers gestorCSV = new GestorCSV();
	        GestorFitxers gestorXML = new GestorXML();

	        if (gestorCSV.desaPacients(hospital.getLlistaPacients(), "pacients.csv")) {
	            System.out.println("Pacients guardats en CSV correctament.");
	        }
	        
	        if (gestorXML.desaPacients(hospital.getLlistaPacients(), "pacients.xml")) {
	            System.out.println("Pacients guardats en XML correctament.");
	        }

	        System.out.println("\n--- Fi de les proves ---");
	        System.out.println("Total pacients creats: " + Pacient.getTotalPacientsCreats());
	        System.out.println("Total doctors creats: " + Doctor.getTotalDoctorsCreats());
	    }
}
