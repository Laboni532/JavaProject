package callByValue.com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtlityTest {

    @Test
    void displayInt() {
        Utlity.display(10);
    }

    @Test
    void displayString() {
        Utlity.display("Hello World");
    }

    @Test
    void multiplyInRange() {
        assertEquals(10, Utlity.multiply(5,2));
    }
}