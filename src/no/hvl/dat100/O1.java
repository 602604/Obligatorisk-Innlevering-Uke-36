package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Gi tall");
		int inntekt = Integer.parseInt(input);
		
		
		if(inntekt<164100) {
			
			System.out.println("skatt av 0.00%");
		}
		else if (inntekt>164100 && inntekt<=230950) {
			
			System.out.println("skatt av 0.93%");
		}
		else if (inntekt>230951 && inntekt<=580650) {
			
			System.out.println("skatt av 2.41%");
		}
		else if (inntekt>580651 && inntekt<=934050) {
			
			System.out.println("skatt av 11.52%");
		}
		else{
			
			System.out.println("skatt av 14.52%");
		}

			
	}

}
