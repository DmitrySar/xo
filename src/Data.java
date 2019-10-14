import java.util.ArrayList;

public class Data {

    private ArrayList<Field> fields = new ArrayList<>();

    public void addStep(Field field) {
        fields.add(field);
    }

    public Field getStep(int count) {
        return fields.get(count);
    }

}
