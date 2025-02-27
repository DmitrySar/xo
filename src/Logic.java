import java.util.*;

public class Logic {
	
	private String readline;
	private Field field = new Field();
	private FieldOut fieldout = new FieldOut(field);
	private int numOfStep = 0;
	private Cell.Xo Winner = Cell.Xo.N;
	private  Data data = new Data();
	
	public void sendLine(String readline) {
		this.readline = readline;
	}
	
	public void start() {
		if (readline.equals("u")) {
			readline = "uu";
			numOfStep -= 1;
			if (numOfStep < 0) {
				numOfStep = 1;
			}
			field = data.getStep(numOfStep);
			fieldout = new FieldOut(field);
		}
		StringToIntArrays coordinates = new StringToIntArrays(this.readline);
		int x = coordinates.getCoordinates()[0];
		int y = coordinates.getCoordinates()[1];
		int[] trueCoordinates = {0, 1, 2};
		if (!(Arrays.binarySearch(trueCoordinates, x) < 0)
				&& !(Arrays.binarySearch(trueCoordinates, y) < 0)
				&& !field.isBusy(x, y)) {
			if (numOfStep++ % 2 == 0) {
				field.setX(x, y);
			} else {
				field.setO(x, y);
			}
		}
		data.addStep(field, numOfStep);
		fieldout.toScreen();
		Cell.Xo findWinner = new Win(field).getWinner();
		Winner = findWinner;
		if (!(findWinner.equals(Cell.Xo.N))) {
			fieldout.showMessage("Winner: " + findWinner.getTitle());
		}

	}

	public int getNumberOfSteps() {
		return numOfStep;
	}

	public boolean isWin () {
		return !(Winner.equals(Cell.Xo.N));
	}
	
}
