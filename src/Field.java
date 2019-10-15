public class Field implements Cloneable {

	public final static int SIZE = 3;
	private Cell[][] cell = {
		{new Cell(), new Cell(), new Cell()},
	    {new Cell(), new Cell(), new Cell()},
	    {new Cell(), new Cell(), new Cell()}
	};

	@Override
	public Field clone() throws CloneNotSupportedException {
		return (Field) super.clone();
	}

	public void setX(int x, int y) {
		cell[x][y].setX();
	}
	
	public void setO(int x, int y) {
		cell[x][y].setO();
	}
	
	public Cell getCell(int x, int y) {
		return cell[x][y];
	}

	public boolean isBusy(int x, int y) {
		return  !getCell(x, y).getValue().equals(Cell.Xo.N);
	}
}
