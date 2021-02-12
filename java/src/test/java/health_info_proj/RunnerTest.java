package health_info_proj;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class RunnerTest {

    Runner runner = new Runner();

    @Test
    public void testRun() throws IOException {
        runner.go();
    }

    @Test
    public void test() {
        String item = "a\nb\n";
        List<String> items = runner.breakAtLine(item);
        Assert.assertEquals(2, items.size());
    }

    @Test
    public void test2() {
        String item = "a\nb\nc";
        List<String> items = runner.breakAtLineOrSpace(item);
        Assert.assertEquals(3, items.size());
    }
    // 2,596,993 100.0 611,105 23.5 584,881 22.5 149,205 5.7 130,557 5.0 128,978 5.0

    @Test
    public void test3() {
        String item = "2,596,993 100.0 611,105 23.5 584,881 22.5 149,205 5.7 130,557 5.0 128,978 5.0";
        List<String> items = runner.breakAtLineOrSpace(item);
        Assert.assertEquals(12, 12);
    }

    @Test
    public void test4() {
        String item = "a\nb\n c";
        List<String> items = runner.breakAtLineOrSpace(item);
        Assert.assertEquals(3, items.size());
    }
}
