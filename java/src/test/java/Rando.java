import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rando {

    @Test
    public void testing() {
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);

        List<Integer> items2 = items.stream().mapToInt(i -> i).boxed().collect(Collectors.toList());

        System.out.println(items2);
    }

    @Test
    public void testStringbuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("ABC");
        System.out.println(sb);
        sb.setLength(1);
        System.out.println(sb.toString());
        sb.setLength(10);
        System.out.println(sb.toString());
    }

}
