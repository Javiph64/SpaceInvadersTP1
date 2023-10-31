package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;
import tp1.logic.gameobjects.UCMLaser;

public class UCMShip {
		
	// atributos 
	
	private static final int ARMOR = 3;
	private static final int DAMAGE = 0;
	

	private int life = ARMOR;
	private int speed;
	private boolean canShoot = true;
	private boolean alive = true;
	private String symbol = "^__^";		
	private Game game;
	private Position pos;	
	private UCMLaser laser;
	private Move dir;	
	
	// constructor
	
	public UCMShip(Game game, Position pos) {
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
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setLaser(UCMLaser laser) {
		this.laser = laser;
	}
	
	public boolean canShoot() {
		return this.canShoot;
	}
	
	public void setCanShoot() {
		this.canShoot = !this.canShoot;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public void die() {
		this.alive = false;
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

	public void performMovement(Move move) {
		this.dir = move;
		int x = move.getX();
		int y = move.getY();
		this.setPosition(this.getPosition().getCol() + x, this.getPosition().getRow() + y);
	}

	
	public UCMLaser getLaser() {
		return this.laser;
	}
	
	public void setLaser(UCMLaser laser) {
		this.laser = laser;
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
				(this.getPosition().getRow() < 0 || this.getPosition().getRow() > 8)) {
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
	
	public String stateToString() {
		return "Position: " + getInfo() + "\n" + "Description: " + 
				getDescription() + "\n" + "Damage: " + getDamage();
	}
	
	public String getInfo() {
		String info = "Col: " + this.getPosition().getCol() + " Row: " + this.getPosition().getRow();
		return info;
	}
	
	public String getDescription() {
		//TODO
		return null;
	}	
	
	public void onDelete() {
		System.out.println("Player eliminated.");
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
