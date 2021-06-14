package ex32;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void generateRandomInt() {
        Assertions.assertEquals(true, 1 <= App.generateRandomInt(1) && 10 >= App.generateRandomInt(1));
        Assertions.assertEquals(true, 1 <= App.generateRandomInt(2) && 100 >= App.generateRandomInt(2));
        Assertions.assertEquals(true, 1 <= App.generateRandomInt(3) && 1000 >= App.generateRandomInt(3));
    }

}