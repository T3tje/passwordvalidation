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

}