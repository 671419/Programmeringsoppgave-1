/*
 * O1 - Johan Severin Reitan 671419
 */

package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class b4 {

	public static void main(String[] args) {

		int brutto = Integer.parseInt(showInputDialog("lønn :"));

		double skatt;

		double en = 0.93 / 100;
		double to = 2.41 / 100;
		double tre = 11.52 / 100;
		double fire = 14.52 / 100;

		if (brutto >= 164101 && brutto <= 230950) {
			skatt = brutto * en;
		} else if (brutto >= 230951 && brutto <= 580650) {
			skatt = brutto * to;
		} else if (brutto >= 580651 && brutto <= 934050) {
			skatt = brutto * tre;
		} else if (brutto >= 934051) {
			skatt = brutto * fire;
		} else {
			skatt = 0;
		}

		skatt = Math.round(skatt);

		System.out.println("Din burritoinntekt er " + brutto + "kr og du må betale " + skatt + "kr i skatt");
	}

}
