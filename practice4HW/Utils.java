package de.telran.lesson22.practice4HW;

import java.util.Scanner;

public class Utils {
    public static int[] getUserLotteryNumbers(int countUsers) {
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[Constants.COUNT_SET_SIZE];
        for (int i = 0; i < Constants.COUNT_SET_SIZE; i++){
            do {
                System.out.print("Введите " + (i+1) + "-й номер = ");
                userNumbers[i] = scanner.nextInt();
            }while (userNumbers[i]<=0 || userNumbers[i]>50);
        }

        return userNumbers;
    }
    public static int[] comppareWinnerNumbers (int[] lotteryNumbers, int[][] userNumbers){
        int[] count;
        count = new int[userNumbers.length];
        for (int player=0;player<userNumbers.length;player++) {
//            System.out.println("userNumbers.length "+userNumbers.length);
                System.out.println("Cравнение номеров " + (player+1) + " игрока");


            for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
//                System.out.println( "Constants.COUNT_SET_SIZE "+Constants.COUNT_SET_SIZE);
                for (int j = 0; j < Constants.COUNT_SET_SIZE; j++) {
//                    System.out.println("userNumbers[player][i]  "+userNumbers[player][i]+" & lotteryNumbers[j] "+lotteryNumbers[j]);
                    if (userNumbers[player][i] == lotteryNumbers[j]) {

                        count[player]++;
//                        System.out.println(lotteryNumbers[j]);
                        break;
                    }
                }
            }
            System.out.println("Cовпадений "+count[player]);
        }

        return count;
    }
}
