
import java.util.*;public class FieldOut
 {
	
	private Field field;
	
	public FieldOut(Field field) {
		this.field = field;
	}
	
	public void toScreen() {
        System.out.println("  a b c");
		for (int i = 0; i < field.SIZE; i++) {
            System.out.print(i+1+" ");
			for (int j = 0; j < field.SIZE; j++) {
				System.out.print(field.getCell(j, i).getValue().getTitle()+" ");
			}
            System.out.println();
		}
	}

	public void showMessage(String message) {
		System.out.println("……………………");
		System.out.println(message);
	}
}
