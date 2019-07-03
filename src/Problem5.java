/*
* Write a program to find the sum and product of all elements of an array.
*/

public class Problem5 {

    public static void main(String[] args) {
        float[] numArray = {3, 6, 2, 7, 4, 9, 5, 8};

        System.out.println("The required sum is " + sum(numArray));
        System.out.println("The required product is " + product(numArray));
    }

    public static float product(float[] numArray){
        float product = 1;
        for (float num : numArray){
            product = product * num;
        }
        return product;
    }

    public static float sum(float[] numArray){
        float sum = 0;
        for (float num : numArray){
            sum = sum + num;
        }
        return sum;
    }
}
