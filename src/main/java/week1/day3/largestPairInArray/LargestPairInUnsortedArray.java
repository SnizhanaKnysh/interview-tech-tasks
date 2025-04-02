package week1.day3.largestPairInArray;

import java.util.Arrays;

public class LargestPairInUnsortedArray {

    public static void main(String[] args) {
        int[] array = {1,1,5,5,12,12,4,4,1,1,6,6};
        moveLargestPair(array);
    }

    static void moveLargestPair(int[] arr) {

        int maxValueIndex = 0;
        int maxVal = arr[maxValueIndex];
        int[] newArray = new int[arr.length];

        for (int i = 2; i < arr.length; i += 2) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxValueIndex = i;
            }
        }

        for (int i = 0, j = 0; i < arr.length; i += 2, j += 2) {

           if (i != maxValueIndex) {
               newArray[j] = newArray[j + 1] = arr[i];
            }
        }

//        for (int i = maxValueIndex, j = 0; i < arr.length-1; i += 2, j += 2) {
//
//          move pair from the right to the current Pos
//        }

        newArray[newArray.length - 2] = newArray[newArray.length - 1] =  maxVal;

        System.out.println(Arrays.toString(newArray));
    }

}
