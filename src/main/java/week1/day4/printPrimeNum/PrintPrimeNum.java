package week1.day4.printPrimeNum;


import java.util.Arrays;
import java.util.List;

public class PrintPrimeNum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 91, 92, 93);
        processInputNumbersList(numbers);
    }

    private static void processInputNumbersList(List<Integer> inputNumbers) {
        for (Integer inputNumber : inputNumbers) {
            int targetIndex = getTargetIndex(inputNumber);
            printPrimeNumbers(targetIndex);
        }
    }

    private static int getTargetIndex(int inputNumber) {
        int targetIndex;

        if (inputNumber > 9) {
            String numberToDefineTargetIndex = String.valueOf(inputNumber);
            targetIndex = 0;
            int sum = 0;

            for (int j = 0; j < numberToDefineTargetIndex.length(); j++) {
                targetIndex = sum + Character.getNumericValue(numberToDefineTargetIndex.charAt(j));
                sum = targetIndex;
            }
        } else {
            targetIndex = inputNumber;
        }

        return targetIndex;
    }

    private static void printPrimeNumbers(int targetIndex) {
        boolean isPrimeNumberFound = false;
        int currentPrimeIndex = 1;
        int currentNumber = 2;

        do {
            if (currentPrimeIndex == targetIndex) {
                System.out.print(currentNumber + " ");
                isPrimeNumberFound = true;
            } else {
                currentNumber += 1;
                if (isPrime(currentNumber)) {
                    currentPrimeIndex++;
                } else {
                    do {
                        currentNumber += 1;
                    } while (!isPrime(currentNumber));
                    currentPrimeIndex++;
                }
            }
        } while (!isPrimeNumberFound);

    }

    static boolean isPrime(int number) {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
