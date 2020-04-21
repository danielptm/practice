package practice;

import IO.Greeting;
import IO.Io;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

public class TestIo {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void getFileAsByteArray() throws IOException {
        File createdFile = folder.newFile("test.tx");
        FileUtils.writeStringToFile(createdFile, "hello world");
       byte[] x = Io.readFileAndReturnAsByteArray(createdFile);
       System.out.println(IOUtils.toString(x));
    }

    @Test
    public void serializeObject() throws IOException, ClassNotFoundException {
        Greeting greeting = new Greeting("hola", "mundo");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(greeting);
        oos.flush();
        byte[] x = bos.toByteArray();
        Greeting g2 = (Greeting) new ObjectInputStream(new ByteArrayInputStream(x)).readObject();
        System.out.println(g2.toString());
    }

    @Test
    public void testing() {
        int x = ((1 ^ 0) % 2);
        String y = null;
    }
}
