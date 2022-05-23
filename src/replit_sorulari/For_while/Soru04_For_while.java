package replit_sorulari.For_while;

public class Soru04_For_while {
    public static void main(String[] args) {
        // Write a return method that accepts an integer as input and calculates factorial and prints like output.
        // Input : 6
        // Output: 6!=65432*1=720

        int input = 6;
        factorial(input);
    }

    private static void factorial(int input) {
        int fact = 1;
        StringBuilder factoutput = new StringBuilder();
        for (int i = input; i > 0; i--) {
            fact *= i;
            if (1 < i) factoutput.append(i).append("*");
            else factoutput.append(i);
        }
        System.out.println(input + "!" + "=" + factoutput + "=" + fact);
    }
}
