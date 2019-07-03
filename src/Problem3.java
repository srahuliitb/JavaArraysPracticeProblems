/*
* Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number os 0.
 */

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        float[] numArray = new float[20];
        int index = 0;

        while (index < 20){
            Scanner scannerInput = new Scanner(System.in);
            System.out.print("Enter a number: ");
            float userNum = scannerInput.nextFloat();
            numArray[index] = userNum;
            index ++;
        }

        int countPositives = 0;
        int countNegatives = 0;
        int countOdds = 0;
        int countEvens = 0;
        int countZeros = 0;

        for (float num : numArray){
            if (num > 0) {
                countPositives ++;
                if (num % 2 == 0){
                    countEvens ++;
                } else {
                    countOdds ++;
                }
            } else if (num < 0){
                countNegatives ++;
            } else if (num == 0){
                countZeros ++;
            }
        }

        System.out.println("Number of positve numbers: " + countPositives + "\n" +
                        "Number of negative numbers: " + countNegatives + "\n" +
                        "Number of even numbers: " + countEvens + "\n" +
                        "Number of odd numbers: " + countOdds + "\n" +
                        "Number of zeros: "  + countZeros);


    }
}
