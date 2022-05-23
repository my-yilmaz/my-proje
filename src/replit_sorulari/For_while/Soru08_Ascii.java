package replit_sorulari.For_while;

public class Soru08_Ascii {
    public static void main(String[] args) {
        // Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
        // Expected Output:
        // Ascii value of a = 97 Ascii value of b = 98....  Ascii value of x = 120 Ascii value of y = 121 Ascii value of z = 122

        for (int i = 'a'; i <= 'z'; i++) {
            char harf = (char) i;
            System.out.println("Ascii value of " + harf + " = " + i);

        }
    }
}
