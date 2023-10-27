package tp1.logic.gameobjects;

import tp1.logic.AlienManager;
import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

/**
 * 
 * Class representing a regular alien
 *
 */
public class RegularAlien {

	// atributos
	
	private static final int ARMOR = 2;
	
	private Position pos;
	private int life;
	private Game game;
	private int cyclesToMove;
	private int speed;
	private Move dir;		
	private AlienManager alienManager;
	private boolean alive;
	private String symbol;
	
	// constructor
	
	public RegularAlien() {
		this.life = ARMOR;
		this.dir = Move.NONE;
		this.alive = true;
		this.symbol = "R";
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
		int x = move.getX();
		int y = move.getY();
		this.setPosition(this.getPosition().getCol() + x, this.getPosition().getRow() + y);
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
		 // Por ejemplo, decidimos movernos hacia abajo o disparar de manera aleatoria
       		 boolean shouldMoveDown = Math.random() < 0.2; // Probabilidad del 20%
       		 boolean shouldShoot = Math.random() < 0.1; // Probabilidad del 10%

      		  if (shouldMoveDown) {
           		 // Realiza la acción de mover hacia abajo
          		  moveDown();
        	}

        	  if (shouldShoot) {
           		 // Realiza la acción de disparar
           		 shoot();
       		 }
	}

	//TODO fill your code

	/**
	 *  Implements the automatic movement of the regular alien	
	 */
	public void automaticMove() {
		//TODO fill your code
	}
	
	private boolean readyToDescend() {
		//TODO
		return false;
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
		if (!isAlive()) {
            		// Notificar la eliminación al AlienManager para actualizar el contador
            		AlienManager.notifyAlienDestroyed(this);
        	}
	}
	
}
