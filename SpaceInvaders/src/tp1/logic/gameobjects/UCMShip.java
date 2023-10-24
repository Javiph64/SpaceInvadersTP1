package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;
import tp1.logic.gameobjects.UCMLaser;

public class UCMShip {
		
	// atributos 
	
	private static final int ARMOR = 3;
	
	private Position pos; //col, row
	private int life;
	private Game game;
	private boolean canShoot;
	private String symbol;
	private boolean alive;
	private UCMLaser laser;
	private Move dir;
	private int speed;
	
	// constructor
	
	public UCMShip(Game game, UCMLaser laser) {
		Position pos = new Position(4,7);
		this.pos = pos;
		this.life = ARMOR;
		this.canShoot = true;
		this.symbol = "^__^";
		this.game = game;
		this.laser = laser;
		this.alive = true;
		this.dir = Move.NONE;
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
	
	public UCMLaser getLaser() {
		return this.laser;
	}
	
	public boolean canShoot() {
		return canShoot;
	}
	
	public void setCanShoot() {
		this.canShoot = !this.canShoot;
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
	
	public void die() {
		this.alive = false;
	}
	
	public Move getDir() {
		return this.dir;
	}
	
	public void performMovement(Move move) {
		this.dir = move;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// otros métodos	
	
	public boolean isOnPosition(int col, int row) {
		return this.pos.getCol() == col && this.pos.getRow() == row;
	}
	
	public boolean isOut() {
		//TODO
		return false;
	}	
	
	public String stateToString() {
		if(isAlive()) {
			return "Alive";
		}
		else {
			return "Dead";
		}
	}
	
	public String getInfo() {
		//TODO
		return null;
	}
	
	public String getDescription() {
		//TODO
		return null;
	}
	
	public void receiveDamage(int damage) {
		this.life = this.life - damage;
		if(this.getLife() < 1) {
			die();
		}
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