package optAlgos;

import java.util.ArrayList;
import java.util.Random;

public class RechteckenSolution implements Solution {
	
	private int cost;
	private ArrayList<Rechteck> solutionMenge;
	
	public RechteckenSolution(ArrayList<Rechteck> mengeRechtecken) {
		
		this.solutionMenge = mengeRechtecken;
		this.cost = Integer.MAX_VALUE;

	}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public ArrayList<Rechteck> getSolutionMenge() {
		return solutionMenge;
	}

	public void setSolutionMenge(ArrayList<Rechteck> solutionMenge) {
		this.solutionMenge = solutionMenge;
	}

	@Override
	public ArrayList<Solution> getNeighbours() {
		ArrayList<Solution> solutions = new ArrayList<Solution>();
		
		//  gedreht
		
		
		// verschoben
		
		
		// vertauscht
		
		
		return solutions;
	}

	@Override
	public boolean testBestSolution(Solution s) {
		return (this.getCost() < s.getCost());
	}

	@Override
	public Solution getRandomNeighbour() {
		Random r = new Random();
		ArrayList<Solution> solutions = this.getNeighbours();
		return solutions.get(r.nextInt(solutions.size()));
	}

	@Override
	public boolean makeProbabilisticDecision(Solution randomNeighbour) {
		// TODO Auto-generated method stub
		return false;
	}

}
