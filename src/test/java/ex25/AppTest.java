package ex25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void passwordValidator() {
        Assertions.assertEquals(1, App.passwordValidator("12345"));
        Assertions.assertEquals(2, App.passwordValidator("abcdef"));
        Assertions.assertEquals(3, App.passwordValidator("abc123xyz"));
        Assertions.assertEquals(4, App.passwordValidator("1337h@xor"));
    }

    @Test
    void containsLetters() {
        Assertions.assertEquals(true, App.containsLetters("$abc123"));
    }

    @Test
    void containsNumbers() {
        Assertions.assertEquals(true, App.containsNumbers("$abc123"));
    }

    @Test
    void containsSpecialCharacters() {
        Assertions.assertEquals(true, App.containsSpecialCharacters("$abc123"));
    }
}