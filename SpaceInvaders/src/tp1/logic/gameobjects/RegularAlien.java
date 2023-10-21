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
	
	/*
	 *Comportamiento: Se desplaza horizontalmente. Cuando una nave alienígena llega al borde 
	 *del tablero, todas las naves se desplazarán una casilla hacia abajo y su movimiento lateral 
	 *se realizará hacia el borde opuesto, tal y como ocurre en el juego original. El 
	 *desplazamiento vertical se realizará en el ciclo siguiente al de haber alcanzado el borde 
	 *del tablero, independientemente de la velocidad establecida por la dificultad del juego.
	 *
	 *Resistencia: 2 puntos de daño.
	 *
	 *Disparo: Esta nave no realiza disparos.
	 *
	 *Puntos: 5 puntos al ser destruida.
	 */

	//TODO fill your code
	private static final int ARMOR = 2;
	private Position pos; //col, row
	private int life;
	private Game game;
	private int cyclesToMove;
	private int speed;
	//private Move dir;		
	private AlienManager alienManager;
	
	public RegularAlien() {
		this.speed = 1;
		Position pos = new Position(0,0); // ver cómo determinamos la posición del alien
		this.pos = pos;
		this.life = ARMOR;
		this.speed = 1;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public boolean isAlife() {
		if(this.getLife() < 1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void die() {
		//TODO
	}
	
	public boolean isOnPosition(int col, int row) {
		if(this.pos.getCol() == col && this.pos.getRow() == row ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
	public int receiveDamage(int damage) {
		//TODO
		return 0;
	}
	
	public boolean isOut() {
		//TODO
		return false;
	}
	
	public boolean isInFinalRow() {
		//TODO
		return false;
	}
	
	private String getSymbol() {
		//TODO
		return null;
	}
	
	@Override
	public String toString() {
		//TODO
		return null;
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

	//TODO fill your code

	/**
	 *  Implements the automatic movement of the regular alien	
	 */
	public void automaticMove() {
		//TODO fill your code
	}

	private void descent() {
		//TODO fill your code
		
	}

	private void performMovement(Move dir) {
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