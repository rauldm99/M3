package Exercici5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		List<Figura> llistaFigures = new ArrayList<>();
		
		llistaFigures.add(new Triangle(12, 8));
        llistaFigures.add(new Recta());
        llistaFigures.add(new Quadrat(4));

        System.out.println("Figures en ordre d'entrada");
        ListIterator<Figura> it = llistaFigures.listIterator();
        while (it.hasNext()) {
        	Figura figura = it.next();
        	System.out.println("Costats: " + figura.numCostats());
        }
		
        System.out.println("\nFigures en ordre invers");
        ListIterator<Figura> reverseIt = llistaFigures.listIterator();
        while (it.hasPrevious()) {
            Figura figura = it.previous();
            System.out.println("Costats: " + figura.numCostats());
            llistaFigures.listIterator(llistaFigures.size());
        }

	}

}
