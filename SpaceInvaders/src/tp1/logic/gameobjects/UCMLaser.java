package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

/**
 * 
 * Class that represents the laser fired by {@link UCMShip}
 *
 */
public class UCMLaser {
	
	// atributos 
	
	public static final int DAMAGE = 0;
	private static final int ARMOR = 1;
	
	private int life = ARMOR;
	public boolean alive = true;
	private boolean enable = true;	
	private String symbol = "oo";
	private Game game;
	private Position pos;
	private Move dir;
	
	// constructor 
	
	public UCMLaser(Game game, Position pos) {
		this.game = game;
		this.pos = pos;
	}
	
	// getters y setters
	
	public int getDamage() {
		if(this.life == ARMOR) {
			return DAMAGE;
		}
		else {
			return ARMOR - this.life;
		}
	}
	
	public int getLife() {
		return this.life;
	}	

	public void setLife(int life) {
		this.life = life;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	private void die() {
		this.alive = false;
	}	

	public boolean getEnable() {
		return this.enable;
	}
	
	public void enableLaser() {
		this.enable = true;
	}
	
	public void disableLaser() {
		this.enable = false;
	}
	
	private String getSymbol() {
		return this.symbol;
	}
	
	@Override
	public String toString() {
		return this.getSymbol();
	}
	
	public Game getGame() {
		return this.game;
	}	
	
	public Position getPosition() {
		return this.pos;
	}
	
	public void setPosition(Position pos) {
		this.pos = pos;
	}
	
	public void setPosition(int x, int y) {
		this.pos.setCol(x);
		this.pos.setRow(y);
	}	
	
	public Move getDir() {
		return this.dir;
	}	
		
	// otros métodos
	
	public boolean isOnPosition(int col, int row) {
		return this.pos.getCol() == col && this.pos.getRow() == row;
	}
	
	public void receiveDamage(int damage) {
		this.life = this.life - damage;
		if(this.getLife() < 1) {
			die();
		}
	}
	
	public boolean isOut() {
		if((this.getPosition().getCol() < 0 || this.getPosition().getCol() > 7) || 
				(this.getPosition().getRow() < 0 || this.getPosition().getRow() > 8 )) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void performMovement(Move move) {
		this.dir = move;
		int x = move.getX();
		int y = move.getY();
		this.setPosition(this.getPosition().getCol() + x, this.getPosition().getRow() + y);
	}	

	public void onDelete() {
		System.out.println("Laser eliminated.");
	}

	public void automaticMove () {
		performMovement(dir);
		if(isOut())
			die();
	}

	/**
	 * Method that implements the attack by the laser to a regular alien.
	 * It checks whether both objects are alive and in the same position.
	 * If so call the "actual" attack method {@link weaponAttack}.
	 * @param other the regular alien possibly under attack
	 * @return <code>true</code> if the alien has been attacked by the laser.
	 */
	
	public boolean performAttack(RegularAlien other) {
		int damage = 1; // Cantidad de daño que hace el láser al alien
		//alien.receiveAttack(damage); // Llama al método de recepción de ataque del RegularAlien
		return true; // Devuelve true si el ataque tiene éxito

	}

	/**
	 * Method that implements the attack by the laser to a destroyer alien.
	 * It checks whether both objects are alive and in the same position.
	 * If so call the "actual" attack method {@link weaponAttack}.
	 * @param other the destroyer alien possibly under attack
	 * @return <code>true</code> if the alien has been attacked by the laser.
	 */

	
	public boolean performAttack(DestroyerAlien other) {
		int damage = 1; // Cantidad de daño que hace el láser al alien
		//alien.receiveAttack(damage); // Llama al método de recepción de ataque del RegularAlien
		return true; // Devuelve true si el ataque tiene éxito
	}

	//ACTUAL ATTACK METHODS
	

	/**
	 * 
	 * @param other regular alien under attack by the laser
	 * @return always returns <code>true</code>
	 */
	private boolean weaponAttack(RegularAlien other) {
		return other.receiveAttack(this);	
	}

	//TODO fill your code


	// RECEIVE ATTACK METHODS
	
	/**
	 * Method to implement the effect of bomb attack on a laser
	 * @param weapon the received bomb
	 * @return always returns <code>true</code>
	 */	

	public boolean receiveAttack(Bomb weapon) {
		//receiveDamage(weapon.getDamage());
		return true;
	}
	
}