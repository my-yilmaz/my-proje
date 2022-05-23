package replit_sorulari.Method_Array;

public class Soru11_Method {

    // Write a return method to reverse number.
    // Input : 12345
    // Output : 54321
    public static void main(String[] args) {
        int input = 12345;
        sayiyiTerstenYazdir(input);
    }

    private static void sayiyiTerstenYazdir(int input) {
        int reverse = 0;
        while (input != 0) {
            reverse = reverse * 10;
            reverse = reverse + input % 10;
            input = input / 10;
        }
        System.out.println(reverse);
    }
}