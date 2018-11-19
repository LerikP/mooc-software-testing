package tudelft.ghappy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GHappyTest {
    @Test
    public void happyStartGTest() {
        assertTrue(new GHappy().gHappy("gga"));
    }

    @Test
    public void happyMiddleGTest() {
        assertTrue(new GHappy().gHappy("agga"));
    }

    @Test
    public void happyEndGTest() {
        assertTrue(new GHappy().gHappy("agg"));
    }

    @Test
    public void happyOnlyGTest() {
        assertTrue(new GHappy().gHappy("gg"));
    }

    @Test
    public void nonHappyGStartTest() {
        assertFalse(new GHappy().gHappy("gaga"));
    }

    @Test
    public void nonHappyGMiddleTest() {
        assertFalse(new GHappy().gHappy("agaga"));
    }

    @Test
    public void nonHappyGEndTest() {
        assertFalse(new GHappy().gHappy("agag"));
    }

    @Test
    public void happyAndNonHappyGTest() {
        assertFalse(new GHappy().gHappy("aggag"));
    }
}
