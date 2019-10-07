public class StringToIntArrays {
	private String input;
	private int DELTA = 49;
	
	public StringToIntArrays(String input) {
		this.input = input.toLowerCase();
	}
	
	public int[] getCoordinats() {
		int[] coordinats = {input.charAt(0) - 2 * DELTA + 1, input.charAt(1) - DELTA};
		return coordinats;
	}
}
