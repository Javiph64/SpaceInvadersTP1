package tp1.logic;

import java.util.Random;

import tp1.logic.lists.*;
import tp1.logic.gameobjects.*;


// TODO implementarlo
public class Game {

	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;

	public RegularAlienList regularAlienList;
	public DestroyerAlienList destroyerAlienList;
	public BombList bombList;
	public AlienManager alienManager;
	public int cycles;
	public int points;
	public Random rand;
	public UCMShip ship;


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
		return alienManager.getRemainingAliens();
	}

	public String positionToString(int col, int row) {
		//TODO fill your code
		return null;
	}

	public boolean playerWin() {
		if(alienManager.getRemainingAliens() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean aliensWin() {
		if(ship.getLifes() == 0) {
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