package tudelft.numfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumFinderTest {

    @Test
    public void mixedSetTest() {
        int[] set = new int[] {4, 10, -5, 7, 11};
        NumFinder numFinder = new NumFinder();
        numFinder.find(set);
        assertEquals(-5, numFinder.getSmallest(), "Minimum");
        assertEquals(11, numFinder.getLargest(), "Maximum");
    }

    @Test
    public void increasingSetTest() {
        int[] set = new int[] {0, 1, 2, 3, 4};
        NumFinder numFinder = new NumFinder();
        numFinder.find(set);
        assertEquals(0, numFinder.getSmallest(), "Minimum");
        assertEquals(4, numFinder.getLargest(), "Maximum");
    }

    @Test
    public void decreasingSetTest() {
        int[] set = new int[] {4, 3, 2, 1, 0};
        NumFinder numFinder = new NumFinder();
        numFinder.find(set);
        assertEquals(0, numFinder.getSmallest(), "Minimum");
        assertEquals(4, numFinder.getLargest(), "Maximum");
    }

    @Test
    public void emptySetTest() {
        int[] set = new int[] {};
        NumFinder numFinder = new NumFinder();
        numFinder.find(set);
        assertEquals(Integer.MAX_VALUE, numFinder.getSmallest(), "Minimum");
        assertEquals(Integer.MIN_VALUE, numFinder.getLargest(), "Maximum");
    }

    @Test
    public void nullSetTest() {
        NumFinder numFinder = new NumFinder();
        numFinder.find(null);
        assertEquals(Integer.MAX_VALUE, numFinder.getSmallest(), "Minimum");
        assertEquals(Integer.MIN_VALUE, numFinder.getLargest(), "Maximum");
    }
}
