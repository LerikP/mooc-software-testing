package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralMy {
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }

    public int convert(String romanNumber) {
        Integer previous = 0;
        int result = 0;
        String reversed = new StringBuffer(romanNumber).reverse().toString();
        for (char c : reversed.toCharArray()) {
            if (!map.containsKey(c)) return -1;
            Integer current = map.get(c);
            result += current >= previous ? current : -current;
            previous = current;
        }
        return result;
    }
}
