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
	private int cyclesToMove;
	private int speed;
	private Move dir;
	
	private int resistance = 2;
	private int points = 5;
	
	private AlienManager alienManager;

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
		//TODO fill your code
		return false;
	}
	

}