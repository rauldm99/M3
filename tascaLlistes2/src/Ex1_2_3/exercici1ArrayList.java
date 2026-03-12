package Ex1_2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Exercici1 {

	public static void main(String[] args) {
		
		String[] dades = { "rojo", "verde", "azul claro", "azul marino" };
		
		String[] mesdades = {"amarillo", "naranja", "rosa fucsia"};
		
		ArrayList<String> ex1 = new ArrayList<>(Arrays.asList(dades));
		ArrayList<String> mDades = new ArrayList<>(Arrays.asList(mesdades));

		ex1.addAll(mDades);
		
		System.out.println(ex1.toString());
		
		ex1.add(2, "gris marengo");
		
		System.out.println(ex1.size());
		System.out.println(ex1.contains("naranja"));
		System.out.println(ex1.contains("morado"));
		System.out.println(ex1.get(5));
		
		ex1.remove(0);
		try {
			ex1.remove(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(ex1.remove("verde")); 
		System.out.println(ex1.remove("negro"));
		
		
		LinkedList<String> lista = new LinkedList<>();
		lista.addAll(ex1.subList(0, ex1.size()));
		System.out.println(lista.toString());
	}

}
