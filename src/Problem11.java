/*
* If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60],
* your program should be able to find that the sub-array that lies between the indexes 3 and 8.
* */

public class Problem11 {

    public static void main(String[] args){
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int[] newArray = new int[6];
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = array[i + 3];
            System.out.print(newArray[i] + "\t");
        }
    }
}
