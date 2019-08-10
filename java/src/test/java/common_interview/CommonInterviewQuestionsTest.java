package common_interview;

        import common_interview.hierarchy.University;
        import org.junit.Assert;
        import org.junit.Test;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

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



    @Test
    public void universities() {
        University a = new University("a", null);
        University b = new University("b", a);
        University c = new University("c", b);

        Assert.assertEquals("a", CommonInterviewQuestions.getParent(c));

    }

    @Test
    public void generateFibonacciSeries() {
        List<Integer> expectedSeries = Arrays.asList(0,1,1,2,3,5,8,13,21);
        List<Integer> resultSeries = CommonInterviewQuestions.generateFibonacciSeries(21);
        Assert.assertEquals(expectedSeries, resultSeries);
    }
}
