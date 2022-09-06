package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class B5 {

	public static void main(String[] args) {

		String karakter = "Ugyldig karakter";

		for (int i = 1; i <= 10; i++) {
			int poeng = Integer.parseInt(showInputDialog("Hva ble poengsummen din? [" + i + "]"));
			if (poeng >= 0 && poeng <= 100) {
				switch (poeng / 10) {
				case 0, 1, 2, 3:
					karakter = "F";
					break;
				case 4:
					karakter = "E";
					break;

				case 5:
					karakter = "D";
					break;

				case 6, 7:
					karakter = "C";
					break;

				case 8:
					karakter = "B";
					break;

				case 9, 10:
					karakter = "A";
					break;
				}
			} else {
				karakter = "Ugyldig karakter";
				i--;
			}
			System.out.println(karakter);
		}
	}

}
