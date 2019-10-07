import java.util.*;

public class Logic {
	
	private String readline;
	private Field field = new Field();
	private FieldOut fieldout = new FieldOut(field);
	private int numOfStep = 0;
	
	public void sendLine(String readline) {
		this.readline = readline;
	}
	
	public void start() {
		StringToIntArrays coordinates = new StringToIntArrays(this.readline);
		int x = coordinates.getCoordinats()[0];
		int y = coordinates.getCoordinats()[1];
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
		fieldout.toScreen();
	}

	public int getNumberOfSteps() {
		return numOfStep;
	}
	
}
