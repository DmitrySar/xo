import java.util.ArrayList;

public class Win {

    private Field field;

    public Win(Field field) {
        this.field = field;
    }

    public Cell.Xo getWinner() {
        ArrayList<Cell> cells = new ArrayList<>();
        Cell.Xo result = Cell.Xo.N;
        for (int i = 0; i < field.SIZE; i++) {
            for (int j = 0; j < field.SIZE; j++) {
                cells.add(field.getCell(j, i));
            }
        }
        for (int i = 0; i < field.SIZE*3; i += 3) {
            if (cells.get(i).getValue().equals(cells.get(i+1).getValue())
                    && cells.get(i).getValue().equals(cells.get(i+2).getValue())) {
                result = cells.get(i).getValue();
            }
        }
        for (int i = 0; i < field.SIZE; i++){
            if (cells.get(i).getValue().equals(cells.get(i+3).getValue())
                    && cells.get(i).getValue().equals(cells.get(i+6).getValue())) {
                result = cells.get(i).getValue();
            }
        }
        if (cells.get(0).getValue().equals(cells.get(4).getValue())
                && cells.get(0).getValue().equals(cells.get(8).getValue())) {
            result = cells.get(0).getValue();
        }
        if (cells.get(2).getValue().equals(cells.get(4).getValue())
                && cells.get(2).getValue().equals(cells.get(6).getValue())) {
            result = cells.get(2).getValue();
        }

        return result;
    }
}
