package optAlgos;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

// Problem resolution without graphic representation

public class Test2 {
	
	final private int instanzen = 1;
	final private static int rechtecke = 4;
	final private static int minSeitenl�nge = 10;
	final private static int maxSeitenl�nge = 50;
	
	public static void main(String[] args){
		
		ArrayList<Rechteck> mengeRechtecke= new ArrayList<Rechteck>();
		
		for (int i = 1; i <= rechtecke; i++) {
			
		int seite1 = (int) (minSeitenl�nge + Math.random()*(maxSeitenl�nge-minSeitenl�nge));
		int seite2 = (int) (minSeitenl�nge + Math.random()*(maxSeitenl�nge-minSeitenl�nge));
		mengeRechtecke.add(new Rechteck(seite1,seite2));
		
		}
		
		RechteckenProblem problemInstanz = new RechteckenProblem(mengeRechtecke);
		LokaleSuche lokaleSuche = new LokaleSuche(problemInstanz);
		Solution sol = lokaleSuche.lokaleSucheAlgorithm();
	
		 
	}
	

}
