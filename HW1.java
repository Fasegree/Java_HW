package org.example;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

public class Main {
  public static void main(String[] args) {
    char myChar = 'G';
    int myInt = 89;
    byte myByte = 4;
    short myShort = 56;
    float myFloat = 4.7333436F;
    double myDouble = 4.355453532;
    long myLong = 12121;

    int number = 345;

    System.out.println("First number - " + (number / 100));

    System.out.println("second number - " + (number / 10) % 10);
    System.out.println("First number - " + (number % 10));


    System.out.println("my Char = " + myChar);
    System.out.println("my Int = " + myInt);
    System.out.println("my Byte = " + myByte);
    System.out.println("my Short = " + myShort);
    System.out.println("my Float = " + myFloat);
    System.out.println("my Double = " + myDouble);
    System.out.println("my Long = " + myLong);

  }


}
