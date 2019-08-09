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

    @Test
    public void testIterateLoop() {
        CommonInterviewQuestions.iterateHashMap();
    }

    @Test
    public void testPrimeDetector() {
        Assert.assertEquals(false, CommonInterviewQuestions.findPrimeNumber(4));
        Assert.assertEquals(true, CommonInterviewQuestions.findPrimeNumber(7));
        Assert.assertEquals(true, CommonInterviewQuestions.findPrimeNumber(13));
        Assert.assertEquals(false, CommonInterviewQuestions.findPrimeNumber(8));
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertEquals(false, CommonInterviewQuestions.isPalindrome("cat"));
        Assert.assertEquals(true, CommonInterviewQuestions.isPalindrome("detartrated"));
    }
}
