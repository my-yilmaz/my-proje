package replit_sorulari.Method_Array;

public class Soru12_TersdenYazdirmaArray {
    // Write a Java program that reverse a sentence by using Array (with all spaces and special characters).
    // Input : Coding is greate.
    // Output : .etaerg si gnidoC

    public static void main(String[] args) {

        String input = "Coding is greate.";
        String[] arr;
        arr = input.split("");
        String[] tersArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - i - 1];
            System.out.print(tersArr[i]);
        }
    }
}
