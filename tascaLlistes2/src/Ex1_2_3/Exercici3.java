package Ex1_2_3;

import java.util.LinkedList;

public class Exercici3 {

	public static void main(String[] args) {
		
		LinkedList<String> ex3 = new LinkedList<>();
		
		ex3.push("1");
		ex3.push("2");
		ex3.push("3");
		ex3.push("4");
		ex3.push("5");
		ex3.push("6");
		
		System.out.println(ex3.toString()); 
		
		ex3.pop();
		ex3.pop();
		ex3.pop();
		
		System.out.println(ex3.toString()); 

		ex3.push("A");
		ex3.push("B");
		ex3.push("C");
	
		System.out.println(ex3.toString()); 

		ex3.pop();
		ex3.pop();
		
		System.out.println(ex3.toString()); 

	}

}
