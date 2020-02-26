package schwimmer.scrabble;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ScrabbleDictionaryTest {

    @Test
    public void isWord() throws FileNotFoundException {
        // given
        ScrabbleDictionary dictionary = new ScrabbleDictionary();

        // when/then
        assertTrue(dictionary.isWord("PIZZA"));
    }
}