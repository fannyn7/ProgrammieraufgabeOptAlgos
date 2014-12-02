package optAlgos;

public class Rechteck {

	int lange_x;
	int lange_y;
	int posX;
	int posY;
	
	public Rechteck(int langeXRechtecken, int langeYRechtecken, int x, int y){
		lange_x = langeXRechtecken;
		lange_y = langeYRechtecken;
		posX = x;
		posY = y;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getLange_x() {
		return lange_x;
	}

	public void setLange_x(int lange_x) {
		this.lange_x = lange_x;
	}

	public int getLange_y() {
		return lange_y;
	}

	public void setLange_y(int lange_y) {
		this.lange_y = lange_y;
	}

	}
