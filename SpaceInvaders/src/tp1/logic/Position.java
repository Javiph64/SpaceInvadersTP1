package tp1.logic;

/**
 * 
 * Immutable class to encapsulate and manipulate positions in the game board
 * 
 */
public class Position {

	private int col;
	private int row;

	//TODO no se si hacen falta más métodos
	
	public Position(int col, int row) {
		this.col = col;
		this.row = row;
	}
	
	public int getCol() {
		return col;
	}
	
	public int getRow() {
		return row;
	}
	
	public void setCol(int col) {
		this.col = col;
	}
	
	public void setRow(int row) {
		this.row = row;
	}

}