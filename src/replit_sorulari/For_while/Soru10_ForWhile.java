package replit_sorulari.For_while;

public class Soru10_ForWhile {
    public static void main(String[] args) {
        // Write a Program to find the sum of natural numbers from 1 to 100.
        // OUTPUT : Sum of Natural Numbers 5050
        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("Sum of Natural Numbers " + toplam);
    }
}
