/*
* Consider an integer array, the number of elements in which is determined by the user.
* The elements are also taken as input from the user.
* Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
* */

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args){
        Scanner scannerInput = new Scanner(System.in);
        System.out.print("Enter the desired length (at least 2) of the integer array: ");
        int arrayLength = scannerInput.nextInt();
        int[] array = new int[arrayLength];

        int index = 0;
        while(index < arrayLength){
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            int inputNumber = userInput.nextInt();
            array[index] = inputNumber;
            index++;
        }

        for (int num : array){
            System.out.print(num + "\t");
        }

        int maxDifference = 0;
        int minDifference = 1000;
        int maxDiffPairNum1 = 0;
        int maxDiffPairNum2 = 0;
        int minDiffPairNum1 = 0;
        int minDiffPairNum2 = 0;

        for (int i = 0; i < arrayLength; i++){
            for (int j = i + 1; j < arrayLength; j++){
                int difference = absoluteValue(array[i], array[j]);
                if (maxDifference < difference){
                    maxDifference = difference;
                    maxDiffPairNum1 = array[i];
                    maxDiffPairNum2 = array[j];
                }

                if (minDifference > difference){
                    minDifference = difference;
                    minDiffPairNum1 = array[i];
                    minDiffPairNum2 = array[j];
                }
            }
        }

        System.out.println("\n" + "The maximum difference is " + maxDifference + "\n" +
                "The minimum difference is " + minDifference);
        System.out.println("The maximum difference pair is " + "(" + maxDiffPairNum1 + ", " + maxDiffPairNum2 + ")");
        System.out.println("The minimum difference pair is " + "(" + minDiffPairNum1 + ", " + minDiffPairNum2 + ")");
    }

    public static int absoluteValue(int firstNumber, int secondNumber){
        int absVal = 0;
        if (firstNumber - secondNumber >= 0) {
            absVal = firstNumber - secondNumber;
        } else {
            absVal = secondNumber - firstNumber;
        }
        return absVal;
    }
}
