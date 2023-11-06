package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PwValidatorTest {

    // Password length check
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
    void passwordLengthCheckTest_whenPwLengthIs0_returnFalse() {
        //GIVEN
        String password = "";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordLengthCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    // Password contains number check
    @Test
    void passwordNumberCheck_whenPasswordIsSebastian13_returnTrue() {
        //GIVEN
        String password = "Sebastian13";
        boolean expected = true;
        //WHEN
        boolean actual = PwValidator.passwordNumberCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordNumberCheck_whenPasswordIsSebastian_returnFalse() {
        //GIVEN
        String password = "Sebastian";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordNumberCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordNumberCheck_whenPasswordIsAnEmptyString_returnFalse() {
        //GIVEN
        String password = "";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordNumberCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordUpLowerCaseCheck_whenPasswordIsSebastian13_returnTrue() {
        //GIVEN
        String password = "Sebastian13";
        boolean expected = true;
        //WHEN
        boolean actual = PwValidator.passwordUpLowerCaseCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordUpLowerCaseCheck_whenPasswordIs_sebastian13_returnFalse() {
        //GIVEN
        String password = "sebastian13";
        boolean expected = false;
        //WHEN
        boolean actual = PwValidator.passwordUpLowerCaseCheck(password);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void passwordUpLowerCaseCheck_whenPasswordIs_seBaStian13_returnTrue() {
        //GIVEN
        String password = "seBaStian13";
        boolean expected = true;
        //WHEN
        boolean actual = PwValidator.passwordUpLowerCaseCheck(password);
        //THEN
        assertEquals(expected, actual);
    }
}

