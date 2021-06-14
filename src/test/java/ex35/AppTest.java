package ex35;

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
    void chooseWinner() {
        ArrayList<String> lst  = new ArrayList<String>();
        lst.add("Homer");
        lst.add("Bart");
        lst.add("Maggie");
        lst.add("Lisa");
        lst.add("Moe");
        Assertions.assertEquals(lst.contains(App.chooseWinner(lst)), true);
    }

    @Test
    void generateRandInt() {
        ArrayList<String> lst  = new ArrayList<String>();
        lst.add("Homer");
        lst.add("Bart");
        lst.add("Maggie");
        lst.add("Lisa");
        lst.add("Moe");
        Assertions.assertEquals(true, 0 <= App.generateRandInt(lst.size()) && App.generateRandInt(lst.size()) <= lst.size());
    }
}