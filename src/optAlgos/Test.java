package optAlgos;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {
		public void	paintComponent(Graphics	g){
			super.paintComponent(g);
			ArrayList<Rechteck> list = new ArrayList<Rechteck>();
			list.add(new Rechteck(5, 5, 10, 10));
			list.add(new Rechteck(15, 15, 20, 20));
			list.add(new Rechteck(300, 300, 100, 100));
			RechteckenProblem problem = new RechteckenProblem(list);
			for (Rechteck r: problem.getRechteckenMenge()){
				int lange = r.getLange_x();
				int breite = r.getLange_y();
				int x = r.getPosX();
				int y = r.getPosY();
				g.fillRect(x, y, lange, breite);
			}
	}

		public static void main(String[] args){
			Test test = new	Test();
			JFrame frame = new JFrame("RechteckenProblem Visualiesierung");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().add(test);
			frame.setSize(500,500);
			frame.setVisible(true);
		}
}
