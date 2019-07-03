/*
* Take 10 integer inputs from user and store them in an array and print them on screen.
*/

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        int index = 0;
        int[] numArray = new int[10];

        while (index < 10){
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int inputNumber = userInput.nextInt();
            numArray[index] = inputNumber;
            index++;
        }

        for (int num : numArray){
            System.out.print(num + ", ");
        }
    }
}
