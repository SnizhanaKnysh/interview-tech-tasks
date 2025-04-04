package week1.day3.temperatures;

import java.util.Arrays;
import java.util.List;


public class Temperatures {

    public static void main(String args[]) {

        List<Integer> temperatures = Arrays.asList(-40, -4, -2, 12, -40);

        if (temperatures.isEmpty()) {
            System.out.println(0);
        }

        int min = temperatures.get(0);

        for (int i = 1; i < temperatures.size(); i++) {

            int current = temperatures.get(i);

            if (Math.abs(current) < Math.abs(min)) {
                min = current;
            } else if (current == -min && current > min) {
                min = current;
            }

        }

        System.out.println(min);
    }

}
