public class Field {
	public final static int SIZE = 3;
	private Cell[][] cell = {
		{new Cell(), new Cell(), new Cell()},
	    {new Cell(), new Cell(), new Cell()},
	    {new Cell(), new Cell(), new Cell()}
	};
	
	public void setX(int x, int y) {
		cell[x][y].setX();
	}
	
	public void setO(int x, int y) {
		cell[x][y].setO();
	}
	
	public Cell getCell(int x, int y) {
		return cell[x][y];
	}
}
