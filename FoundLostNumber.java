package HW_10823;

import java.util.Arrays;

public class FoundLostNumber {
    public static void main(String[] args) {
        int[] range = new int[] {1,2,3,4,5,6,8,9};
        int[] numbers = new int[] {2,5,7,1,9,8,4,6};
        foundlostNumber(range);
        foundlostNumber(numbers);
//      measureTime(()->  foundlostNumber(range)) ;
//        foundlostNumber(numbers);
//
//
    }
    static void foundlostNumber(int[] range){
        Arrays.sort(range);
        for (int i=1; i<range.length;i++){
            if (range[i-1]!=range[i]-1){
                System.out.println(range[i]-1);
            }
        }


    }
private  static  void measureTime(Runnable task){
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
    System.out.println("Затраченное время "+ elapsed +" ms");
}
}
