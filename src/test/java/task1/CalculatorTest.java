package task1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

        @Test
    public void purchaseAmountCannotLessOne() {
        String messageException = "Стоимость меньше 1 рубля";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculateDiscount(0, 10));
        assertEquals(messageException, exception.getMessage());
    }


    @Test
    public void discountAmountCannotLessZero() {
        String message = "Скидка не корректная(отрицательная)";
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Calculator.calculateDiscount(100, -5));
        assertEquals(message, exception.getMessage());
    }


}