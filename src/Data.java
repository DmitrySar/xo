import java.util.ArrayList;

public class Data {

    private ArrayList<Field> fields = new ArrayList<>();

    public void addStep(final Field field) {
        Field tmpField = new Field();
        Cell.Xo tmpCell = Cell.Xo.N;
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
        fields.add(tmpField);
    }

    public Field getStep(int count) {
        return fields.get(count);
    }

    public int size() {
        return fields.size();
    }

}
