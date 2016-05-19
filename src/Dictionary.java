import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by doug on 5/19/16.
 */
public class Dictionary {

    public static List<String> getDictionary() throws FileNotFoundException {
        File dict = new File("/usr/share/dict/words");

        Scanner scanner = new Scanner(dict);
        scanner.useDelimiter("\\Z");

        String[] allWords = scanner.next().split("\n");
        List<String> wordList = Arrays.asList(allWords);

        return wordList;
    }

}
