package replit_sorulari.Method_Array;

public class Soru13_StringIfadedekiRakamlarinToplami {
    // Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.
    // input : ade1r4d3
    // output : 8
    // Hint :
    // Use Character.isDigit()
    // Integer.valueOf()

    public static void main(String[] args) {
        rakamlarinToplami();
    }

    private static void rakamlarinToplami() {
        String input = "ade1r4d3";
        int toplam = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                toplam += Integer.parseInt("" + input.charAt(i));
            }
        }
        System.out.println(toplam);
    }
}
