package employees;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @DisplayName("Test add method with two positive numbers")
    void testAddPositiveNumbers() {
        // Given
        var calculator = new Calculator();

        // When
        var result = calculator.add(1, 2);

        // Then
        assertEquals(3, result);
    }

    @Test
    void testAddWithNegative() {
        assertEquals(-3, new Calculator().add(-5, 2));
    }
}
