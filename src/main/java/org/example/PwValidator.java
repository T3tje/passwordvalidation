package org.example;

public class PwValidator {
    public static boolean passwordLengthCheck(String password) {
        if (password.length() <= 7) return false;
        return true;
        // return password.length() > 7;
    }

    public static boolean passwordNumberCheck(String password) {

        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String digit : digits) {
            if (password.contains(digit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean passwordUpLowerCaseCheck(String password) {
        return upperCheck(password) && lowerCheck(password);
    }

    public static boolean upperCheck(String password) {
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isUpperCase(letter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean lowerCheck(String password) {
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (Character.isLowerCase(letter)) {
                return true;
            }
        }
        return false;
    }


}
