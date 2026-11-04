package figuras;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burtnica {

	public static void main(String[] args) {
		ArrayList<Aplis> Aplisi = new ArrayList<>();
		ArrayList<Cetrsturis> Cetrsturi = new ArrayList<>();
		ArrayList<Trijsturis> Trijsturi = new ArrayList<>();
		/*
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
		*/
	    String izv;
	    
	    String[] option = {"Izveidot apli", "Apskatīt izveidotos apļus", "Izveidot četrsturi", "Apturēt"};
	    
	    int Ask = -1;
	    
	    do {
	    	izv = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izvēlne", JOptionPane.PLAIN_MESSAGE,null, option, option[0]);
	    	
	    	if(izv == null)
	    		izv = "Apturēt";
	    		
	    	switch(izv) {
	    	case "Izveidot apli":
	    		Ask++;
	    		double r = CipariDouble("Ievadiet riņķa radiusu (1-100)", 1, 100);
	    		int x = CipariInt("Apļa x koordinātas (1 - 1000)", 1, 1000);
	    		int y = CipariInt("Apļa y koordinātas (1 - 1000)", 1, 1000);
	    		Centrs centraP1 = new Centrs(x, y);
	    		Aplis a1 = new Aplis(centraP1, r);
		        Aplisi.add(a1);
		        JOptionPane.showMessageDialog(null, "Apļa radiuss: " + a1.radiuss + "\nApļa centrs" + a1.punkts.izvaditKoordinatas());
		        break;
	    		
		    case "Apskatīt izveidotos apļus":
		    	//JOptionPane.showMessageDialog(null, "Something went wrong");
	    		ReadAplisi(Aplisi);
	    		break;
	    		
	    		
	    		
	    	case "Izveidot četrsturi": break;
	    	case "Apturēt": JOptionPane.showMessageDialog(null, "Programma apturēta!");break;
	    	}// switch
	    	
	    }while(!izv.equals("Apturēt"));
	    
	    
	}// main

	
	static double CipariDouble(String notif, int min, int max){
		String ievade;
		double skaitlis = 0;
		
		do{
			ievade = JOptionPane.showInputDialog(notif, min);
			  if(ievade == null){
				return -1;
		}
			  
		try{
		skaitlis = Double.parseDouble(ievade);
			if(skaitlis < min || skaitlis > max){
				JOptionPane.showMessageDialog(null, "The number is out of bounds of allowed interval", "Warning", JOptionPane.WARNING_MESSAGE);
				continue;
			}
		return skaitlis;
		
		} catch(NumberFormatException e){
		JOptionPane.showMessageDialog(null, "The number is not integer", "Error", JOptionPane.ERROR_MESSAGE);
		 }
		
		 }while(skaitlis < min || skaitlis > max);
		return skaitlis;
	
	}// CipariDouble
	
	static int CipariInt(String notif, int min, int max){
		String ievade;
		int skaitlis = 0;
		
		do{
			ievade = JOptionPane.showInputDialog(notif, min);
			  if(ievade == null){
				return -1;
		}
			  
		try{
		skaitlis = Integer.parseInt(ievade);
			if(skaitlis < min || skaitlis > max){
				JOptionPane.showMessageDialog(null, "The number is out of bounds of allowed interval", "Warning", JOptionPane.WARNING_MESSAGE);
				continue;
			}
		return skaitlis;
		
		} catch(NumberFormatException e){
		JOptionPane.showMessageDialog(null, "The number is not integer", "Error", JOptionPane.ERROR_MESSAGE);
		 }
		
		 }while(skaitlis < min || skaitlis > max);
		return skaitlis;
	
	}// CipariInt
	
	public static void ReadAplisi(ArrayList<Aplis> Aplisi) {
		
		if(Aplisi.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Apliši nav izveidoti!");
			return;
		}
		
		ArrayList<String> SMTH = new ArrayList<>();

		for (int i = 0; i < Aplisi.size(); i++) {
	        SMTH.add("Aplis Nr. " + (i + 1));
	    }

	    String selected = (String) JOptionPane.showInputDialog(
	            null,
	            "Kādu apli izvēlēt?",
	            "Izvēlējiet apli",
	            JOptionPane.QUESTION_MESSAGE,
	            null,
	            SMTH.toArray(),
	            SMTH.get(0)
	    );

	    

	    int num = SMTH.indexOf(selected);
	    
	    Aplis selectedAplis = Aplisi.get(num);

	    JOptionPane.showMessageDialog(
	            null,
	            "Apļa numurs: " + (num + 1) +
	            "\nApļa rādiuss: " + selectedAplis.radiuss +
	            "\nApļa centrs: " + selectedAplis.punkts.izvaditKoordinatas()
	    );

	}
	
	
	
	
}// Burtnica
