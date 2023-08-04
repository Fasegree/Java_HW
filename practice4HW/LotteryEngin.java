package de.telran.lesson22.practice4HW;

import java.util.Random;

public class LotteryEngin {
       private int[] luckyNumbers = new int[Constants.COUNT_SET_SIZE];
       public int[] getLuckyNumbers(){
           return  luckyNumbers;
        }
    public int[] runLottery() {

        int range = 15; // генерация от1..50
        int lucky; // генерируемый выигрышное число
        int luckyCount; // кол угаданных номеров
        luckyCount = 1;
        Random random = new Random();
        for (int i = 0; i < Constants.COUNT_SET_SIZE; i++) {
            lucky = random.nextInt(range)+1;
            switch (luckyCount) {
                case 1:
                    luckyNumbers[0] = lucky;
                    luckyCount++;
                    break;
                case 2:
                    if (luckyNumbers[0] != lucky) {
                        luckyNumbers[1] = lucky;
                        luckyCount++;
                    }
                    break;
                case 3:
                    if (luckyNumbers[0] != lucky && luckyNumbers[1] != lucky) {
                        luckyNumbers[2] = lucky;
                        luckyCount++;
                    }
                    break;
                case 4:
                    if (luckyNumbers[0] != lucky && luckyNumbers[1] != lucky && luckyNumbers[2] != lucky) {
                        luckyNumbers[3] = lucky;
                        luckyCount++;
                    }
                    break;
                case 5:
                    if (luckyNumbers[0] != lucky && luckyNumbers[1] != lucky && luckyNumbers[2] != lucky && luckyNumbers[3] != lucky) {
                        luckyNumbers[4] = lucky;
                        luckyCount++;
                    }

            }
        }
        return luckyNumbers;
    }
}
