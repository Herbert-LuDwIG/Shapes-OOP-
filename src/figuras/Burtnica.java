package figuras;

import javax.swing.JOptionPane;

public class Burtnica {

	public static void main(String[] args) {
		Centrs centraP1 = new Centrs(1, 101);
		
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas:\n " + centraP1.izvaditKoordinatas(), "Informācija", JOptionPane.PLAIN_MESSAGE);
		centraP1.parvietot(5, -51);
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas:\n " + centraP1.izvaditKoordinatas(), "Informācija", JOptionPane.PLAIN_MESSAGE);
	}// main

}// class
