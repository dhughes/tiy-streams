import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by doug on 5/19/16.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = Dictionary.getDictionary();

        // between 4 and 8 letters long
        // has an o in the third letter

        //String[] filteredWords =
        List<String> filteredWords = words.stream()
                        .filter(word -> word.length() >= 4 && word.length() <= 10)
                        .filter(word -> word.toLowerCase().charAt(2) == 'o')
                        .collect(Collectors.toList());;

        String word = filteredWords.get(
                new Random().nextInt(filteredWords.size()-1)
        );

        System.out.println(word);

    }
}
