package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PwValidatorTest {

    @Test
    void passwordLengthCheckTest_whenPwLengthIs7_returnFalse() {
        //GIVEN
        String password = "1234567";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordLengthCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordLengthCheckTest_whenPwLengthIs10_returnTrue() {
        //GIVEN
        String password = "1234567890";
        boolean expected = true;
        //WHEN
        boolean actual = PwValidator.passwordLengthCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordLengthCheckTest_whenPwLengthIs8_returnTrue() {
        //GIVEN
        String password = "12345678";
        boolean expected = true;
        //WHEN
        boolean actual = PwValidator.passwordLengthCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordLengthCheckTest_whenPwLengthIs4_returnFalse() {
        //GIVEN
        String password = "abcd";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordLengthCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordLengthCheckTest_whenPwLengthIs0_returnFalse() {
        //GIVEN
        String password = "";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordLengthCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

}