import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) throws Exception {
        List<String> lines = Files.readAllLines(Paths.get(System.getProperty("user.home"), "Desktop", "paragraph.txt"));
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String line : lines) {
            String[] words = line.split("[\\p{Punct}\\s]");
            for (String word : words)
                map.merge(word, 1, Integer::sum);
        }
        map.remove("");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
