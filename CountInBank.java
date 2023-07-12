package Bank;

import java.util.Scanner;

public class CountInBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countInBank;
        int max;
        System.out.print("input you deposit = ");
        countInBank = scanner.nextInt();

       while (countInBank>0){
           countInBank = getMaxCount(countInBank);
       }
        System.out.println("You count "+countInBank);
    }
     static int getMaxCount(int countInBank){
        int max = countInBank -1;
            if (countInBank==1) max=1;
        while (countInBank % max != 0){
            max--;
        }
         System.out.println("conto = "+countInBank+" max= "+max);
        countInBank -=max;
        return countInBank;
    }

}
