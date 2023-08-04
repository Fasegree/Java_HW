package de.telran.lesson22.practice4HW;

import java.util.Arrays;

public class StartLottery {


    public static void main(String[] args) {

        //----------------многомерній массив
    int countUsers = 3;
    int[][] usersLottery = new int[countUsers][Constants.COUNT_SET_SIZE];
    for (int i=0; i<countUsers;i++){
        System.out.println((i+1)+"-й игрок, ваши номера: ");
        int[] userNumbers = Utils.getUserLotteryNumbers(i);

        for (int j=0;j<Constants.COUNT_SET_SIZE;j++){ //записіваем возвращаемій массив введенніх пользователем чисел в массив [Юзер][номер введенного числа]
            usersLottery[i][j] = userNumbers[j];
        }
    }
    for (int i=0;i<countUsers;i++){
        System.out.println("\nИгрок "+(i+1)+"-й выбрал номера ");
        for (int j = 0; j< Constants.COUNT_SET_SIZE; j++){
            System.out.print(usersLottery[i][j]+" ");
        }
    }
    //---------------
//        int[] userNumbers = Utils.getUserLotteryNumbers();
//        System.out.println(Arrays.toString(userNumbers));

        LotteryEngin lottery = new LotteryEngin();
        lottery.runLottery();
        int[] winnerNumbers = lottery.getLuckyNumbers();
        System.out.println("\n\nВыигрышные номера  "+Arrays.toString(winnerNumbers));


//        Utils.comppareWinnerNumbers(winnerNumbers, usersLottery);
        System.out.println("Compare "+ Arrays.toString(Utils.comppareWinnerNumbers(winnerNumbers, usersLottery)));
    }
}
