/*
 * O3 - Johan Severin Reitan 671419
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class o3 {

	public static void main(String[] args) {

		int sum = 1;

		int inpNummer = Integer.parseInt(showInputDialog("tall: "));

		int nummer = inpNummer;

		while (nummer >= 2) {
			sum = sum * nummer;
			nummer--;
		}
		
		showMessageDialog(null, inpNummer + "! = " + sum);

	}

}
