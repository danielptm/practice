package practice;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
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

    /**
     * Write a Java program to create a new array list, add some colors (string) and print out the collection.
     */
    @Test
    public void createNewArrayList(){
        System.out.println(Collection.createNewArrayList());
    }

    /**
     * Write a Java program to iterate through all elements in a array list.
     */
    @Test
    public void iterateThroughList(){
        List<String> colors = new ArrayList<>();
        Collection.createNewArrayList()
                .forEach((color) -> colors.add(color));
        Assert.assertEquals(3, colors.size());
    }

    /**
     * Write a Java program to insert an element into the array list at the first position.
     */
    @Test
    public void insertItemInArray(){
        Assert.assertEquals("inserted", Collection.insertItemInArray().get(0));
    }

    /**
     * Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    @Test
    public void testGetItemFromGivenIndex(){
        int index = 2;
        Assert.assertEquals("item", Collection.insertItemAtGivenPointInArrayList(index, "item").get(index));
    }

    @Test
    public void updateSpecificElement(){

    }

    @Test
    public void updateElementAtGivenIndexOfArray(){
        int index = 1;
        Assert.assertEquals("GRAY", Collection.updateElementInArrayAtCertainIndex(index, "GRAY").get(index) );
    }

    /**
     * Write a Java program to search an element in a array list.
     */
    @Test
    public void searchElementInArrayList(){
        Assert.assertEquals(true, Collection.findElementInArrayList("yellow"));
        Assert.assertEquals(false, Collection.findElementInArrayList("ALLIGATOR"));
    }

    /**
     * Write a Java program to sort a given array list.
     */
    @Test
    public void sortArrayList(){
        System.out.println(Collection.sortArrayList());
        System.out.println(Collection.sortArrayListInEasierWay());
    }


}
