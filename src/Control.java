import java.util.*;

public class Control {
	
	private Logic logic = new Logic();
	private Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Control control = new Control();
		control.start();
	}
	
	public void start() throws CloneNotSupportedException {
		System.out.println("  a b c");
		System.out.println("1 . . .");
		System.out.println("2 . . .");
		System.out.println("3 . . .");

		while (!logic.isWin() && logic.getNumberOfSteps() < 9){
            System.out.printf("Step of %d. Input coordinates: ", logic.getNumberOfSteps()+1);
			logic.sendLine(in.nextLine());
			logic.start();
		}
		
	}
}
