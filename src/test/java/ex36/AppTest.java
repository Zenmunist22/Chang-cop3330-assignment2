package ex36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void average() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("100");
        lst.add("200");
        lst.add("1000");
        lst.add("300");
        Assertions.assertEquals((double) 400, App.average(lst));

    }

    @Test
    void max() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("100");
        lst.add("200");
        lst.add("1000");
        lst.add("300");
        Assertions.assertEquals("100", App.min(lst));
    }

    @Test
    void min() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("100");
        lst.add("200");
        lst.add("1000");
        lst.add("300");
        Assertions.assertEquals("1000", App.max(lst));
    }

    @Test
    void std() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("100");
        lst.add("200");
        lst.add("1000");
        lst.add("300");
        Assertions.assertEquals(true, Math.abs(App.std(lst) - 353.55) < .01);
    }
}