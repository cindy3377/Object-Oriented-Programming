import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void testConcatenate() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("HelloWorld", manipulator.concatenate("Hello", "World"));
    }

    @Test
    void testFindLength() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals(5, manipulator.findLength("Hello"));
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("HELLO", manipulator.convertToUpperCase("Hello"));
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator manipulator = new StringManipulator();
        assertEquals("hello", manipulator.convertToLowerCase("Hello"));
    }

    @Test
    void testContainsSubstring() {
        StringManipulator manipulator = new StringManipulator();
        assertTrue(manipulator.containsSubstring("Hello, World!", "World"));
        assertFalse(manipulator.containsSubstring("Hello, World!", "Goodbye"));
    }
}
