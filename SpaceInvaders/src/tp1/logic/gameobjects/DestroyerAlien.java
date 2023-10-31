package tp1.logic.gameobjects;

import tp1.logic.AlienManager;
import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class DestroyerAlien {
	
	// atributos
	
	private static final int ARMOR = 1;
	
	private int life = ARMOR;
	private int speed;
	private int cyclesToMove;
	private boolean alive = true;
	private boolean canShoot = true;
	private String symbol = "D";
	private Game game;
	private Position pos;
	private AlienManager alienManager;
	private Move dir;	
	
	// constructor
	
	public DestroyerAlien(Game game, AlienManager alienManager) {
		this.game = game;
		this.alienManager = alienManager;
	}
	
	// getters y setters
	
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
	
	public int getCyclesToMove() {
		return this.cyclesToMove;
	}
	
	public void setCyclesToMove(int cycles) {
		this.cyclesToMove = cycles;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public void die() {
		this.alive = false;
	}
	
	public boolean canShoot() {
		return this.canShoot;
	}
	
	public void enableShoot() {
		this.canShoot = true;
	}
	
	public void disableShoot() {
		this.canShoot = false;
	}
	
	private String getSymbol() {
		return this.symbol;
	}
	
	@Override
	public String toString() {
		return this.getSymbol() + "[0" + this.getLife() + "]";
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
	
	public AlienManager getAlienManager() {
		return this.alienManager;
	}	
	
	public Move getDir() {
		return this.dir;
	}
		
	// otros métodos	
	
	public boolean isOnPosition(Position pos) {
		return this.pos == pos;
	}
	
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
	
	public boolean isInFinalRow() {
		return this.getPosition().getRow() == 8;
	}
	
	public void performMovement(Move move) {
		this.dir = move;
		int x = move.getX();
		int y = move.getY();
		this.setPosition(this.getPosition().getCol() + x, this.getPosition().getRow() + y);
	}	
	
	public String getInfo() {
		String info = "Col: " + this.getPosition().getCol() + " Row: " + this.getPosition().getRow();
		return info;
	}
	
	private String getDescription() {
		//TODO
		return null;
	}
	
	public int getDamage() {
		if(this.life == ARMOR) {
			return 0;
		}
		else {
			return ARMOR - this.life;
		}
	}
	
	public void increaseCycle() {
		this.cyclesToMove++;
	}
	
	public void decreaseCycle() {
		this.cyclesToMove--;
	}
	
	public void computerAction(Game game) {
		// Obtener la frecuencia de disparo del nivel de dificultad actual
        	double shootFrequency = game.getShootFrecuency();

        	// Generar un número aleatorio entre 0 y 1
        	double randomValue = Math.random();

        	// Si el valor aleatorio es menor que la frecuencia de disparo, lanzar una bomba
        	if (randomValue < shootFrequency) {
            		game.addBomb(new Bomb(game));
       		}    	
	}
	
	public void notifyBombDestroyed(Bomb bomb) {
		
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
			//this.onDelete();
		}
		return false;
	}
	
	public void onDelete(AlienManager alienManager) {
		//TODO método que elimina la nave si se ha quedado sin vidas
		// Notificar la eliminación al AlienManager
        	alienManager.removeAlien(this);
	}
	
	private boolean readyToDescend() {
		//TODO
		return false;
	}

}