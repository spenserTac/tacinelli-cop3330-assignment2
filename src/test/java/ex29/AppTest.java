package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void investment_return() {
        int result = App.investment_return("4");
        Assertions.assertEquals(18, result);
    }
}