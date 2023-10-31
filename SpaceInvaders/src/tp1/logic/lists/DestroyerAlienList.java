package tp1.logic.lists;

import tp1.logic.Position;
import tp1.logic.gameobjects.DestroyerAlien;
import tp1.logic.Game;
import tp1.logic.AlienManager;

public class DestroyerAlienList {
	
	// atributos
	
	private DestroyerAlien[] objects;
	private int num;
	private int limit;
	private Game game;
	private AlienManager alienManager;
	
	// constructor
	
	public DestroyerAlienList(Game game, AlienManager alienManager, int num, int limit) {
		this.game = game;
		this.alienManager = alienManager;
		this.objects = new DestroyerAlien[num];
		this.num = num;
		this.limit = limit;
	}
	
	// getters y setters
	
	public DestroyerAlien[] getObjects() {
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
	
	public void initDestroyerAlienList() {
		for(int i = 0; i < num; i++) {
			DestroyerAlien alien = new DestroyerAlien(this.game, this.alienManager);
			objects[i] = alien;
		}
	}
	
	public void add(DestroyerAlien alien, int limit) {
		if(this.num < limit) {
			this.objects[num] = alien;
			this.num++;
		}
	}
	
	private void remove(DestroyerAlien alien) {
		if(this.num > 1) {
			this.num--;
		}
	}
	
	public int size() {
		return this.num;
	}
	
	private DestroyerAlien getObjectInPosition(Position pos) {
		DestroyerAlien alien = null;
		for(int i = 0; i < this.num; i++) {
			if(objects[i].isOnPosition(pos)) {
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
		for(DestroyerAlien destroyerAlien : this.destroyerAliens()){
			// Por ejemplo, decidimos lanzar una bomba de manera aleatoria
			boolean shouldLaunchBomb = Math.random() < 0.2; // Probabilidad del 20%
			if(shouldLaunchBomb) {
				// Realizar la acción de lanzar una bombda
				destroyerAlien.launchBomb(); // Esto podría arreglar la bomba a una lista de bombas pendientes
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