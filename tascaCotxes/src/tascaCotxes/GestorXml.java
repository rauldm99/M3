package tascaCotxes;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.TreeSet;

public class GestorXml {
//
//	TreeSet<Vehicle> llegir(String nomFitxer) {
//
//		XMLDecoder d = new XMLDecoder(new BufferedInputStream(new FileInputStream(nomFitxer)));
//		Persona p2 = (Persona) d.readObject();
//		d.close();
//
//		return null;
//
//	}

	void guardar(TreeSet<Vehicle> vehicles) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de tu fitxero");
		String nomFitxer = sc.nextLine();

		XMLEncoder e = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(nomFitxer)));
		for (Vehicle v : vehicles) {

			e.writeObject(v);

		}
		e.close();

	}
}
