package tascaFitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercici1 {

	static int llegirFitxer(String nomFitxer) {
		File fitxer = new File(nomFitxer);
		FileReader fReader = null; // Lector del fitxer
		BufferedReader bReader = null; // Buffer
		String linea;

		try {
			fReader = new FileReader(fitxer); // Inicialitza lector amb el fitxer a llegir
			bReader = new BufferedReader(fReader); // Inicialitza buffer amb el lector (entrada)
			int suma = 0;
			while ((linea = bReader.readLine()) != null) {
				int num = Integer.parseInt(linea);
				suma += num;
			}
			return suma;
		} catch (FileNotFoundException e) {
			System.out.println("Fitxer no existeix");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (bReader != null) {
				try {
					bReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return 0;
	}

}
