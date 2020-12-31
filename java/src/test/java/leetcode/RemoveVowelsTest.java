package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RemoveVowelsTest {
    @Test
    public void testRemoveVowels() {
        String s = "leetcodeisacommunityforcoders";
        String expected = "ltcdscmmntyfrcdrs";
        String result = new RemoveVowels().removeVowels(s);
        Assert.assertEquals(expected, result);
    }
}
