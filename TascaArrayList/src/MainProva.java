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
        
        //Mostra quantes persones hi ha a la llista (size)
        System.out.println(persona.size());
        
        //Canvia les dades de la persona que està en la posició 1 (set)
        persona.set(1, "Roberto");
        
        //Esborra la persona que està en la posició 2 (remove)
        persona.remove(2);
        
        //Mostra la llista sencera amb un forEach
        for (Persona llista : persona) {
        	System.out.println(llista);
        }
        
        //Crea un arrayList de persones amb 2 pacients i 2 doctors.
        
	}

}
