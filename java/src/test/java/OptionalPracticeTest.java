package practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalPracticeTest {

    @Test
    public void testIfPresentPrint() {
        List<String> items = new ArrayList<>();
        items.add("hello");
        items.add("bye");
        Optional<List<String>> optionalItem;
        optionalItem = Optional.of(items);
        optionalItem.ifPresent((items2) -> System.out.println(items2));

    }

    @Test
    public void ifNullThenPrintHi() {
        String aString = null;
        String item = Optional.ofNullable(aString).orElse("hi");
        System.out.println(item);
    }
}
