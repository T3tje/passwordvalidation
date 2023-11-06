package org.example;

public class PwValidator {
    public static boolean passwordLengthCheck(String password) {
        if (password.length() <= 7) return false;
        return true;
        // return password.length() > 7;
    }

    public static boolean passwordNumberCheck(String password){

        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String digit: digits) {
            if (password.contains(digit)) {
                return true;
            }
        }
        return false;
    }
}
