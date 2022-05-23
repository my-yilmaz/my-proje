package replit_sorulari.Method_Array;

import java.util.Arrays;

public class Soru14 {
    // Create a custom return type method accepts a name as parameter and prints the name as a char array.
    // (do not use toCharArray() method)
    // Input : John
    // Output :[J, o, h, n]

    public static void main(String[] args) {
        String input = "John";
        String [] arr=input.split("");
        System.out.println(Arrays.toString(arr));
    }
}
