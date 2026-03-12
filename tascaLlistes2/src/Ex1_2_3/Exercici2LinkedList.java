package Ex1_2_3;

import java.util.LinkedList;

public class Exercici2 {

	public static void main(String[] args) {
		
		LinkedList<String> ex2 = new LinkedList<>();
		
		ex2.add("1");
		ex2.add("2");
		ex2.add("3");
		ex2.add("4");
		ex2.add("5");
		ex2.add("6");
		
		System.out.println(ex2.toString());
		
		ex2.poll();
		ex2.poll();
		ex2.poll();

		System.out.println(ex2.toString());

		ex2.add("A");
		ex2.add("B");
		ex2.add("C");

		System.out.println(ex2.toString());
		
		ex2.poll();
		ex2.poll();

		System.out.println(ex2.toString());
	}

}
