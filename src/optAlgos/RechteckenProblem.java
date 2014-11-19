package optAlgos;

import java.util.ArrayList;

public class RechteckenProblem implements Problem {

	private static final int TEMPERATURE = 10;
	private ArrayList<Rechteck> rechteckenMenge = new ArrayList<Rechteck>();
	private double temperature;
	
	public RechteckenProblem(ArrayList<Rechteck> list){
		rechteckenMenge = list;
		temperature = TEMPERATURE;
	}
	
	@Override
	public double getTemperature() {
		return temperature;
	}

	@Override
	public Solution getRandomSolution() {
		// TODO
		return null;
	}

	public ArrayList<Rechteck> getRechteckenMenge() {
		return rechteckenMenge;
	}

	public void setRechteckenMenge(ArrayList<Rechteck> rechteckenMenge) {
		this.rechteckenMenge = rechteckenMenge;
	}

}
