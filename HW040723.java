// 1 Задача. отобразить число ближайшее к 10 из 2х чисел m, n
//2 Задача. в 9.00 28800 в переменную n случайноечисло 0 .. 28800, -->в сек, в часах
package de.telran.lesson9;

import java.util.Random;

//10-3 = 7 10 - 17 = -7
public class HW040723 {
    public static void main(String[] args) {
    double m = 9.0,n = 11;
    // расчет ближайшего числа к 10ти
    if (Math.abs(10 - m) > Math.abs(10 - n)){
        System.out.println("Ближайшее к числу 10  число  " + n);
    } else if ((Math.abs(10 - m) < Math.abs(10 - n))) {
        System.out.println("Ближайшее к числу 10  число  " + m);
    } else System.out.println("Числа равноудалены от числа 10");

        //2 Задача. в 9.00 28800 в переменную n случайноечисло 0 .. 28800, -->в сек, в часах
        Random random = new Random();
        int time = random.nextInt(2800);
//        int time = 8;
        int hour, min,sec;
        System.out.printf("Осталось %s секунд \n", time);
        //Расчет часов
        hour = time / 60 / 60;
        // расчет минут
        min = Math.abs((hour * 60 * 60 - time) / 60);
//        расчет секунд
        sec = time % 60;


        System.out.printf("\n Осталось %s:%s:%s", hour, min, sec);
        System.out.println("\n \n ");

        // Для вывода ТОЛЬКО количества часов
        if (hour < 8 && hour > 4){
            System.out.printf("Осталось %s часов", hour);
        }else if (hour > 1){
            System.out.printf("Осталось %s часа", hour);
        } else if(hour == 0 && min != 0){
            System.out.printf("Осталось %s мин",min);
        }else if (hour == 0 && min == 0 && sec !=0){
            System.out.printf("Все вместе отсчитываем последние секунды до окончания смены! -- %s сек", sec);
        }
    }

    
}
