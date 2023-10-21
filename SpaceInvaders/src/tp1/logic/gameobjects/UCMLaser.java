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
	
	//TODO fill your code
	public static final int DAMAGE = 3;
	private static final int ARMOUR = 0; // ¿el láser tiene armadura?
	
	private Position pos;
	private int life;
	private Move dir;
	private Game game;
	
	public void UCMLaser(Game game) {
		Position pos = new Position(4,7); // ver cómo determinamos la posición del láser
		this.pos = pos;
		this.life = 1;
		this.game = game;
	}
	
	public boolean isAlive() {
		if(this.life == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	/*
	public Position isOnPosition() {
		return this.pos;
	}
	*/
	
	public Position getPosition() {
		return this.pos;
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
	
	
	
	
	private void die() {
		//TODO fill your code
	}

	private boolean isOut() {
		//TODO fill your code
		return false;
	}

	private void performMovement(Move dir) {
		//TODO fill your code
	}

	/**
	 * Method that implements the attack by the laser to a regular alien.
	 * It checks whether both objects are alive and in the same position.
	 * If so call the "actual" attack method {@link weaponAttack}.
	 * @param other the regular alien possibly under attack
	 * @return <code>true</code> if the alien has been attacked by the laser.
	 */
	public boolean performAttack(RegularAlien other) {
		//TODO fill your code
		return false;
	}

	/**
	 * Method that implements the attack by the laser to a destroyer alien.
	 * It checks whether both objects are alive and in the same position.
	 * If so call the "actual" attack method {@link weaponAttack}.
	 * @param other the destroyer alien possibly under attack
	 * @return <code>true</code> if the alien has been attacked by the laser.
	 */

	
	public boolean performAttack(DestroyerAlien other) {
		//TODO fill your code
		return false;
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
	
	public boolean receiveAttack(Bomb weapon) {
		receiveDamage(weapon.getDamage());
		return true;
	}
	
	
	public void onDelete() {
		
	}

}