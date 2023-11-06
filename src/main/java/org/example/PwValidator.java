package org.example;

public class PwValidator {
    public static boolean passwordLengthCheck(String password) {
        if (password.length() <= 7) return false;
        return true;
        // return password.length() > 7;
    }
}
