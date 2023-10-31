package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class ShockWave {
	
	// atributos
	
	public static final int DAMAGE = 1;

	private Game game;
	private boolean enabled;
	private int remainingCycles;
	
	// constructor
	
	public ShockWave(Game game) {
		this.game = game;
		this.enabled = false;
	}
	
	// getters y setters
	
	public Game getGame() {
		return this.game;
	}
	
	public boolean enabled() {
		return this.enabled;
	}
	
	public void enableShockWave() {
		this.enabled = true;
	}	
	
	public void disableShockWave() {
		this.enabled = false;
	}
	
	// otros métodos
	
	public void onDelete() {
		remainingCycles--; // simplemente decrementamos los ciclos restantes
		if(remainingCycles <= 0) {
			// Cuando no quedan ciclos restantes, la ShockWave se elimina definitivamente
			// Realizamos cualquier acción adicional necesaria
		}
	}
}
