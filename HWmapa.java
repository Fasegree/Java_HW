// ДЗ 29,06,2023
package de.telran.lesson7;

import java.util.Scanner;

public class HWmapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String str1 = sc.nextLine();
        System.out.println("Введите второе слово");
        String str2 = sc.nextLine();
//        cutWorld(str1, str2);
        System.out.println("В результате склейки двух частей слов -- "+cutWorld(str1, str2));



        System.out.printf("str1 --%s--", str1);
        System.out.println();
        System.out.printf("str1 --%s--", str2);
    }

public static String cutWorld(String str1, String str2) {

    if (str1.length() % 2 == 0) {
        if (str2.length() % 2 == 0) {
            String str1a = str1.substring(0, str1.length() / 2);
            String str2b = str2.substring(str2.length() / 2, str2.length());
            String result = str1a + str2b;
            return result;
//            System.out.println(result);
        } else {
            System.out.println("Второе слово содержит нечетное число символов");
        }
    } else {
        System.out.println("Первое слово содержит нечетное число символов");
    }


    return str1;
}
}
