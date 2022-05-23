package replit_sorulari.For_while;

import java.util.Scanner;

public class Soru01_For_while_01 {
    // Ask user to enter a name and a character,
    // then check how many times the character is repeated in the name using loops in the name
    // e.g:
    // char ch1= 'a' ;
    // String name =“John came late"
    // Expected Output: Number of a = 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir ifade giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        harfSayisi(cumle, harf);
    }

    public static void harfSayisi(String cumle, char harf) {
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz \"" + cumle + "\" ifadesinde tam " + sayac + " tane \"" + harf + "\" harfi var.");
    }
}
