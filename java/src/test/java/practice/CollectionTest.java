package practice;

import static org.junit.Assert.assertTrue;

import collections.Collection;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

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


    /**
     * Choose/create a collection that is suitable for not accepting duplicates in its structure and where order is not important.
     */
    @Test
    public void set(){
        Set<String> items = new HashSet<>();
        items.add("cat");
        items.add("dog");
        items.add("alligator");
        items.add("cat");
        System.out.println(items);

    }

    /**
     * Choose/create a collection that does not accept duplicates but is sorted.
     *
     * This is a simple example with strings but if using objects, then the object
     * has to implement the comparator interface so the tree set can sort it otherwise an exception will
     * be thrown.
     *
     */
    @Test
    public void treeSet(){
        Set<String> items = new TreeSet<>();
        items.add("cat");
        items.add("dog");
        items.add("alligator");
        items.add("cat");
        System.out.println(items);
    }

    /**
     * Choose/create a collection that does not accept duplicates but maintains insertion order
     */
    @Test
    public void linkedHashSet(){
        Set<String> items = new LinkedHashSet<>();
        items.add("cat");
        items.add("dog");
        items.add("alligator");
        items.add("cat");
        System.out.println(items);
    }

    /**
     * Create choose a data structure that maintains key value pairs where order is not important.
     */
    @Test
    public void hashMap(){
        Map<String, String> items = new HashMap<>();
        items.put("greeting", "hi");
        items.put("farewell", "bye");
        items.put("animal", "cat");
        System.out.println(items);
        System.out.println(items.get("animal"));
    }

    /**
     * Create/choose a data structure that maintains key value pairs but stores the items in order they were inserted.
     */
    @Test
    public void linkedHashMap(){
        Map<String, String> items = new LinkedHashMap<>();
        items.put("greeting", "hi");
        items.put("farewell", "bye");
        items.put("animal", "cat");
        System.out.println(items);
    }

    /**
     * Tree map excercizes:
     *
     * What is a tree map? Why use it?
     * Because it implements the map interface it is a collection with key value pairs.
     * It is a good choice to use if you want the contents of the treemap to be sorted by their keys.
     * If the keys are objects that do not have a natural order, then the class of the object
     * must implement comparator in order to define an order.
     */

    /**
     * Create/choose a data structure that maintains key value pairs but is sorted by the keys.
     */
    @Test
    public void treeMap(){
        Map<String, String> items = new TreeMap<>();
        items.put("greeting", "hi");
        items.put("farewell", "bye");
        items.put("animal", "cat");
        System.out.println(items);
    }

    /**
     * Write a Java program to associate the specified value with the specified key in a Tree Map
     */
    @Test
    public void associateTreeMap(){
        Map<Integer, String> items = new TreeMap<>();
        items.put(1, "hi");
        items.put(2, "hi2");
        items.put(3, "hi3");
        items.forEach((item, item2) -> {
            System.out.println(item.toString() + "=>" + item2);
        });
    }

    /**
     * Write a Java program to copy a Tree Map content to another Tree Map.
     */
    @Test
    public void copyTreeMapContentToOtherTreeMap(){
        Map<Integer, String> items = new TreeMap<>();
        items.put(1, "hi");
        items.put(2, "hi2");
        items.put(3, "hi3");
        Map<Integer, String> items2 = new TreeMap<>();
        items2.putAll(items);
        System.out.println(items2);
    }

    /**
     * Write a Java program to search a key in a Tree Map.
     */
    @Test
    public void searchForKeyInTreemap(){
        Map<Integer, String> items = new TreeMap<>();
        items.put(1, "hi");
        items.put(2, "hi2");
        items.put(3, "hi3");

        System.out.println(items.containsKey(1));
    }

    /**
     * Write a Java program to search a value in a Tree Map.
     */
    @Test
    public void searchValueInTreeMap(){
        Map<Integer, String> items = new TreeMap<>();
        items.put(1, "hi");
        items.put(2, "hi2");
        items.put(3, "hi3");

        System.out.println(items.containsValue("hi"));
    }

    /**
     * Write a Java program to get all keys from the given a Tree Map.
     */
    @Test
    public void writeProgramToGetAllKeysFromTreeMap(){
        Map<Integer, String> items = new TreeMap<>();
        items.put(1, "hi");

        items.put(3234, "hi3");
        items.put(2, "hi2");
        items.put(3, "hi3");
        System.out.println(items.keySet());
    }

    @Test
    public void testing() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
    }

}
