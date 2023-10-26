package tp1.logic.lists;

import tp1.logic.Position;
import tp1.logic.gameobjects.RegularAlien;

public class RegularAlienList {
	
	// atributos
	
	private RegularAlien[] objects;
	private int num;
	private int limit;
	
	// constructor
	
	public RegularAlienList(int num, int limit) {
		this.objects = new RegularAlien[num];
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
		//TODO
		return null;
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
		//TODO
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