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
		StringToIntArrays coordinats = new StringToIntArrays(this.readline);
		if (numOfStep++ % 2 == 0) {
			field.setX(coordinats.getCoordinats()[0], coordinats.getCoordinats()[1]);
		} else {
				field.setO(coordinats.getCoordinats()[0], coordinats.getCoordinats()[1]);
		}
		fieldout.toScreen();
	}
	
}
