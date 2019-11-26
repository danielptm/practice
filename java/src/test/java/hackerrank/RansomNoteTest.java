package hackerrank;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Hashtable;
import java.util.Map;

public class RansomNoteTest {
    @Test
    public void testing() {
        String magazine = "give me one grand today night";
        String note = "give one grand today";
        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");

        String result = RansomeNote.noteLogic(magazineArray, noteArray);
        Assert.assertEquals("Yes", result);

    }

    @Test
    public void testing2() {
        String magazine = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";
        String note = "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";

        String[] magazineArray = magazine.split(" ");
        String[] noteArray = note.split(" ");

        String result = RansomeNote.noteLogic(magazineArray, noteArray);
        Assert.assertEquals("No", result);
    }

    @Ignore
    public void testing3() {
        Map<String, String> testmap = new Hashtable<>(2);

        testmap.putIfAbsent("Hi", "hi");
        testmap.putIfAbsent("hi", "hi");

        System.out.println(testmap);
    }

}
