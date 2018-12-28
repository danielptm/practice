package patterns.observer;

public class InputText implements Observer{

    public void setText(String text) {
        System.out.println("Text to set: " + text);
    }

    @Override
    public void update() {
        setText("DOGGY");
    }
}
