package project1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringManipulatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "JUnit"})
    void testToUppercase(String input) {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.toUppercase(input);
        assertEquals(input.toUpperCase(), result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"radar", "level", "deified"})
    void testIsPalindromeTrue(String input) {
        StringManipulator manipulator = new StringManipulator();
        boolean result = manipulator.isPalindrome(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "java"})
    void testIsPalindromeFalse(String input) {
        StringManipulator manipulator = new StringManipulator();
        boolean result = manipulator.isPalindrome(input);
        assertTrue(!result);
    }

    @ParameterizedTest
    @CsvSource({"hello, olleh", "world, dlrow", "JUnit, tinUJ"})
    void testReverseString(String input, String expected) {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.reverseString(input);
        assertEquals(expected, result);
    }
}