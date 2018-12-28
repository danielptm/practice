package practice;

import org.junit.Test;
import patterns.observer.Button;
import patterns.observer.InputText;
import patterns.observer.List;

public class PatternsTest {

    /**
     * Tests the patterns.observer code.
     */
    @Test
    public void testObserverPattern () {
        Button button = new Button();
        InputText text = new InputText();
        List list = new List();
        button.attachObserver(text);
        button.attachObserver(list);
        button.click();
    }
}
