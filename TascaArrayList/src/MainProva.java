import java.util.ArrayList;

public class MainProva {

	public static void main(String[] args) {

		// En el main de prova crea un arrayList d’objectes de la classe Persona.
		ArrayList<Persona> persona = new ArrayList<>();

		// Afegeix almenys 4 persones.
		persona.add(new Persona("Joan", "47671304D"));
		persona.add(new Persona("Pepe", "12345678F"));
		persona.add(new Persona("Miguel", "12378495S"));
		persona.add(new Persona("Carlos", "57898712F"));

		// Mostra les dades de la persona que està en la posició 1 (get)
		System.out.println(persona.get(1));

		// Mostra quantes persones hi ha a la llista (size)
		System.out.println(persona.size());

		// Canvia les dades de la persona que està en la posició 1 (set)
		persona.set(1, new Persona("Maria", "89345678F"));

		// Esborra la persona que està en la posició 2 (remove)
		persona.remove(2);

		// Mostra la llista sencera amb un forEach
		for (Persona llista : persona) {
			System.out.println(llista);
		}

		// Crea un arrayList de persones amb 2 pacients i 2 doctors.
		ArrayList<Persona> hospital = new ArrayList<>();
		hospital.add(new Pacient("Fran", "12345678F", "Alergia al pescado"));
		hospital.add(new Pacient("Aaron", "12345678T", "Ludopatia"));
		hospital.add(new Doctor("Alvaro", "54311236H", "Pediatria"));
		hospital.add(new Doctor("Carla", "789456324", "Cardiologia"));

		int i = 0;

		for (Persona p : hospital) {
			if (p instanceof Pacient) {
				Pacient pa = (Pacient) p;
				System.out.println("L'element " + i + " de la llista és un Pacient: nom=" + pa.getNom() + ", dni="
						+ pa.getDNI() + ", historial=" + pa.getHistorialMedic());
				i++;
			}
			if (p instanceof Doctor) {
				Doctor doc = (Doctor) p;
				System.out.println("L'element " + i + " de la llista és un Doctor: nom=" + doc.getNom() + ", dni="
						+ doc.getDNI() + ", especialitat=" + doc.getEspecialitat());
				i++;
			}

		}

	}

}
