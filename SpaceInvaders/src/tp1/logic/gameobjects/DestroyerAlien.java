package tp1.logic.gameobjects;

import tp1.logic.AlienManager;
import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class DestroyerAlien {
	
	/*
	 * Comportamiento: El movimiento es el mismo que la nave común.
	 * 
	 * Resistencia: 1 punto de daño.
	 * 
	 * Disparo: Deja caer una bomba. El movimiento de la bomba es vertical en el sentido
	 * hacia donde se encuentra UCMShip.
	 * 
	 * Daño: 1 punto de daño.
	 * 
	 * Puntos: 10 puntos al ser destruida.
	 */
	
	// atributos
	
	private static final int ARMOR = 1;
	
	private Position pos; //col, row
	private int life;
	private Game game;
	private int cyclesToMove;
	private boolean canShoot;
	private int speed;
	private Move dir;		
	private AlienManager alienManager;
	private boolean alive;
	private String symbol;
	
	// constructor
	
	public DestroyerAlien(Game game, AlienManager alienManager) {
		this.game = game;
		Position pos = new Position(0,0); // ver cómo determinamos la posición del alien
		this.pos = pos;
		this.life = ARMOR;
		this.dir = Move.NONE;
		this.alienManager = alienManager;
		this.alive = true;
		this.symbol = "D";
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
	
	public int getCyclesToMove() {
		return this.cyclesToMove;
	}
	
	public void setCyclesToMove(int cycles) {
		this.cyclesToMove = cycles;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
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
	
	public AlienManager getAlienManager() {
		return this.alienManager;
	}
	
	private String getSymbol() {
		return this.symbol;
	}
	
	@Override
	public String toString() {
		return this.getSymbol() + "[0" + this.getLife() + "]";
	}
	// otros métodos
	
	public void increaseCycle() {
		this.cyclesToMove++;
	}
	
	public void decreaseCycle() {
		this.cyclesToMove--;
	}
	
	public boolean isOnPosition(int col, int row) {
		if(this.pos.getCol() == col && this.pos.getRow() == row ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void receiveDamage(int damage) {
		this.life = this.life - damage;
		if(this.getLife() < 1) {
			die();
		}
	}
	
	public boolean isOut() {
		//TODO
		return false;
	}
	
	public boolean isInFinalRow() {
		//TODO
		return false;
	}	
	
	public String getInfo() {
		//TODO
		return null;
	}
	
	private String getDescription() {
		//TODO
		return null;
	}
	
	public int getDamage() {
		//TODO
		return 0;
	}
	
	public void computerAction() {
		//TODO
	}
	
	public void automaticMove() {
		//TODO fill your code
	}

	private void descent() {
		//TODO fill your code		
	}

	private boolean isInBorder() {
		//TODO fill your code
		return false;
	}

	public boolean receiveAttack(UCMLaser laser) {
		if (life > 1) {
			life--;
		}
		else if(life == 1 ) {
			life--;
			this.onDelete();
		}
		return false;
	}
	
	public void onDelete() {
		//TODO método que elimina la nave si se ha quedado sin vidas
	}
	
	private boolean readyToDescend() {
		//TODO
		return false;
	}

}
