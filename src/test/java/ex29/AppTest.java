package ex29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculateYearsNeeded() {
        Assertions.assertEquals(18.0, App.calculateYearsNeeded(4.0));
    }
}