package no.hvl.dat100;



import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		
		int i;
		int a = 1;
		
		String verdien = JOptionPane.showInputDialog("Give nummber");
		int heltall = Integer.parseInt(verdien);
		
		for (i = 1; i <= heltall; i++) {
			a = a * i;
			System.out.println(a);
		}

	}

}
