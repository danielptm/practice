package IO;

import org.apache.commons.io.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Io {

    public static byte[] readFileAndReturnAsByteArray(File file) {
        byte[] bos = null;
        try {
            bos = IOUtils.toByteArray(new FileInputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bos;
    }
}
