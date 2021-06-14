package ex28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void getSum() {
        int arr[] = {1,2,3,4,5};
        Assertions.assertEquals(15,App.getSum(arr));
    }
}