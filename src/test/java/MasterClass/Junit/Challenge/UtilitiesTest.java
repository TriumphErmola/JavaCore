package MasterClass.Junit.Challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities utilities = new Utilities();

    @Test
    public void everyNthChar() {
        char[] output = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[]{'e', 'l'}, output);
        char[] output2 = utilities.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o', 'q'}, 8);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o', 'q'}, output2);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null"
                , utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));


    }

    @Test
    public void converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test
    public void nullIfAddLength() {
        assertNull(utilities.nullIfAddLength("qqq"));
        assertNotNull(utilities.nullIfAddLength("qqqq"));
    }
}