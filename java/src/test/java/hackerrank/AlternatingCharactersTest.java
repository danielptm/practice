package hackerrank;

import org.junit.Assert;
import org.junit.Test;

public class AlternatingCharactersTest {

    @Test
    public void testing() {
        String x = "AAABBB";
        int result = AlternatingCharacters.alternatingCharacters(x);
        Assert.assertEquals(4, result);
    }

    @Test
    public void testing2() {
        String x = "ABABABAB";
        int result = AlternatingCharacters.alternatingCharacters(x);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testing3() {
        String x = "BBBBB";
        int result = AlternatingCharacters.alternatingCharacters(x);
        Assert.assertEquals(4, result);
    }
}
