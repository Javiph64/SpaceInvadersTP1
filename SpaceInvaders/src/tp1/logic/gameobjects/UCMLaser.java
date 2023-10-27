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
	
	public static final int DAMAGE = 3;
	private static final int ARMOR = 1;
	
	private Position pos;
	private int life;
	private Game game;
	private String symbol;
	public boolean alive;
	private Move dir;
	private boolean enable;
	
	// constructor 
	
	public UCMLaser(Game game) {
		this.life = ARMOR;
		this.game = game;
		this.symbol = "oo";
		this.alive = true;
		this.dir = Move.NONE;
		this.enable = true;
	}
	
	// getters y setters
	
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
	
	public int getLife() {
		return this.life;
	}	

	public void setLife(int life) {
		this.life = life;
	}
	
	public Game getGame() {
		return this.game;
	}
	
	private String getSymbol() {
		return this.symbol;
	}
	
	@Override
	public String toString() {
		return this.getSymbol();
	}	
	
	public boolean isAlive() {
		return this.alive;
	}
	
	private void die() {
		this.alive = false;
	}
	
	public Move getDir() {
		return this.dir;
	}
	
	public void performMovement(Move move) {
		this.dir = move;
		int x = move.getX();
		int y = move.getY();
		this.setPosition(this.getPosition().getCol() + x, this.getPosition().getRow() + y);
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
		
	// otros métodos
	
	public boolean isOnPosition(int col, int row) {
		if(this.pos.getCol() == col && this.pos.getRow() == row ) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 *  Method called when the laser disappears from the board
	 */
	public void onDelete() {
		game.enableLaser();
	}

	/**
	 *  Implements the automatic movement of the laser	
	 */
	public void automaticMove () {
		performMovement(dir);
		if(isOut())
			die();
	}
	
	// PERFORM ATTACK METHODS	

	private boolean isOut() {
		//TODO fill your code
		return false;
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
       		 alien.receiveAttack(damage); // Llama al método de recepción de ataque del RegularAlien
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
		int damage = 2; // Cantidad de daño que hace el láser al destroyer alien
        	alien.receiveAttack(damage); // Llama al método de recepción de ataque del DestroyerAlien
        	return true; // Devuelve true si el ataque tiene éxito
	}
	
	
	//TODO fill your code


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

	public void receiveDamage() {
		//TODO no estoy seguro de qué hay que hacer con este método pero parece necesario
	}

	public boolean receiveAttack(Bomb weapon) {
		//receiveDamage(weapon.getDamage());
		return true;
	}
	
}
