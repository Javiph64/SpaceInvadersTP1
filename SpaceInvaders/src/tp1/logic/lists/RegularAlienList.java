package tp1.logic.lists;

import tp1.logic.Position;
import tp1.logic.gameobjects.RegularAlien;
import tp1.logic.Game;
import tp1.logic.AlienManager;

public class RegularAlienList {
	
	// atributos
	
	private RegularAlien[] objects;
	private int num;
	private int limit;
	private Game game;
	private AlienManager alienManager;
	
	// constructor
	
	public RegularAlienList(Game game, AlienManager alienManager, int num, int limit) {
		this.game = game;
		this.alienManager = alienManager;
		this.objects = new RegularAlien[num];
		this.num = num;
		this.limit = limit;
	}
	
	// getters y setters
	
	public RegularAlien[] getObjects() {
		return this.objects;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getLimit() {
		return this.limit;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public Game getGame() {
		return this.game;
	}
	
	public AlienManager getAlienManager() {
		return this.alienManager;
	}
	
	// otros métodos
	
	public void initRegularAlienList() {
		for(int i = 0; i < num; i++) {
			RegularAlien alien = new RegularAlien(this.game, this.alienManager);
			objects[i] = alien;
		}
	}
	
	public void add(RegularAlien alien, int limit) {
		if(this.num < limit) {
			this.objects[num] = alien;
			this.num++;
		}
	}
	
	private void remove(RegularAlien alien) {
		if(this.num > 1) {
			this.num--;
		}
	}
	
	public int size() {
		return this.num;
	}
	
	private RegularAlien getObjectInPosition(Position pos) {
		RegularAlien alien = null;
		for(int i = 0; i < num; i++) {
			if(objects[i].isOnPosition(pos)){
				alien = objects[i];
			}
		}
		return alien;
	}
	
	@Override
	public String toString() {
		String alienText = "";
		for(int i = 0; i < num; i++) {
			alienText = alienText + objects[i].toString() + " ";
		}
		return alienText;
	}
	
	// revisar este método
	
	public String getAliensToString(Position pos) {
		String text = " ";
		for(int i = 0; i < num; i++) {
			if(objects[i].isOnPosition(pos)) {
				text = objects[i].toString();
			}
		}
		return text;
	}
	
	public void computerActions() {
		/*
		for(RegularAlien regularAlien : this.regularAliens) {
			// Por ejemplo, decidir si debe disparar (atacar) de manera aleatoria
			boolean shouldShoot = Math.random() < 0.1; // Probabilidad del 10%
			if(shouldShoot) {
				// Realiza la acción de disparar (atacar)
				regularAlien.Shoot(); // Esto podría agregar un disparo a una lista de disparos pendientes
			}
		}
		*/
	}
	
	public void automaticActions() {
		//TODO
	}
	
	// revisar este método
	public void removeDead() {
		for(int i = 0; i < num; i++) {
			if(!objects[i].isAlive()) {
				for(int j = i; j < num - 1; j++) {
					objects[j] = objects[j + 1];
					num--;
				}
			}
		}
	}
	
	public void checkAttacks() {
		//TODO
	}

}