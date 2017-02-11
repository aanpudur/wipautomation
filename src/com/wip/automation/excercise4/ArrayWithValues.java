package com.wip.automation.excercise4;

/*Create a int array with values - 
find minimum value 
maximum value 
find sum 
copy to new array
copy to new array from end. 
Reverse inplace 
 * */

public class ArrayWithValues {

    public static void main(String[] args) {

        int[] numbers = new int[] { 8, 9, 5, 8, 89, 46, 78 };

        // find minimum value using for loop and if statement
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }

        }

        System.out.println("Minimum Value of numbers array is ===>" + minValue);

        // find minimum value using for loop and if statement
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }
        System.out.println("maximum Value of numbers array is ===>" + maxValue);

        // Find sum of the array using for loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        System.out.println("The sum of numbers array is ===> " + sum);

        // creating the copy 'numbers' array to 'numrArrayCopy'
        int[] numArrayCopy = new int[numbers.length];

        System.out.print("Copy of the array is ===> ");
        for (int x = 0; x < numbers.length; x++) {

            numArrayCopy[x] = numbers[x];
            System.out.print(numArrayCopy[x] + ",");

        }

        // Copy to new array from the end
        int[] revArrayCopy = new int[numbers.length];

        System.out.print("\nReverse copy of numbers array is ===> ");
        for (int x = numbers.length - 1; x >= 0; x--) {

            revArrayCopy[x] = numbers[x];
            System.out.print(numArrayCopy[x] + ",");
        }

        // Reverse an array in place
        System.out.print("\nReverse in place copy of Numebrs array is ===> ");
        for (int k = 0; k < numbers.length / 2; k++) {

            int temp = numbers[k];
            numbers[k] = numbers[numbers.length - 1 - k];
            numbers[numbers.length - 1 - k] = temp;

        }
        // Output of the in place array
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + ",");

        }

    }

}
