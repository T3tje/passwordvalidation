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

    // USED PASSWORD TEST
    @Test
    void usedPasswordsCheck_whenPasswordIs_Password1_thenReturnFalse() {
        //GIVEN
        String password = "Password1";
        //WHEN
        boolean actual = PwValidator.usedPasswordsCheck(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void usedPasswordsCheck_whenPasswordIs_PassWord1_thenReturnFalse() {
        //GIVEN
        String password = "PassWord1";
        //WHEN
        boolean actual = PwValidator.usedPasswordsCheck(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void usedPasswordsCheck_whenPasswordIs_ABC12345678Xyz_thenReturnFalse() {
        //GIVEN
        String password = "ABC12345678Xyz";
        //WHEN
        boolean actual = PwValidator.usedPasswordsCheck(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void usedPasswordsCheck_whenPasswordIs_ABC2345678XyAusrufezeichenz_thenReturnTrue() {
        //GIVEN
        String password = "ABC2345678Xy!z";
        //WHEN
        boolean actual = PwValidator.usedPasswordsCheck(password);
        //THEN
        assertTrue(actual);
    }

    // SPECIAL CHARACTERS TEST
    @Test
    void specialCharactersCheck_whenPasswordIs_ABC2345678Xyz_thenReturnFalse() {
        //GIVEN
        String password = "ABC2345678Xyz";
        //WHEN
        boolean actual = PwValidator.specialCharacterCheck(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void specialCharactersCheck_whenPasswordIs_ABC2345678XyAusrufezeichenz_thenReturnTrue() {
        //GIVEN
        String password = "ABC2345678Xy!z";
        //WHEN
        boolean actual = PwValidator.specialCharacterCheck(password);
        //THEN
        assertTrue(actual);
    }

    //RANDOM PASSWORD GENERATOR CHECKER
    @Test
    void passwordGenerator_whenExecuted_then_passwordMainCheckReturnsTrue(){
        //GIVEN
        String generatedPassword = PwValidator.passwordGenerator();
        //WHEN
        boolean actual = PwValidator.passwordMainCheck(generatedPassword);
        //THEN
        assertTrue(actual);
    }
}



//