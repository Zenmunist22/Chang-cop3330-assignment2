package ex34;

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
    void removeFromArray() {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("John Smith");
        lst.add("Jackie Johnson");
        lst.add("Chris Jones");
        lst.add("Amanda Cullen");
        lst.add("Jeremy Goodwin");
        Assertions.assertEquals(true, App.removeFromArray(lst, "Chris Jones"));
    }
}