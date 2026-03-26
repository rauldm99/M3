package tascaCotxes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class GestorCSV {

	TreeSet<Vehicle> llegir(String nomFitxer) {

		TreeSet<Vehicle> vehicles = new TreeSet<>();

		File fitxer = new File(nomFitxer);
		String linea;

		try (BufferedReader bReader = new BufferedReader(new FileReader(fitxer))) {
			while ((linea = bReader.readLine()) != null) {
				if (linea.startsWith("#")) {
					linea = bReader.readLine();
				}
				String[] v = linea.split("; ");
				if (v.length != 8) {
					throw new IllegalAccessException(
							"Falten dades! --!> tipus; matricula; km; marca; model; color; numPuertas / cilindrada; esAutomatic / tipus ");
				}
				if ("cotxe".equals(v[0])) {
					vehicles.add(new Cotxe(v[1], Integer.parseInt(v[2]), v[3], v[4], v[5], Integer.parseInt(v[6]),
							Boolean.parseBoolean(v[7])));
				}
				if ("moto".equals(v[0])) {
					vehicles.add(
							new Moto(v[1], Integer.parseInt(v[2]), v[3], v[4], v[5], Integer.parseInt(v[6]), (v[7])));
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fitxer no existeix");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		return vehicles;

	}

	void guardar(TreeSet<Vehicle> vehicles) {
		boolean append = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de tu fitxero");
		String nomFitxer = sc.nextLine();

		try (PrintWriter pWriter = new PrintWriter(new FileWriter(nomFitxer, append))) {
			int total = 0;
			String linia;
			for (Vehicle v : vehicles) {
				if (v instanceof Cotxe) {
					Cotxe c = (Cotxe) v;
					pWriter.println(c.toCsv());
				} else {
					Moto m = (Moto) v;
					pWriter.println(m.toCsv());
				}
			}
		} catch (FileNotFoundException e) {

			System.out.println("Fitxer no existeix");

		} catch (IOException e) {

			System.out.println(e.getMessage());

		}

	}
}
