package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void nonLetter() {
        int words = new CountLetters().count("123");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void wordsEndingWithR() {
        int words = new CountLetters().count("car|bar");
        Assertions.assertEquals(2, words);
    }
}