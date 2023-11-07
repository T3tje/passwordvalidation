package org.example;
import java.util.Arrays;
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
        Random next = new Random();
        int stringLength = 20;

        String[] letterSoup = { "abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "!@#$%^&*()-_+=<>?" };
        char[] newPasswordArray = new char[stringLength];

        for (int i = 0; i < newPasswordArray.length - 3; i = i + 4 ) {
            newPasswordArray[i] = letterSoup[0].charAt(next.nextInt(letterSoup[0].length()));
            newPasswordArray[i + 1] = letterSoup[1].charAt(next.nextInt(letterSoup[1].length()));
            newPasswordArray[i + 2] = letterSoup[2].charAt(next.nextInt(letterSoup[2].length()));
            newPasswordArray[i + 3] = letterSoup[3].charAt(next.nextInt(letterSoup[3].length()));
        }

        //ARRAY OF CHARS INTO STRING

        char[] shuffledArray = shuffleCharArray(newPasswordArray);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            stringBuilder.append(newPasswordArray[i]);
        }

        return stringBuilder.toString();
    }

    public static char[] shuffleCharArray(char[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            // Tausche die Zeichen an den Indizes i und index
            char temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}

