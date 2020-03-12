package hackerrank;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;

public class InsertNodeAtTailTest {

    @Test
    public void testing() throws IOException {
        InsertNodeAtTail.SinglyLinkedListNode result = InsertNodeAtTail.insertNodeAtTail(null, 141);
        InsertNodeAtTail.SinglyLinkedListNode result2 = InsertNodeAtTail.insertNodeAtTail(result, 302);
        InsertNodeAtTail.SinglyLinkedListNode result3 = InsertNodeAtTail.insertNodeAtTail(result2, 402);
        StringWriter sw = new StringWriter();
    }
}
