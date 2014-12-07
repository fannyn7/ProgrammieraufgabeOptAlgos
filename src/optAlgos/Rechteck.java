package optAlgos;

public class Rechteck {

	int waagerechteSeite;
	int senkrechteSeite;
	
	// Position of the right-down corner
	int posX;
	int posY;
	
	public Rechteck(int wSeite, int sSeite){
		waagerechteSeite = wSeite;
		senkrechteSeite = sSeite;
	}

	
	public Rechteck(int wSeite, int sSeite, int x, int y){
		waagerechteSeite = wSeite;
		senkrechteSeite = sSeite;
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
	
	public int getWSeite(){
		return waagerechteSeite;
	}
	
	public void setWSeite(int wSeite) {
		this.waagerechteSeite = wSeite;
	}
	
	public int getSSeite(){
		return senkrechteSeite;
	}
	
	public void setSSeite(int sSeite) {
		this.senkrechteSeite = sSeite;
	}

	public int getLange() {
		return Math.min(senkrechteSeite, waagerechteSeite);
	}

	
	public int getBreite() {
		return Math.max(senkrechteSeite, waagerechteSeite);
	}
	
	public float getFl�che() {
		return waagerechteSeite*senkrechteSeite;
	}
	
	public int getPerimeter() {
		return 2*( waagerechteSeite + senkrechteSeite );
	}

	public float getProzent�berlappung(Rechteck rechteck2) {
		
		int �berLPosX = Math.max(this.posX, rechteck2.posX);
		int �berLPosY = Math.max(this.posY, rechteck2.posY);
		int �berLWSeite = Math.max( 0 , Math.min(this.posX+this.waagerechteSeite,
				rechteck2.posX+rechteck2.waagerechteSeite) - �berLPosX);
		int �berLSSeite = Math.max(0,Math.min(this.posY+this.senkrechteSeite,
				rechteck2.posY+rechteck2.senkrechteSeite) -�berLPosY);
		
		Rechteck �berlappungRechteck = new Rechteck(�berLWSeite,�berLSSeite,�berLPosX,�berLPosY);
		
		return  �berlappungRechteck.getFl�che() / 
				Math.min(this.getFl�che(), rechteck2.getFl�che());
		
	}
	
}
