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
	
	private int cyclesToMove;
	private int speed;
	private Move dir;
	private Position pos; //col, row
	private int life;
	
	private AlienManager alienManager;
	
	public DestroyerAlien() {
		this.speed = 1;
		Position pos = new Position(0,0); // ver cómo determinamos la posición del alien
		this.pos = pos;
		this.life = 3;
	}
	
	public int getLife() {
		return this.life;
	}
	
	public void computerAction() {
		
	}
	
	public void onDelete() {
		
	}

}
