package leetcode;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordDictionaryTest {

    @Test
    public void test1() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        boolean result = wd.search("mad");
        Assert.assertFalse(result);
    }

    @Test
    public void test2() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        boolean result = wd.search(".ad");
        Assert.assertTrue(result);
    }

    @Test
    public void test3() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("bad");
        boolean result = wd.search("bad");
        Assert.assertTrue(result);
    }

    @Test
    public void test4() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("at");
        wd.addWord("and");
        wd.addWord("an");
        wd.addWord("add");
        wd.addWord("bat");
        boolean result = wd.search(".");
        Assert.assertFalse(result);
    }

    @Test
    public void test5() {
        WordDictionary wd = new WordDictionary();
        wd.addWord("a");
        wd.addWord("ab");
        boolean result = wd.search("..");
        Assert.assertTrue(result);
    }

    @Ignore
    public void side() {
        Pattern pattern = Pattern.compile("..");
        Matcher matcher = pattern.matcher("at");
        boolean result = matcher.find();

        Assert.assertTrue(result);

    }
}
