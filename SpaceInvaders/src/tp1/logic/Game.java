package tp1.logic;

import java.util.Random;

// TODO implementarlo
public class Game {

	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;
	
	private RegularAlienList regularAlienList;
	private DestroyerShipList destroyerShipList;
	private BombList bombList;
	private AlienManager alienManager;
	private int cycles;
	private int points;
	private Random rand;
	private UCMShip ship;

	//TODO fill your code

	public Game(Level level, long seed) {
		//TODO fill your code
	}

	public String stateToString() {
		//TODO fill your code
		return null;
	}

	public int getCycle() {
		return cycles;
	}

	public int getRemainingAliens() {
		return alienManager.remainingAliens;
	}

	public String positionToString(int col, int row) {
		//TODO fill your code
		return null;
	}

	public boolean playerWin() {
		if(alienManager.remainingAliens == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean aliensWin() {
		if(ship.lifes == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enableLaser() {
		//TODO fill your code		
	}

	public Random getRandom() {
		//TODO fill your code
		return null;
	}

	public Level getLevel() {
		//TODO fill your code
		return null;
	}
	
	public void update() {
		//TODO método que actualiza el juego
	}

}