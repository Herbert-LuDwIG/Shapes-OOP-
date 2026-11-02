package figuras;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burtnica {

	public static void main(String[] args) {
		Centrs centraP1 = new Centrs(1, 101);
		Centrs centraP2 = new Centrs(6, 7);
		
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas:\n " + centraP1.izvaditKoordinatas(), "Informācija", JOptionPane.PLAIN_MESSAGE);
		centraP1.parvietot(5, -51);
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas:\n " + centraP1.izvaditKoordinatas(), "Informācija", JOptionPane.PLAIN_MESSAGE);
		
		
		Cetrsturis c1 = new Cetrsturis();
		Cetrsturis c2 = new Cetrsturis(centraP1);
		Cetrsturis c3 = new Cetrsturis(10, 8);
		Cetrsturis c4 = new Cetrsturis(centraP2, 14, 88);
		// Pirmais konstruktors c1
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: " + c1.augstums  + "\nplatums: " + c1.platums + "\ncentra punkts: " + c1.punkts.izvaditKoordinatas());
		// Otrais konstruktors c2
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: " + c2.augstums  + "\nplatums: " + c2.platums + "\ncentra punkts: " + c2.punkts.izvaditKoordinatas());
		// Trešais konstruktors c3
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: " + c3.augstums  + "\nplatums: " + c3.platums + "\ncentra punkts: " + c3.punkts.izvaditKoordinatas());
		// Ceturtais konstruktors c4
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: " + c4.augstums  + "\nplatums: " + c4.platums + "\ncentra punkts: " + c4.punkts.izvaditKoordinatas());
		
		
		//double r = Cipari();
		
		
		double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ievadi riņķa radiusu (1 - 100)!"));
		
		Aplis a1 = new Aplis(centraP1, r);
		// Pirmais konstruktors a1
	    JOptionPane.showMessageDialog(null, "Apļa centra punkts: " + a1.punkts.izvaditKoordinatas()  + "\nradiuss: " + a1.radiuss);
		
	}// main

	private static double Cipari() {
		Scanner scan = new Scanner(System.in);
	double x;
		do {
			//JOptionPane.showInputDialog(null, "Ievadi riņķa radiusu (1 - 100)");
			while(!scan.hasNextInt()) {
				JOptionPane.showInputDialog(null, "Ievadi riņķa radiusu (1 - 100)!");
				scan.next();
			}
			x = scan.nextInt();
		}while(x < 1 || x > 100);
		return x;
	}// Cipari
	
	
}// Burtnica
