package tudelft.caesarshift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarShiftCipherTest {
    @Test
    public void simpleShiftTest(){
        assertEquals("b", new CaesarShiftCipher().CaesarShiftCipher("a", 1));
    }

    @Test
    public void wrappingBackwardsShiftTest(){
        assertEquals("z", new CaesarShiftCipher().CaesarShiftCipher("a", -1));
    }

    @Test
    public void wrappingForwardsShiftTest(){
        assertEquals("a", new CaesarShiftCipher().CaesarShiftCipher("z", 1));
    }

    @Test
    public void allCharactersTest(){
        assertEquals("bcdefghijklmnopqrstuvwxyza", new CaesarShiftCipher().CaesarShiftCipher("abcdefghijklmnopqrstuvwxyz", 1));
    }

    @Test
    public void modShiftTest(){
        assertEquals("b", new CaesarShiftCipher().CaesarShiftCipher("a", 27));
    }

    @Test
    public void modShiftBackwardsTest(){
        assertEquals("a", new CaesarShiftCipher().CaesarShiftCipher("b", -27));
    }


    @Test
    public void invalidInputTest(){
        assertEquals("invalid", new CaesarShiftCipher().CaesarShiftCipher("1", 1));
    }
}
