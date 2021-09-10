package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Gi tall");
		int n = Integer.parseInt(input);
		
		int i;
		for (i = 1; i <= n; i++) {
			
			System.out.println(n);
		}

	}

}
