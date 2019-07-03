/*
* Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
* Now, tell user whether that number is present in array or not.
* */

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args){
        int[] numArray = new int[10];
        int index = 0;

        while (index < 10){
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int inputNumber = userInput.nextInt();
            numArray[index] = inputNumber;
            index ++;
        }

        Scanner checkInput = new Scanner(System.in);
        System.out.print("Enter a number whose entry you want to check: ");
        int checkNumber = checkInput.nextInt();
        for (int num = 0;  num < numArray.length; num ++){
            if (numArray[num] != checkNumber){
                continue;

            } else if (numArray[num] == checkNumber){
                System.out.println(checkNumber + " exists in the array at the index " + num);
                break;

            } else {
                System.out.println(checkNumber + " doest not exist in the array.");
            }
        }
    }
}
