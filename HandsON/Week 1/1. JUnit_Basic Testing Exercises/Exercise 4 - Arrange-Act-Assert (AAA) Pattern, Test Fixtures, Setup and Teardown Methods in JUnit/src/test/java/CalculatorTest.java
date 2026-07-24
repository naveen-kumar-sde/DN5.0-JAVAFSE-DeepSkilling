import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {

        calculator = new Calculator();

        System.out.println("Setup Executed");
    }

    @After
    public void tearDown() {

        calculator = null;

        System.out.println("Teardown Executed");
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }
}