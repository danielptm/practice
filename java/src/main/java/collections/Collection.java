package collections;

import help.NumberCompare;

import java.util.*;

/**
 * Hello world!
 * Practice problems from this website.
 * https://www.w3resource.com/java-exercises/collection/index.php
 */
public class Collection {
    public static  List<String> removeItemAtIndexThree(List<String> items) {
        String removedItem = items.remove(3);
        return items;
    }

    public static void iterateOverLinkedList(LinkedList<String> items){
        ListIterator itr = items.listIterator(items.size());
        while(itr.hasPrevious()){
            String item = (String) itr.previous();
            System.out.println(item);
        }
    }

    public static List<String> createNewArrayList(){
        List<String> items = new ArrayList<>();
        items.add("yellow");
        items.add("blue");
        items.add("red");
        return items;
    }

    public static List<String> insertItemInArray(){
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        list.add("ciao");
        list.add(0, "inserted");
        return list;
    }

    public static List<String> insertItemAtGivenPointInArrayList(int index, String item){
        List<String> items = createNewArrayList();
        items.add(index, item);
        return items;
    }

    public static List<String> updateElementInArrayAtCertainIndex(int index, String item){
        List<String> items = createNewArrayList();
        items.set(index, item);
        return items;
    }

    public static List<Integer> createArrayOfUnorderedNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        return numbers;
    }

    public static boolean findElementInArrayList(String item){
        return createNewArrayList().contains(item);
    }

    public static List<Integer> sortArrayList(){
        List<Integer> numbers = createArrayOfUnorderedNumbers();
        numbers.sort(new NumberCompare());
        return numbers;
    }

    public static List<Integer> sortArrayListInEasierWay(){
        List<Integer> items = createArrayOfUnorderedNumbers();
        Collections.sort(items);
        return items;

    }

}
