package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculateTargetHeartRate() {
        Assertions.assertEquals(138, Math.floor(App.calculateTargetHeartRate(65,22, .55)));
        Assertions.assertEquals(191, Math.floor(App.calculateTargetHeartRate(65,22, .95)));
    }
}