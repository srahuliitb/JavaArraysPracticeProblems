/*
* Initialize and print all elements of a 2D array.
* */

public class Problem6 {

    public static void main(String[] args){
        int[][] twoDimensionalArray = {
                                        {1, 2, 3},
                                        {4, 5},
                                        {7, 8, 9, 12}
                                        };
/*
        for (int[] element : twoDimensionalArray){
        for (int num : element){
            System.out.print(num + ", ");
        }
    }
*/
        for (int i = 0; i < twoDimensionalArray.length; i++){
            for (int j = 0; j < twoDimensionalArray[i].length; j++){
                System.out.print(twoDimensionalArray[i][j] + "\t");
            }
        }

    }

}
