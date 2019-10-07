
import java.time.temporal.*;

public class Cell
{
	public static enum change {X, O, _}
	private change value;
	
	public Cell() {
		value = change._;
	}
	
	void setX() {
		value = change.X;
	}
	
	void setO() {
		value = change.O;
	}
	
	change getValue() {
		return value;
	}
}
