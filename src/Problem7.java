/*
* Find largest and smallest elements of an array.
* */

public class Problem7 {

    public static void main(String[] args){
        int[] array = {3, 6, 0, -2, 4, 9, 12};
        int smallestNumber = 0;
        int largestNumber = 0;

        for (int item : array){
            if (smallestNumber > item){
                smallestNumber = item;
            }

            if (largestNumber < item){
                largestNumber = item;
            }
        }

        System.out.println("The smallest number is " + smallestNumber + "\n" +
                "The largest number is " + largestNumber);
    }
}
