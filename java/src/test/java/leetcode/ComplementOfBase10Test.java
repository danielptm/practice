package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ComplementOfBase10Test {
    @Test
    public void bitwiseComplement() {
        int result = new ComplementOfbase10().bitwiseComplement(5);
        Assert.assertEquals(2, result);
    }
}
