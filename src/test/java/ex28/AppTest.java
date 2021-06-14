package ex28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void getSum() {
        int arr[] = {1,2,3,4,5};
        Assertions.assertEquals(15,App.getSum(arr));
    }
}