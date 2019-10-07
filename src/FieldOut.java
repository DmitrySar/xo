
import java.util.*;public class FieldOut
 {
	
	Field field;
	
	public FieldOut(Field field) {
		this.field = field;
	}
	
	public void toScreen() {
		for (int i = 0; i < field.SIZE; i++) {
			for (int j = 0; j < field.SIZE; j++) {
				System.out.print(field.getCell(j, i).getValue());
			}
			System.out.println();
		}
	}
}
