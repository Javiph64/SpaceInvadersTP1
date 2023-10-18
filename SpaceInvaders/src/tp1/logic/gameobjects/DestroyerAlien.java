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
	
	private int resistance = 1;
	private UCMLaser bomb;
	private int points = 10;
	
	private AlienManager alienManager;

}
