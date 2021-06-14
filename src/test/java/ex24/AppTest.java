package ex24;


import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for ex24
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
public class AppTest
{
    @org.junit.jupiter.api.Test
    void isAnagram() {
        Assertions.assertEquals(true, App.isAnagram("note", "tone"));
    }
}
