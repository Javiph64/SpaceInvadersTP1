package tp1.logic;

import java.util.Random;

import tp1.logic.lists.*;
import tp1.logic.gameobjects.*;


// TODO implementarlo
public class Game {

	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;
	
	private int currentCycle;
	private Random rand;
	private Level level;
	private long seed;
	private RegularAlienList regularAliens;
	private UCMShip player;
	private UCMLaser laser;
	private boolean doExit;
	private AlienManager alienManager;


	//TODO fill your code

	public Game(Level level, long seed) {
		//TODO fill your code
	}
	
	public Game(Level level, long seed, RegularAlienList regularAliens, UCMShip player, UCMLaser laser, AlienManager alienManager) {
		this.currentCycle = 0;
		this.level = level;
		this.seed = seed;
		this.regularAliens = regularAliens;
		this.player = player;
		this.laser = laser;
		this.doExit = false;
		this.alienManager = alienManager;
	}

	private void initGame() {
		//TODO
	}
	
	public UCMShip getUCMShip() {
		return this.player;
	}
	
	public void setUCMShip(UCMShip player) {
		this.player = player;
	}
	
	public AlienManager getAlienManager() {
		return this.alienManager;
	}
	
	public void setAlienManager(AlienManager alienManager) {
		this.alienManager = alienManager;
	}
	
	public String stateToString() {
		//TODO fill your code
		return null;
	}

	public int getCycle() {
		return this.currentCycle;
	}

	public int getRemainingAliens() {
		return alienManager.getRemainingAliens();
	}

	public String positionToString(int col, int row) {
		//TODO fill your code
		return null;
	}

	public boolean playerWin() {
		if(alienManager.getRemainingAliens() < 1) {
			return true;
		} 
		else {
			return false;
		}
	}

	public boolean aliensWin() {
		if(player.getLife() < 1) {
			return true;
		} 
		else {
			return false;
		}
	}

	public void enableLaser() {
		//TODO fill your code		
	}

	public Random getRandom() {
		return this.rand;
	}

	public Level getLevel() {
		return this.level;
	}
	
	public void update() {
		//TODO método que actualiza el juego
	}

	public void reset() {
		//TODO
	}
	
	public void addObject() {
		//TODO
	}
	
	public void positionToString() {
		//TODO
	}
	
	public boolean isFinished() {
		//TODO
		return false;
	}
	
	private void removeDead() {
		//TODO
	}
	
	private void computerActions() {
		//TODO
	}
	
	private void laserAutomaticMove() {
		//TODO
	}
	
	private void automaticMoves() {
		//TODO
	}
	
	public void exit() {
		//TODO
	}
	
	public String infoToString() {
		//TODO
		return null;
	}
	
	public void listOfShips() {
		//TODO
	}
	
	public void move() {
		//TODO
	}
	
	public void shootLaser() {
		//TODO
	}
	
	public void shockWave() {
		//TODO
	}
	
	public void receivePoints() {
		//TODO
	}
	
	public int getNumCyclesToMoveOneCell() {
		return 0;
	}
	
	private boolean haveLanded() {
		//TODO
		return false;
	}
	
	public int getRemainignAliens() {
		return this.alienManager.getRemainingAliens();
	}
	
	public void performAttack() {
		//TODO
	}
	
	public void checkAttackTol() {
		//TODO
	}
	
}