public class Cell
{
	public static enum Xo {
		X("X"), O("O"), N(".");

		private String tittle;

		Xo(String tittle) {
			this.tittle = tittle;
		}

		public String getTitle() {
			return this.tittle;
		}

	}
	private Xo value;
	
	public Cell() {
		value = Xo.N;	}
	
	void setX() {
		value = Xo.X;
	}
	
	void setO() {
		value = Xo.O;
	}
	
	Xo getValue() {
		return value;
	}
}
