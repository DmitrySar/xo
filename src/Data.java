import java.util.ArrayList;

public class Data {

    private ArrayList<Field> fields = new ArrayList<>();
	
	public Data() {
		for (int i = 0; i < 9; i++) {
			fields.add(new Field());
		}
	}
	
	private Field cloneField(Field field) {
		Field tmpField = new Field();
        for (int i = 0; i < tmpField.SIZE; i++) {
            for (int j = 0; j < tmpField.SIZE; j++) {
                if (field.getCell(i, j).getValue().equals(Cell.Xo.X)) {
                    tmpField.setX(i, j);
                } else
                if (field.getCell(i, j).getValue().equals(Cell.Xo.O)) {
                    tmpField.setO(i, j);
                }
            }
        }
		return tmpField;
	}

    private void addStep(final Field field) {   
        fields.add(cloneField(field));
    }
	
	public void addStep(final Field field, int id) {
		fields.add(id, cloneField(field));
	}

    public Field getStep(int count) {
        return fields.get(count);
    }

    public int size() {
        return fields.size();
    }

}
