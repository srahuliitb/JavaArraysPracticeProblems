/*
* Take an array of 10 elements. Split it into middle and store the elements in two different arrays. For Ee.g.,
INITIAL array :
58	24	13	15	63	9	8	81	1	78

After spliting :
58	24	13	15	63
9	8	81	1	78
*/

public class Problem9 {
    public static void main(String[] args){
        int[] originalArray = {58, 34, 13, 15, 63, 9, 8, 81, 1, 78};
        int[] splitArray1 = new int[originalArray.length / 2];
        int[] splitArray2 = new int[originalArray.length / 2];

        for (int i = 0; i < originalArray.length / 2; i++){
            splitArray1[i] = originalArray[i];
            System.out.print(splitArray1[i] + ", ");
        }

        System.out.println();

        for (int i = originalArray.length / 2; i < originalArray.length; i++){
            splitArray2[i - (originalArray.length / 2)] = originalArray[i];
            System.out.print(splitArray2[i - (originalArray.length / 2)] + ", ");
        }

    }

}
