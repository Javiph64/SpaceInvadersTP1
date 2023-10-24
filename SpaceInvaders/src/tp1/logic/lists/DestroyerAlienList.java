package tp1.logic.lists;

import tp1.logic.Position;
import tp1.logic.gameobjects.DestroyerAlien;

public class DestroyerAlienList {
	
	// atributos
	
	private DestroyerAlien[] objects;
	private int num;
	private int limit;
	
	// constructor
	
	public DestroyerAlienList(int num, int limit) {
		this.num = num;
		this.limit = limit;
	}
	
	// getters y setters
	
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
	
	// otros métodos
	
	public void add(DestroyerAlien alien, int limit) {
		if(this.num < limit) {
			this.objects[num + 1] = alien;
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
		for(int i = 0; i < this.num; i++) {
			if(objects[i].isOnPosition(pos)) {
				return objects[i];
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		//TODO
		return null;
	}
	
	public void computerActions() {
		//TODO
	}
	
	public void automaticActions() {
		//TODO
	}
	
	public void removeDead() {
		//TODO
	}
	
	public void checkAttacks() {
		//TODO
	}

}