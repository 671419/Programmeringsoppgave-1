/*
 * O2 - Johan Severin Reitan 671419
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class b5 {

	public static void main(String[] args) {

		String karakter;
		
		int teller = 1;

		while (teller <= 10) {

			int poeng = Integer.parseInt(showInputDialog("poeng: "));

			if (poeng <= 100 && poeng >= 0) {

				switch (poeng / 10) {
				case 3, 2, 1, 0:
					karakter = "F";
					break;
				case 4:
					karakter = "E";
					break;
				case 5:
					karakter = "D";
					break;
				case 7, 6:
					karakter = "C";
					break;
				case 8:
					karakter = "B";
					break;
				case 10, 9:
					karakter = "A";
					break;
				default:
					karakter = "ugyldig";

				}

				System.out.println("Karakter: " + karakter);
				teller++;

			}

			else {
				poeng = Integer.parseInt(showInputDialog("ugyldig poengsum, prøv igjen: "));
			}

		}

	}

}
