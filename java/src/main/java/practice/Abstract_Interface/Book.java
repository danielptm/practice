package practice.Abstract_Interface;

import java.util.Map;

public class Book extends Lendable {

    public Book(String id) {
        super(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
