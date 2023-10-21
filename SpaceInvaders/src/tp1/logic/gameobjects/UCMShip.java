package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class UCMShip {
	
	/*
	 * 
	 * Comportamiento: Se mueve horizontalmente y realiza disparos. Inicialmente se coloca en 
	 * la casilla (4,7).
	 * 
	 * Resistencia: 3 puntos de daño.
	 * 
	 * Disparo: Lanza un láser. No puede haber más de un láser en el tablero.
	 * El láser avanzará verticalmente de forma que hasta que no haya alcanzado una nave 
	 * alienígena, una bomba, un ovni o haya llegado al final del tablero, no se podrá disparar 
	 * uno nuevo. Si el jugador realiza el disparo, el láser tendrá, en el momento de realizar la
	 * acción, la misma coordenada que UCMShip. Sin embargo, su trayectoria se actualizará en la 
	 * acción update del mismo ciclo.
	 * 
	 * Daño: El comportamiento estándar del disparo ocasiona un punto de daño en la nave impactada.
	 */
	
	private static final int ARMOR = 3;
	private static final int DAMAGE = 1;
	
	private Position pos; //col, row
	private int life;
	private Game game;
	private boolean canShoot;
	
	public UCMShip(Game game) {
		Position pos = new Position(4,7);
		this.pos = pos;
		this.life = 3;
		this.canShoot = true;
		this.game = game;
	}
	
	public boolean isAlive() {
		return false;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void setLife(int life) {
		this.life = life;
	}
	
	public void die() {
		//TODO 
	}
	
	public boolean isOnPosition(int col, int row) {
		if(this.pos.getCol() == col && this.pos.getRow() == row) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
	public void receiveDamage(int damage) {
		int life = this.getLife() - damage;
		this.life = life;
	}
	
	public boolean isOut() {
		//TODO
		return false;
	}
	
	public void performMovement() {
		//TODO
	}
	
	private String getSymbol() {
		//TODO
		return null;
	}
	
	@Override
	public String toString() {
		//TODO
		return null;
	}
	
	public String stateToString() {
		//TODO
		return null;
	}
	
	public String getInfo() {
		//TODO
		return null;
	}
	
	public String getDescription() {
		//TODO
		return null;
	}
	
	public int getDamage() {
		return this.DAMAGE;
	}
	
	public void onDelete() {
		//TODO
	}
	
	public void automaticMove() {
		//TODO
	}
	
	public void automaticAction() {
		//TODO
	}
	
	public boolean move(Move move) {
		//TODO
		return false;
	}
	
	public void enableLaser() {
		//TODO
	}
	
	public boolean shootLaser() {
		//TODO
		return false;
	}
	
	public void receiveAttack() {
		//TODO
	}
	
	public void performAttack() {
		//TODO
	}
	
	private void weaponAttack() {
		//TODO
	}
}
