import org.junit.Test;
import practice.Abstract_Interface.Book;
import practice.Abstract_Interface.Lendable;

import java.util.Map;

public class TestLendable {

    @Test
    public void test() {
        Lendable lendable = getLendable();
        Book book = (Book) lendable;
        System.out.println(book);
    }


    private Lendable getLendable() {
        return new Book("123");
    }
}
