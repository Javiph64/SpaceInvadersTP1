package tp1.logic;

import java.util.Random;

import tp1.logic.lists.*;
import tp1.logic.gameobjects.*;

public class Game {
	
	// atributos

	public static final int DIM_X = 9;
	public static final int DIM_Y = 8;
	
	private int currentCycle;
	private Random rand;
	private Level level;
	private long seed;
	private RegularAlienList regularAliens;
	private DestroyerAlienList destroyerAliens;
	private UCMShip player;
	private UCMLaser laser;
	private boolean doExit;
	private AlienManager alienManager;
	
	private int regularAliensNum;
	private int destroyerAliensNum;
	private double shootFrecuency;
	private double ufoFrecuency;

	// constructor

	public Game(Level level, long seed) {
		this.doExit = false;
	}
	
	// inicialización del juego
	
	private void initGame() {
		if(this.level == Level.EASY) {
			int limit = 4;
			this.regularAliensNum = 4;
			this.destroyerAliensNum = 2;
			this.shootFrecuency = 0.1;
			this.player.setSpeed(3);
			this.ufoFrecuency = 0.5;
			RegularAlienList regularAliens = new RegularAlienList(regularAliensNum, limit);
			DestroyerAlienList destroyerAliens = new DestroyerAlienList(destroyerAliensNum, limit);
		}
		else if(this.level == Level.HARD){
			int limit = 8;
			this.regularAliensNum = 8;
			this.destroyerAliensNum = 2;
			this.shootFrecuency = 0.3;
			this.player.setSpeed(2);
			this.ufoFrecuency = 0.2;
			RegularAlienList regularAliens = new RegularAlienList(regularAliensNum, limit);
			DestroyerAlienList destroyerAliens = new DestroyerAlienList(destroyerAliensNum, limit);
		}
		else {
			int limit = 4;
			this.regularAliensNum = 4;
			this.destroyerAliensNum = 2;
			this.shootFrecuency = 0.1;
			this.player.setSpeed(1);
			this.ufoFrecuency = 0.1;
			RegularAlienList regularAliens = new RegularAlienList(regularAliensNum, limit);
			DestroyerAlienList destroyerAliens = new DestroyerAlienList(destroyerAliensNum, limit);
		}
	}
	
	// getters y setters
	
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
	
	public UCMLaser getLaser() {
		return this.laser;
	}
	
	public void setLaser(UCMLaser laser) {
		this.laser = laser;
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
	
	public int getRegularAliensNum() {
		return this.regularAliensNum;
	}
	
	public void setRegularAliensNum(int regularAliensNum) {
		this.regularAliensNum = regularAliensNum;
	}
	
	public int getDestroyerAliensNum() {
		return this.destroyerAliensNum;
	}
	
	public void setDestroyerAliensNum(int destroyerAliensNum) {
		this.destroyerAliensNum = destroyerAliensNum;
	}
	
	public double getShootFrecuency() {
		return this.shootFrecuency;
	}
	
	public void setShootFrecuency(double shootFrecuency) {
		this.shootFrecuency = shootFrecuency;
	}
	
	public double getUfoFrecuency() {
		return this.ufoFrecuency;
	}
	
	public void setUfoFrecuency(double ufoFrecuency) {
		this.ufoFrecuency = ufoFrecuency;
	}
	
	// otros métodos
	
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