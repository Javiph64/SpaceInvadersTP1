package tp1.logic.gameobjects;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.logic.Position;

public class Bomb {
	
	public static final int DAMAGE = 3;
	
	private Position pos; //col, row
	private int life;
	private Game game;
	private String symbol = "*";
	private boolean alive;
	
	public void onDelete() {
		
	}
	
	public int getDamage() {
		return this.DAMAGE;
	}
}
