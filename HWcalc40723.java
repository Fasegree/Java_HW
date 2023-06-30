package de.telran.lesson4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HWcalc40723 {
    public static void main(String[] args) {
        int num1, num2, res;
        char mySign;
        Scanner scanNum = new Scanner(System.in);
        System.out.print("Введите первое число  = ");
        num1 = scanNum.nextInt();
        System.out.print("Введите второе число  = ");
        num2 = scanNum.nextInt();
        System.out.print("Введите операцию (/*-+) = ");
        System.out.println();
        res = num1-num2;
        System.out.printf("Результат вычитания %s - %s = %s", num1, num2, res);
        System.out.println();
        res = num1+num2;
        System.out.println("Результат сложения - "+ res);
        System.out.println("Результат умножения - "+ num1*num2);
        float fnum1 = num1,fnum2 = num2;
        float fres = fnum1/fnum2;
        System.out.println("Результат деления - "+ fres);



//            System.out.println(num1-num2);
//        } else if(mySign == "+"){
//            System.out.println(num1+num2);
//        }else if(mySign == "*") {
//            System.out.println(num1*num2);
//        }else if(mySign == "/") {
//            System.out.println(num1/num2);
//        } else System.out.println("Error");
//
    }
}


//-------------------------------------------------

//import java.util.Scanner;
//
//public class InteractiveMathOperations {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//
//        System.out.print("Enter the operation (+, -, *, /): ");
//        char operator = scanner.next().charAt(0); //??????
//
//        double result = 0.0;
//
//        switch (operator) {
//            case '+':
//                result = num1 + num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '/':
//                if (num2 != 0) {
//                    result = num1 / num2;
//                } else {
//                    System.out.println("Error: Division by zero!");
//                }
//                break;
//            default:
//                System.out.println("Error: Invalid operator!");
//        }
//
//        System.out.println("Result: " + result);
//
//        scanner.close();
//    }
//}


