import java.util.*;

public class Control {
	
	private Logic logic = new Logic();
	private Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		Control control = new Control();
		control.start();
	}
	
	public void start() {
		for (int i = 0; i < 9; i++) {
			System.out.println("Input coordinates: a1, b2 …");
			logic.sendLine(in.nextLine());
			logic.start();
		}
		
	}
}
