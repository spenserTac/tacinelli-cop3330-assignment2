package ex26;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff() {
        double result = PaymentCalculator.calculateMonthsUntilPaidOff(5000, (float)12.0, 100);
        Assertions.assertEquals(70, Math.ceil(result));
    }
}

