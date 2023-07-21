package isLeap;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год  ");
        year = scanner.nextInt();

       if (isLeap(year)) {
           System.out.println("Год высокосный");
       }else {
           System.out.println("Год не високосный");
       }
    }

    static boolean isLeap(int year){
        Boolean isLeaPYear = false;
        if(year>=1582){
            if(year % 4 == 0 ){
                if (year % 100 ==0){
                    if (year % 400 == 0){
                        return isLeaPYear=true;
                    }else{isLeaPYear=false;}
                }else{ return isLeaPYear=true;} // % 4 && % 400 == 0  => true
                return isLeaPYear=true;
//
            }else{
                return false;
            }
        }else{
            System.out.println("Год до 1582 ");
        }
        return isLeaPYear;
    }
}
//https://discordapp.com/channels/1131518020238446625/1131518140187148300/1131518167286558761