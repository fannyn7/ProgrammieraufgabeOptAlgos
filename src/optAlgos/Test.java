package optAlgos;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
	
		private ArrayList<Rechteck> rechteckeMenge;
		
		public Test(){
			rechteckeMenge = new ArrayList<Rechteck>();
		}
		
		public Test(ArrayList<Rechteck> list){
			rechteckeMenge = list;
		}
		
		public void	paintComponent(Graphics	g){
			super.paintComponent(g);

			for (Rechteck r: rechteckeMenge){
				int lange = r.getWSeite();
				int breite = r.getSSeite();
				int x = r.getPosX();
				int y = r.getPosY();
				g.drawRect(x, y, lange, breite);
			}
	}

		public static void main(String[] args){
			RechteckenProblem p = new RechteckenProblem();
			RechteckenSolution s = p.getRandomSolution();
			
			Test test = new	Test(s.getSolutionMenge());
			JFrame frame = new JFrame("RechteckenProblem Visualiesierung");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().add(test);
			frame.setSize(500,500);
			frame.setVisible(true);
			
			
		
		}
}
