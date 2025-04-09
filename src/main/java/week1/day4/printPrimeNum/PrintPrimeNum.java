package week1.day4.printPrimeNum;


import java.util.Arrays;
import java.util.List;

public class PrintPrimeNum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,91,92,93);

        for (int i = 0; i < numbers.size(); i++) { // extract into separate method  everything that is now inside for-loop
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

            boolean isNumberFound = false;
            int currentPrimeIndex = 1;
            int num = 2;

            do
            {                                                //extract something into separate method to avoid over-nesting
                if (currentPrimeIndex == targetIndex) {
                    System.out.print(num + " ");
                    isNumberFound = true;
                } else {
                    num += 1;
                    if (isPrime(num)) {
                        currentPrimeIndex++;
                    } else {
                        do {
                            num += 1;
                        } while (!isPrime(num));
                        currentPrimeIndex++;
                    }
                }
            } while (!isNumberFound);

        }
    }

    static boolean isPrime(int number) {
            int counter = 0;
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            return counter == 0;

    }
}
