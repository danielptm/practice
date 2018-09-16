package practice;

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

    public static void seeHashSet(){
        Set<String> items = new HashSet<>();
        items.add("hi");
        items.add("bye");
    }

}
