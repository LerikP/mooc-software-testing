package tudelft.mirror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirrorTest {
    @Test
    public void isEvenMirror() {
        assertEquals("abba", new Mirror().mirrorEnds("abba"));
    }

    @Test
    public void isOddMirror() {
        assertEquals("abcba", new Mirror().mirrorEnds("abcba"));
    }

    @Test
    public void isNotMirror() {
        assertEquals("ab", new Mirror().mirrorEnds("abcdba"));
    }
}
