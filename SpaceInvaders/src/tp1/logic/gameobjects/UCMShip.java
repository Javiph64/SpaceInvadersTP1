package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class UCMShip {
	
	/*
	 * 
	 * Comportamiento: Se mueve horizontalmente y realiza disparos. Inicialmente se coloca en 
	 * la casilla (4,7).
	 * 
	 * Resistencia: 3 puntos de daño.
	 * 
	 * Disparo: Lanza un láser. No puede haber más de un láser en el tablero.
	 * El láser avanzará verticalmente de forma que hasta que no haya alcanzado una nave 
	 * alienígena, una bomba, un ovni o haya llegado al final del tablero, no se podrá disparar 
	 * uno nuevo. Si el jugador realiza el disparo, el láser tendrá, en el momento de realizar la
	 * acción, la misma coordenada que UCMShip. Sin embargo, su trayectoria se actualizará en la 
	 * acción update del mismo ciclo.
	 * 
	 * Daño: El comportamiento estándar del disparo ocasiona un punto de daño en la nave impactada.
	 */
	
	private int cyclesToMove;
	private int speed;
	private Move dir;
	
	private int resistance = 3;
	private UCMLaser shoot;
	private int damage = 1;
}
