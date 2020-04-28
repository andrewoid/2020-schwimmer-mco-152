package schwimmer.scrabble;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScrabbleDictionary {

    public boolean isWord(String word) throws FileNotFoundException {
        File file = new File("dictionary.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String nextWord = scanner.next();
            if (nextWord.equalsIgnoreCase(word)) {
                return true;
            }
            scanner.nextLine();
        }
        return false;
    }

}
