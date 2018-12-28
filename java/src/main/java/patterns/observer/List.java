package patterns.observer;

public class List implements Observer{

    public void setListValue(int i) {
        System.out.println("Setting list value: " + i);
    }

    @Override
    public void update() {
        setListValue(1);
    }
}
