package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Gi tall");
		int karakter= Integer.parseInt(input);
		
		
		if(karakter<39) {
			
			System.out.println("F");
		}
		else if (karakter>=40 && karakter<=49) {
			
			System.out.println("E");
		}
		else if (karakter>=50 && karakter<=59) {
			
			System.out.println("D");
		}
		else if (karakter>=60 && karakter<=79) {
			
			System.out.println("C");
		}
		else if (karakter>=80 && karakter<=89) {
			
			System.out.println("B");
		}
		else if (karakter>=90 && karakter<=100){
			
			System.out.println("A");
		}
		else {
			
			System.out.println("ugyldig poengsum");
		}

	}

}
