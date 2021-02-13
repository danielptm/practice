package health_info_proj;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public List<String> file1;
    public List<String> file2;
    public List<String> file3;

    public String readFile(String path) {
        File file = new File(Runner.class.getResource(path).getFile());
        String data = null;
        try {
            data = FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public List<String> breakAtLineOrSpace(String fileContents) {
        String replaced = fileContents.replaceAll("\n", " ");
        return Arrays.asList(replaced.split(" "));
    }

    public List<String> breakAtLine(String fileContents) {
        return Arrays.asList(fileContents.split("\n"));
    }

    public void go() throws IOException {
        String firstColumn = readFile("/health_proj/firstColumn.txt");
        String secondColumn = readFile("/health_proj/secondColumn.txt");
        String thirdColumn = readFile("/health_proj/thirdColumn.txt");

        List<String> headers = breakAtLine(firstColumn)
                .stream()
                .filter(x -> x.substring(0, 1).equals("$"))
                .collect(Collectors.toList());

        List<String> firstList = breakAtLine(firstColumn)
                .stream()
                .filter(x -> !x.substring(0, 1).equals("$"))
                .collect(Collectors.toList());

        List<String> secondList = breakAtLineOrSpace(secondColumn);
        List<String> secondRefined = new ArrayList<>();

        for (int i = 0; i < (secondList.size() - 1); i+=2) {
            secondRefined.add(secondList.get(i) + "|" + secondList.get(i + 1));
        }

        List<String> thirdList = breakAtLineOrSpace(thirdColumn);

        String result = "";
        for (int i = 0; i < firstList.size(); i++) {
            try {
                if (i == 0) {
                    result += headers.get(0) + "\n";
                }
                else if (i % 17 == 0) {
                    int num = (i / 17) - 1;
                    result += headers.get(num) + "\n";
                }
                result += firstList.get(i) + "|" + secondRefined.get(i) + "|" + thirdList.get(i) + "\n";
            } catch (Exception e) {

            }
        }



        Path path = Paths.get("/Users/danieltuttle/Desktop/output.txt");

//Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            writer.write(result);
        }
    }
}
