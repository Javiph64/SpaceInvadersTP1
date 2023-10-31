package tp1.logic;

import tp1.logic.gameobjects.DestroyerAlien;
import tp1.logic.gameobjects.RegularAlien;
import tp1.logic.lists.DestroyerAlienList;
import tp1.logic.lists.RegularAlienList;
import tp1.logic.gameobjects.Ufo;

/**
 * 
 * Manages alien initialization and
 * used by aliens to coordinate movement
 *
 */
public class AlienManager {
	
	// atributos
	
	private int remainingAliens = 0;
	private int shipsOnBorder = 0;	
	private boolean squadInFinalRow = false;
	private boolean onBorder;
	private Game game;
	private Level level;
	
	// constructor

	public AlienManager(Game game, Level level) {
		this.game = game;
		this.level = level;
	}
	
	// getters y setters
	
	public int getRemainingAliens() {
		return this.remainingAliens;
	}
	
	public void setRemainingAliens(int remainingAliens) {
		this.remainingAliens = remainingAliens;
	}
	
	public int getShipsOnBorder() {
		return this.shipsOnBorder;
	}
	
	public void setShipsOnBorder(int num) {
		this.shipsOnBorder = num;
	}
	
	public boolean isSquadInFinalRow() {
		return this.squadInFinalRow;
	}
	
	public void setSquadInFinalRow() {
		this.squadInFinalRow = !this.squadInFinalRow;
	}
	
	public boolean isOnBorder() {
		return this.onBorder;
	}
	
	public void setIsOnBorder() {
		this.onBorder = !this.onBorder;
	}
	
	public Game getGame() {
		return this.game;
	}
	
	public Level getLevel() {
		return this.level;
	}
	
	public void setLevel(Level level) {
		this.level = level;
	}
		
	// inicializadores
	
	protected RegularAlienList initializeRegularAliens() {
		int regularAliensNum = 0;
		int limit = 0;
		RegularAlienList regularAliens = null;
		if(this.level == Level.EASY) {
			regularAliensNum = 4;
			limit = 4;
			regularAliens = new RegularAlienList(regularAliensNum, limit);
		}
		else if(this.level == Level.HARD || this.level == Level.INSANE){
			regularAliensNum = 8;
			limit = 8;
			regularAliens = new RegularAlienList(regularAliensNum, limit);
		}
		return regularAliens;
	}

	protected DestroyerAlienList initializeDestroyerAliens() {
		int destroyerAliensNum = 0;
		int limit = 0;
		DestroyerAlienList destroyerAliens = null;
		if(this.level == Level.EASY || this.level == Level.HARD) {
			destroyerAliensNum = 2;
			limit = 2;
			destroyerAliens = new DestroyerAlienList(destroyerAliensNum, limit);
		}
		else if(this.level == Level.INSANE){
			destroyerAliensNum = 4;
			limit = 4;
			destroyerAliens = new DestroyerAlienList(destroyerAliensNum, limit);
		}
		return destroyerAliens;
	}
	
	// otros métodos
	
	public boolean allAllienDead(RegularAlienList regularAlienList) {
		if(regularAlienList.getNum() < 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean allAllienDead(DestroyerAlienList destroyerAlienList) {
		if(destroyerAlienList.getNum() < 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean allAllienDead() {
		if(this.getRemainingAliens() < 1) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public boolean alienDead(RegularAlien alien) {
		if(alien.getLife() < 1) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public boolean alienDead(DestroyerAlien alien) {
		if(alien.getLife() < 1) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public boolean alienDead(Ufo alien) {
		if(alien.getLife() < 1) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	public boolean haveLanded() {
		//TODO
		return false;
	}
	
	public boolean finalRowReached(RegularAlien regularAlien) {
		return regularAlien.getPosition().getRow() == 8;
	}
	
	public boolean readyToDescend() {
		//TODO
		return false;
	}
	
	public void decreaseOnBorder() {
		//TODO
	}
	
	// CONTROL METHODS
	
	public boolean shipOnBorder() {
		return this.game.getUCMShip().isOut();
	}

	public boolean onBorder(RegularAlien alien) {
		if((alien.getPosition().getCol() >= 0 && alien.getPosition().getCol() <= 7) && 
				(alien.getPosition().getRow() >= 0 || alien.getPosition().getRow() <= 8)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean onBorder(DestroyerAlien alien) {
		if((alien.getPosition().getCol() >= 0 && alien.getPosition().getCol() <= 7) && 
				(alien.getPosition().getRow() >= 0 || alien.getPosition().getRow() <= 8)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean onBorder(Ufo alien) {
		if((alien.getPosition().getCol() >= 0 && alien.getPosition().getCol() <= 7) && 
				(alien.getPosition().getRow() >= 0 || alien.getPosition().getRow() <= 8)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void removeAlien(RegularAlien alien) {
		if(!alien.isAlive()) {
			
		}
	}
	
	public void removeAlien(DestroyerAlien alien) {
		if(!alien.isAlive()) {
			
		}
	}

}