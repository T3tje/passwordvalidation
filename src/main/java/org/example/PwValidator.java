package org.example;
import java.util.Random;

public class PwValidator {

    //HAUPTMETHODE PASSWORDCHECK
    public static boolean passwordMainCheck(String password) {
        return passwordLengthCheck(password)
                && passwordNumberCheck(password)
                && passwordUpLowerCaseCheck(password)
                && usedPasswordsCheck(password)
                && specialCharacterCheck(password);
    }

    // EINZELNE CHECKMETHODEN
    // PASSWORDLENGTHCHECK
    public static boolean passwordLengthCheck(String password) {
        return password.length() > 7;
        // return password.length() > 7;
    }

    // PASSWORD NUMBER CHECK
    public static boolean passwordNumberCheck(String password) {

        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (String digit : digits) {
            if (password.contains(digit)) {
                return true;
            }
        }
        return false;
    }

    //UPPER AND LOWER CASE CHECK
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
   /* public static boolean passwordUpperLowerCaseCheck(String password) {
        boolean lowerCase = false;
        boolean upperCase = false;

        for (char letter : password.toCharArray()) {
            if (Character.isLowerCase(letter)) {
                lowerCase = true;
            } else if (Character.isUpperCase(letter)) {
                upperCase = true;
            }
            if (lowerCase && upperCase) {
                break;
            }
        }

        return lowerCase && upperCase;
    }*/

    // USED PASSWORD CHECK


    public static boolean usedPasswordsCheck(String password) {

        String[] usedPasswordList = {
                "Password1",
                "12345678",
                "LuckyLuke23"
        };

        for (String word : usedPasswordList) {
            if (password.toLowerCase().contains(word.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    public static boolean specialCharacterCheck(String password) {
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (!Character.isLetterOrDigit(letter)) return true;
        }
        return false;
    }

    // PASSWORD GENERATOR
    public static String passwordGenerator() {

        String[] letterSoup = { "abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "!@#$%^&*()-_+=<>?" };
        String [] newPasswordArray = new String[20];

        for (int i = 0; i < newPasswordArray.length; i++ ) {
            for (int j = 0; j < letterSoup.length; j++) {
                newPasswordArray[i] = randomChar(letterSoup[j]);
            }

        }


        return "HansMeier!7";
    }

    public static char randomChar(String buchstaben) {
        Random next = new Random();
        return buchstaben.charAt(next.nextInt(buchstaben.length() - 1));
    }

}

