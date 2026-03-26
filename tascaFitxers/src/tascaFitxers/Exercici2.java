package tascaFitxers;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercici2 {

	static boolean escriureFitxer(String nomFitxer) {
		boolean append = false;
		Scanner sc = new Scanner(System.in);

		try (PrintWriter pWriter = new PrintWriter(new FileWriter(nomFitxer, append))) {
			int total = 0;
			String linia;
			linia = sc.nextLine();
			while (!linia.equals("fi")) {
				int word = linia.split(" ").length;
				pWriter.println(linia + "	(Té " + word + " paraules)");
				total += word;
				linia = sc.nextLine();
			}
			pWriter.println("Total de paraules: " + total);
			return true;
		} catch (FileNotFoundException e) {

			System.out.println("Fitxer no existeix");

			return false;

		} catch (IOException e) {

			System.out.println(e.getMessage());

		}
		return false;
	}
}
