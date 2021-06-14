package ex27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Tommy Chang
 */
class AppTest {

    @Test
    void validateFirstName() {
        Assertions.assertEquals("", App.validateFirstName("John"));
    }

    @Test
    void validateLastName() {
        Assertions.assertEquals("", App.validateFirstName("Johnson"));
    }

    @Test
    void validateEmpID() {
        Assertions.assertEquals("", App.validateFirstName("TK-4321"));
    }

    @Test
    void validateZipCode() {
        Assertions.assertEquals("", App.validateFirstName("55555"));
    }

    @Test
    void validateInput() {
        Assertions.assertEquals("There were no errors found.", App.validateInput("John", "Johnson", "TK-4321", "55555"));
    }
}