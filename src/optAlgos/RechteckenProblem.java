package optAlgos;

import java.util.ArrayList;
import java.util.Random;

public class RechteckenProblem implements Problem {

	private static final int TEMPERATURE = 10;
	private ArrayList<Rechteck> rechteckenMenge = new ArrayList<Rechteck>();
	private double temperature;

	public RechteckenProblem(){
		this.rechteckenMenge = new ArrayList<Rechteck>();
		this.temperature = TEMPERATURE;
	}
	
	public RechteckenProblem(ArrayList<Rechteck> list){
		this.rechteckenMenge = list;
		this.temperature = TEMPERATURE;
	}
	
	@Override
	public double getTemperature() {
		return temperature;
	}

	@Override
	public RechteckenSolution getRandomSolution() {
/*		int nbRechteck = 10;
		int maxSeitenLange = 100;
		int minSeitenLange = 40;
		Random r = new Random();
		int wSeite = minSeitenLange + r.nextInt(maxSeitenLange);
		int sSeite = minSeitenLange + r.nextInt(maxSeitenLange);
		int x = 40;
		int y = 40;
		int i = 1;
		Rechteck rechteckRandom = new Rechteck(wSeite, sSeite, x, y);
		rechteckenMenge.add(rechteckRandom);
		
		ArrayList<Rechteck> neuRechteckeRandom = rechteckenMenge;
		
		while (i<nbRechteck){
			ArrayList<Rechteck> list = neuRechteckeRandom;
			neuRechteckeRandom.clear();
			for (Rechteck rechteckRand : list){
				wSeite = minSeitenLange + r.nextInt(maxSeitenLange);
				sSeite = minSeitenLange + r.nextInt(maxSeitenLange);
				x = rechteckRand.getPosX() + rechteckRand.getWSeite();
				y = rechteckRand.getPosY() + r.nextInt(rechteckRandom.getSSeite());
				rechteckRand = new Rechteck(wSeite, sSeite, x, y);
				rechteckenMenge.add(rechteckRand);
				neuRechteckeRandom.add(rechteckRand);
			}
			i = i + neuRechteckeRandom.size();								
		}*/
		rechteckenMenge.add(new Rechteck(100, 60, 30, 30));
		rechteckenMenge.add(new Rechteck(160, 100, 130, 30));
		rechteckenMenge.add(new Rechteck(80, 120, 290, 30));
		rechteckenMenge.add(new Rechteck(60, 80, 30, 90));
		rechteckenMenge.add(new Rechteck(100, 120, 90, 130));
		rechteckenMenge.add(new Rechteck(140, 60, 190, 150));
		rechteckenMenge.add(new Rechteck(100, 60, 30, 250));
		return new RechteckenSolution(rechteckenMenge);
	}

	public ArrayList<Rechteck> getRechteckenMenge() {
		return rechteckenMenge;
	}

	public void setRechteckenMenge(ArrayList<Rechteck> rechteckenMenge) {
		this.rechteckenMenge = rechteckenMenge;
	}

}
