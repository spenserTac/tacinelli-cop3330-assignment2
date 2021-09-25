package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void karvonen_heart_rate() {
        int result = App.karvonen_heart_rate(65, 22, 55);
        Assertions.assertEquals(138, result);
    }
}