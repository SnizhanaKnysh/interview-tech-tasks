package week1.day4.printPrimeNum;


import java.util.Arrays;
import java.util.List;

public class PrintPrimeNum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(94);

        for (int i = 0; i < numbers.size(); i++) {
            int targetIndex;

            if (numbers.get(i) > 9) {
                String number = numbers.get(i).toString();
                targetIndex = 0;
                int sum = 0;

                for (int j = 0; j < number.length(); j++) {
                    targetIndex = sum + Character.getNumericValue(number.charAt(j));
                    sum = targetIndex;
                }
            } else {
                targetIndex = numbers.get(i);
            }

            boolean numFound = false;
            int currentPrimeIndex = 1;
            int num = 2;

            do {
                if (currentPrimeIndex == targetIndex) {
                    System.out.print(num + " ");
                    numFound = true;
                } else {
                    num++;
                    if (isPrime(num)) {
                        currentPrimeIndex++;
                    } else {
                        do {
                            num++;
                        } while (!isPrime(num));
                        currentPrimeIndex++;
                    }
                }
            } while (!numFound);

        }
    }

    static boolean isPrime(int number) {
        if (number == 5 || number == 7) {
            return true;
        } else if ((number > 3 && (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0))) {
            return false;
        }
        return true;
    }

}
