package replit_sorulari.Method_Array;

import java.util.Arrays;

public class Soru18_ArrayElemanEkleme {
    /* Write a return method that accepts 2 integer Arrays as parameters
    And adds 2 array into a new Array and prints it.
    Input1={1,2,3,4}
    Input2={5,6}
    Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {5, 6};
        arrayEkle(input1, input2);
        System.out.println(Arrays.toString(arrayEkle(input1, input2)));
    }

    private static int[] arrayEkle(int[] input1, int[] input2) {
        int[] yeniArr = new int[input1.length + input2.length];

        {
            int i = 0;
            while (i < input1.length) {
                yeniArr[i] = input1[i];
                i++;
            }
        }
        int i = 0;
        while (i < input2.length) {
            yeniArr[input1.length + i] = input2[i];
            i++;
        }
        return yeniArr;
    }
}
