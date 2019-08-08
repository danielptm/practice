package practice;
import org.junit.Assert;
import practice.StringPractice;

import org.junit.Test;

/**
 * Practice problems for string operations on strings from this website.
 * https://www.w3resource.com/java-exercises/string/index.php
 *
 * and
 *
 * https://codingbat.com/java/String-1
 */
public class StringPracticeTest {

    @Test
    public void testGetCharacterAtIndex(){
        Assert.assertTrue("a".equals(StringPractice.getCharacterAtIndex("bdda5",3)));
    }

    @Test
    public void testGetUnicodePointFromIndexOfString(){
        Assert.assertTrue(72 == StringPractice.getUnicodePointFromIndex("aHa", 1));
    }

    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    @Test
    public void getCoundPoints(){

        Assert.assertTrue("Hello".equals(StringPractice.spliceStringFromIndex("Hello Bob!", 0, 5)));
    }

    @Test
    public void testPutStringInsideOtherString(){
        Assert.assertTrue("<<WooHoo>>"
                .equals(StringPractice.putStringInsideOtherString("<<>>", "WooHoo")));
        Assert.assertTrue("[[word]]"
                .equals(StringPractice.putStringInsideOtherString("[[]]", "word")));
        Assert.assertTrue("<<Yay>>"
                .equals(StringPractice.putStringInsideOtherString("<<>>", "Yay")));
    }

    @Test
    public void testStripZeros(){
        String string1 = "023401";
        String string2 = "0023401";
        String string3 = "00023401";
        String string4 = "000023401";
        String formatted1 = StringPractice.stripZeros(string1);
        String formatted2 = StringPractice.stripZeros(string2);
        String formatted3 = StringPractice.stripZeros(string3);
        String formatted4 = StringPractice.stripZeros(string4);
        Assert.assertEquals(formatted1, "23401");
        Assert.assertEquals(formatted2, "23401");
        Assert.assertEquals(formatted3, "23401");
        Assert.assertEquals(formatted4, "23401");
    }

    @Test
    public void testEPId(){
        String string1 = "NULL";
        String string2 = "900012312312";
        String string3 = "2345";

        Assert.assertEquals("NULL", StringPractice.calculateEPId(string1));
        Assert.assertEquals("NULL", StringPractice.calculateEPId(string2));
        Assert.assertEquals("2345", StringPractice.calculateEPId(string3));

    }

    @Test
    public void testPId(){
        String string1 = "NULL";
        String string2 = "9000123";
        String string3 = "123412312";

        Assert.assertEquals("NULL", StringPractice.calculatePId(string1));
        Assert.assertEquals("9000123", StringPractice.calculatePId(string2));
        Assert.assertEquals("NULL", StringPractice.calculatePId(string3));
    }
}
