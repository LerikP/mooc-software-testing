package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTestMy {

    private void test(String romanNumeral, int expectedValue) {
        RomanNumeralMy roman = new RomanNumeralMy();
        int result = roman.convert(romanNumeral);
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void singleNumber() {
        test("I", 1);
    }

    @Test
    public void numberWithManyDigits() {
        test("VIII", 8);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        test("IV", 4);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        test("XLIV", 44);
    }

    @Test
    public void numberWithAllSymbolsTest() {
        test("MDCLXVI", 1666);
    }

    @Test
    public void numberWithUnknownSymbolTest() {
        test("Q", -1);
    }

    @Test
    public void numberWithUnknownSymbolInsideTest() {
        test("MDCL0XVI", -1);
    }

    @Test
    public void numberWithDoubleSubtractionTest() {
        test("XXC", -1);
    }
}
