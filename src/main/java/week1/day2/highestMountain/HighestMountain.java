package week1.day2.highestMountain;

import java.util.Scanner;

public class HighestMountain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int biggestH = 0;
            int highestIndex = 0;

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();

                if (mountainH > biggestH) {
                    biggestH = mountainH;
                    highestIndex = i;
                }
            }

            System.out.println(highestIndex);
        }
    }


}
