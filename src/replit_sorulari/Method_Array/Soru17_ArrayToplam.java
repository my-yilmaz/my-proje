package replit_sorulari.Method_Array;

public class Soru17_ArrayToplam {
    /*
    Write a method that accepts an array as parameter and
    returns sum off all elements in the array Then print the result in the main method.
    Eg :
    input : {1,2,3,4,5,6,7,8};
    output: 36
     */
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        toplamInput(input);
        System.out.println(toplamInput(input));
    }

    private static int toplamInput(int[] input) {
        int toplam = 0;
        for (int each : input
        ) {
            toplam += each;
        }
        return toplam;
    }
}
