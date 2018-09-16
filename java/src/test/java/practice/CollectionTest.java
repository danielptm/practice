package practice;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Unit test for simple Collection.
 */
public class CollectionTest
{
    /**
     * Write a Java program to remove the third element from a array list.
     */
    @Test
    public void shouldAnswerWithTrue() {
        List<String> items = new ArrayList<>();
        items.add("a");
        items.add("b");
        items.add("c");
        items.add("d");
        items.add("e");
        Assert.assertTrue(!Collection.removeItemAtIndexThree(items).contains("d"));
    }

    //Write a Java program to iterate a linked list in reverse order.
    @Test
    public void testIterateOverLinkedList(){
        LinkedList<String> items = new LinkedList<>();
        items.add("a");
        items.add("b");
        items.add("c");
        items.add("d");
        Collection.iterateOverLinkedList(items);
    }

    @Test
    public void hashSet(){
        Collection.seeHashSet();
    }
}
