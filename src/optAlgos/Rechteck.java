package optAlgos;

public class Rechteck {

	int lange;
	int breite;
	int posX;
	int posY;
	
	public Rechteck(int langeRechtecken, int breiteRechtecken, int x, int y){
		lange = langeRechtecken;
		breite = breiteRechtecken;
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

	public int getLange() {
		return lange;
	}

	public void setLange(int lange) {
		this.lange = lange;
	}
	
	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}
}
