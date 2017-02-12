package com.wip.automation.excercise4;

import java.util.Arrays;

public class UpdatedArrayWithValuesUsingFunction {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] numbers = new int[] {8, 9, 5, 8, 89, 46, 78};

    int minValue = minValue(numbers);
    int maxValue = maxValue(numbers);
    int sumOfArray = arraySum(numbers);
    int[] copyArray = arrayCopy(numbers);
    int[] rev = revArrayCopy(numbers);

    System.out.println("minimum value ===> " + minValue 
        + "\nMaximum Value ===> " + maxValue
        + "\nSum of array is ===>" + sumOfArray 
        + "\nCopy of the original array is ===> "+ Arrays.toString(copyArray)
        + "\nReverse array is ===> "+ Arrays.toString(rev)
        );



  }



  // find minimum value using for loop and if statement

  public static int minValue(int numbers[]) {
    int minValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < minValue) {
        minValue = numbers[i];

      }

    }
    return minValue;
  }

  public static int maxValue(int numbers[]) {
    int maxValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxValue) {
        maxValue = numbers[i];

      }

    }
    return maxValue;
  }

  public static int arraySum(int numbers[]) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];

    }
    return sum;

  }

  public static int[] arrayCopy(int numbers[]) {
    int[] copyArray = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      copyArray[i] = numbers[i];

    }
    return copyArray;

  }

  public static int[] revArrayCopy(int numbers[]) {
    int[] revArrayCopy = new int[numbers.length];
    for (int x = numbers.length - 1; x >= 0; x--) {
      revArrayCopy[x] = numbers[x];
      
  }
    return revArrayCopy;

}
  
}
/*
 * 
 * // Copy to new array from the end int[] revArrayCopy = new int[numbers.length];
 * 
 * System.out.print("\nReverse copy of numbers array is ===> "); for (int x = numbers.length - 1; x
 * >= 0; x--) {
 * 
 * revArrayCopy[x] = numbers[x]; System.out.print(numArrayCopy[x] + ","); }
 * 
 * // Reverse an array in place
 * System.out.print("\nReverse in place copy of Numebrs array is ===> "); for (int k = 0; k <
 * numbers.length / 2; k++) {
 * 
 * int temp = numbers[k]; numbers[k] = numbers[numbers.length - 1 - k]; numbers[numbers.length - 1 -
 * k] = temp;
 * 
 * } // Output of the in place array
 * 
 * 
 * for (int j = 0; j < numbers.length; j++) { System.out.print(numbers[j] + ",");
 */
