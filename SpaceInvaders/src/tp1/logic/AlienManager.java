package tp1.logic;

import tp1.logic.gameobjects.DestroyerAlien;
import tp1.logic.gameobjects.RegularAlien;
import tp1.logic.lists.DestroyerAlienList;
import tp1.logic.lists.RegularAlienList;

/**
 * 
 * Manages alien initialization and
 * used by aliens to coordinate movement
 *
 */
public class AlienManager {
	
	private Level level;
	private Game game;
	private int remainingAliens;
	
	private boolean squadInFinalRow;
	private int shipsOnBorder;
	private boolean onBorder;

	public AlienManager(Game game, Level level) {
		this.level = level;
		this.game = game;
		this.remainingAliens = 0;
	}
	
	public int getRemainingAliens() {
		return remainingAliens;
	}
		
	// INITIALIZER METHODS
	
	/**
	 * Initializes the list of regular aliens
	 * @return the initial list of regular aliens according to the current level
	 */
	protected RegularAlienList initializeRegularAliens() {
		//TODO fill your code
		return null;
	}

	/**
	 * Initializes the list of destroyer aliens
	 * @return the initial list of destroyer aliens according to the current level
	 */
	protected DestroyerAlienList initializeDestroyerAliens() {
		//TODO fill your code
		return null;
	}

	
	// CONTROL METHODS
		
	public void shipOnBorder() {
		if(!onBorder) {
			onBorder = true;
			shipsOnBorder = remainingAliens;
		}
	}

	public boolean onBorder() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public int getRemainingAliens() {
		return this.remainingAliens;
	}
	
	public boolean allAllienDead() {
		if(getRemainingAliens() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean alienDead(RegularAlien alien) {
		if(alien.getLife() < 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean alienDead(DestroyerAlien alien) {
		if(alien.getLife() < 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean alienDead(Ufo alien) {
		if(alien.getLife() < 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean haveLanded() {
		//TODO
		return false;
	}
	
	public boolean finalRowReached() {
		//TODO
		return false;
	}
	
	public boolean readyToDescend() {
		//TODO
		return false;
	}
	
	public void decreaseOnBorder() {
		//TODO
	}
	
	public boolean shipOnBorder() {
		//TODO
		return false;
	}
	
	public boolean onBorder() {
		//TODO
		return false;
	}
	
	
	

}