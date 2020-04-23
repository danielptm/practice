package hackerrank;

import org.junit.Test;

public class LeteterCounterTest {

    @Test
    public void testing() {
        //voodoo should return v1o2d1o2
        String item = "voodoo";
        String result = LetterCounter.get(item);
        System.out.println(result);
    }
}
