package tp1.logic.gameobjects;

import tp1.logic.AlienManager;
import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;


public class Ufo {
	
/*
 * Comportamiento: Inicialmente aparece en la casilla (8,0), es decir, en la esquina superior 
 * derecha. Se desplaza horizontalmente una casilla por cada ciclo, hasta alcanzar el borde del 
 * tablero, o ser destruido por un láser de UCMShip. Si es alcanzado por un disparo de UCMShip, 
 * proporcionará al jugador un superpoder llamado shockWave. El shockWave no se acumula: si el 
 * jugador ya dispone de uno y alcanza a un ovni, tendrá un solo shockWave activo y no dos. Una 
 * vez recorridas las casillas de la fila en la que aparece, el ovni se elimina del tablero.
 * 
 * Resistencia: 1 punto de daño.
 * 
 * Disparo: Esta nave no realiza disparos.
 * 
 * Puntos: 25 puntos al ser destruido.
 */
	
	private int cyclesToMove;
	private int speed;
	private Move dir;
	
	private int resistance = 1;
	private int points = 25;
	
	private AlienManager alienManager;

	//TODO fill your code

	private boolean enabled;
	private Game game;
	
	//TODO fill your code

	public void computerAction() {
		if(!enabled && canGenerateRandomUfo()) {
			enable();
		}
	}
	
	private void enable() {
		//TODO fill your code
	}

	public void onDelete() {
		//TODO fill your code
	}

	/**
	 * Checks if the game should generate an ufo.
	 * 
	 * @return <code>true</code> if an ufo should be generated.
	 */
	private boolean canGenerateRandomUfo(){
		return game.getRandom().nextDouble() < game.getLevel().getUfoFrequency();
	}
	
}