/*
* Take 10 integer inputs from user and store them in an array.
* Now, copy all the elements in an another array but in reverse order.
*/

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        int index = 0;

        while (index < 10) {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int inputNumber = userInput.nextInt();
            numArray[index] = inputNumber;
            index++;
        }

        int[] newArray = new int[10];
        for (int i = newArray.length; i > 0; i--){
            newArray[i - 1] = numArray[numArray.length - i];
        }

        for (int num : newArray){
            System.out.print(num + ", ");
        }
        System.out.println("\n" + "The new array with reversed elements contains " + newArray.length + " elements.");
    }
}
