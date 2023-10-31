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
	
	// atributos
	
	private static final int ARMOR = 1;
		
	private Position pos; //col, row
	private int life;
	private Game game;
	private int cyclesToMove;
	private int speed;
	private Move dir;		
	private AlienManager alienManager;
	private boolean alive;
	private String symbol;
	private boolean enabled;
	
	// constructor 
	
	public Ufo(Game game, AlienManager alienManager) {
		this.game = game;
		Position pos = new Position(8,0); // ver cómo determinamos la posición del alien
		this.pos = pos;
		this.life = ARMOR;
		this.dir = Move.NONE;
		this.alienManager = alienManager;
		this.alive = true;
		this.symbol = "U";
		this.enabled = true;
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
	
	private boolean enabled() {
		return this.enabled;
	}
	
	public void enableUfo() {
		this.enabled = true;
	}
	
	public void disableUfo() {
		this.enabled = false;
	}
	
	
	// otros métodos
	
	public void increaseCycle() {
		this.cyclesToMove++;
	}
	
	public void decreaseCycle() {
		this.cyclesToMove--;
	}
	
	public boolean isOnPosition(int col, int row) {
		if(this.pos.getCol() == col && this.pos.getRow() == row ) {
			return true;
		}
		else {
			return false;
		}
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
	
	//TODO fill your code

	public void computerAction() {
		if(enabled() == false && canGenerateRandomUfo()) {
			enableUfo();
		}
	}
	
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
			this.onDelete();
		}
		return false;
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