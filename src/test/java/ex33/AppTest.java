package ex33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void generateRandInt() {
        Assertions.assertEquals(true, 0 <= App.generateRandInt() && App.generateRandInt() <= 3);
    }
}