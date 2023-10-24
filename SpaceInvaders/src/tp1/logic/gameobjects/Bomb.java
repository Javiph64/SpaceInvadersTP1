package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class Bomb {
	
	// atributos
	
	public static final int DAMAGE = 1;
	private static final int ARMOR = 1;
	
	private Position pos; //col, row
	private int life;
	private Game game;
	private String symbol;
	private boolean alive;
	private Move dir;
	private boolean enabled;
	
	// constructor
	
	public Bomb(Game game) {
		this.life = ARMOR;
		this.game = game;
		this.symbol = "*";
		this.alive = true;
		this.dir = Move.NONE;
		this.enabled = true;
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
	}	
	
	public boolean enabled() {
		return this.enabled;
	}
	
	public void enableBomb() {
		this.enabled = true;
	}
	
	public void disableBomb() {
		this.enabled = false;
	}
	
	// otros métodos
	
	public void onDelete() {
		
	}
	
	public void automaticMove () {
		performMovement(dir);
		if(isOut())
			die();
	}
	
	private boolean isOut() {
		//TODO fill your code
		return false;
	}
	
}
