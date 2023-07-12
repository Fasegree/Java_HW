package DeviceKolbs;

import java.util.Random;

public class Dev2Kolbs {
    public static void main(String[] args) {
        Random random = new Random();
        int temperature1, temperature2;
        for (int i = 0; i < 100; i++) {
        temperature1 = random.nextInt(100) + 70;
        temperature2 = random.nextInt(200) - 70;
            if (getwork(temperature1, temperature2) == true) {
//    System.out.println("work");
            } else System.out.println("No");
        }
    }
    static boolean getwork(int temperature1, int temperature2){
            while (temperature1>100 && temperature2<100){
                System.out.println("Device work");
                return true;
            }
        return false;
    }
}
