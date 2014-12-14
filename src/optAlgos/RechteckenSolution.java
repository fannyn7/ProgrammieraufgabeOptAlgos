package optAlgos;

import java.util.ArrayList;
import java.util.Random;

public class RechteckenSolution implements Solution {
	
	//private int cost;
	private ArrayList<Rechteck> solutionMenge;
	
	public RechteckenSolution(ArrayList<Rechteck> mengeRechtecken) {
		
		this.solutionMenge = mengeRechtecken;
		//this.cost = Integer.MAX_VALUE;

	}
	
	public int getCost() {
		int cost = 0;
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		int langeSeite;
		int posXmin, posXmax, posYmin, posYmax;
		for (Rechteck r : solutionMenge){
			posXmin = r.getPosX();
			posYmin = r.getPosY();
			posXmax = posXmin + r.getWSeite();
			posYmax = posYmin + r.getSSeite();
			
			if (posXmin < minX){
				minX = posXmin;
			}
			if (posYmin < minY){
				minY = posYmin;
			}
			if (posXmax > maxX){
				maxX = posXmax;
			}
			if (posYmax > maxY){
				maxY = posYmax;
			}
			langeSeite = Math.max(maxX - minX, maxY - minY);
			cost = langeSeite * langeSeite;
		}
		System.out.println(cost);
		return cost;
	}

	//public void setCost(int cost) {
		//this.cost = cost;
	//}

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
