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


}
