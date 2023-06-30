package de.telran.lesson4;

public class HWstring40723 {

    public static void main(String[] args) {
        String str = new String("I study Basic Java!");

        printPrecedingLastCharacter(str);
        checkSubstring(str);
        cutSubstring(str);
        replaceCharacters(str);
        convertToUppercase(str);
        convertToLowercase(str);
    }

    public static void printPrecedingLastCharacter(String str) {
        int length = str.length();

            char LastChar = str.charAt(length - 2);
            System.out.println("Preceding last character: " + LastChar);

    }

    public static void checkSubstring(String str) {
        if (str.contains("Java")) {
            System.out.println("The string contains the substring 'Java'.");
        } else {
            System.out.println("The string does not contain the substring 'Java'.");
        }
    }

    public static void cutSubstring(String str) {
        String newString = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4);
        System.out.println("Substring 'Java' removed: " + newString);
    }

    public static void replaceCharacters(String str) {
        String replacedString = str.replace('a', 'o');
        System.out.println("String with replaced characters: " + replacedString);
    }

    public static void convertToUppercase(String str) {
        String uppercaseString = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);
    }

    public static void convertToLowercase(String str) {
        String lowercaseString = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);
    }
}
