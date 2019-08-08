package common_interview;

import org.junit.Assert;
import org.junit.Test;

public class CommonInterviewQuestionsTest {

    @Test
    public void testReverseString() {
        String expected = "TAC";
        String original = "CAT";
        Assert.assertEquals(expected, CommonInterviewQuestions.reverse(original));
    }

    @Test
    public void testCountNumberOfWords() {
        String original = "Hello my name is daniel.";
        int expected = 5;

        Assert.assertEquals(expected, CommonInterviewQuestions.countNumberOfWords(original));

    }
}
