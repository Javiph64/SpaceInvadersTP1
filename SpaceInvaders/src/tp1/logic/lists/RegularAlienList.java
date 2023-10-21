package tp1.logic.lists;

import tp1.logic.Position;
import tp1.logic.gameobjects.RegularAlien;
import tp1.logic.gameobjects.UCMLaser;

/**
 * Container of regular aliens, implemented as an array with a counter
 * It is in charge of forwarding petitions from the game to each regular alien
 * 
 */
public class RegularAlienList {

	private RegularAlien[] objects;
	private int num;
	
	public RegularAlienList() {
		//TODO
	}
	
	public int getNum() {
		return this.num;
	}
	
	//TODO fill your code
	
	public void add(RegularAlien alien) {
		//TODO
	}
	
	private void remove(RegularAlien alien) {
		//TODO
	}
	
	public int size() {
		//TODO
		return 0;
	}
	
	private RegularAlien getObjectInPosition() {
		//TODO
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