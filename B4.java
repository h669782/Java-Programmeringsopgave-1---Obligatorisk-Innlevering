package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B4 {

	public static void main(String[] args) {
		int lonn = Integer.parseInt(showInputDialog("Skriv inn lønn"));

		double skatt = 0;
		int skatteTrinn = 0;

		double trinn1 = 0.0093;
		double trinn2 = 0.0241;
		double trinn3 = 0.1152;
		double trinn4 = 0.1452;

		if (lonn > 164100 && lonn <= 230950) { // TRINN 1
			skatt = lonn * trinn1;
			skatteTrinn = 1;
		} else if (lonn > 230950 && lonn <= 580650) { // TRINN 2
			skatt = lonn * trinn2;
			skatteTrinn = 2;
		} else if (lonn > 580650 && lonn <= 934050) { // TRINN 3
			skatt = lonn * trinn3;
			skatteTrinn = 3;
		} else if (lonn > 934050) { // TRINN 4
			skatt = lonn * trinn4;
			skatteTrinn = 4;
		}
		System.out.println("Trinn " + skatteTrinn);
		System.out.println(Math.round(skatt) + "kr i skatt");

	}

}
