/*
* Write a program to check if elements of an array are same or not it whether it reads from front or back. For e.g.,
2	3	15	15	3	2

* */

public class Problem8 {

    public static void main(String[] args){
        int[] array = {2, 3, 15, 15, 3, 2};

        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < i; j++){
                if (array[i] == array[j]){
                    System.out.println("Yes, the array contains same elements at the indexes " + i + " and " + j);
                }
            }
        }
    }
}
