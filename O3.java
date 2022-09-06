package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Skriv inn et tall"));
		int nummer = n;
		int sum = 1;

		while (n > 1) {
			sum *= n;
			System.out.print(n + " * ");
			n--;
		}
		System.out.print("1");
		String melding = "!" + nummer + " = " + sum;
		showMessageDialog(null, melding);

	}

}
