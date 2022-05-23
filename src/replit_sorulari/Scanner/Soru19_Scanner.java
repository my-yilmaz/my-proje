package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru19_Scanner {
    // Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi= scan.nextInt();
        double sonuc= (double) (sayi*sayi*sayi)/2;
        System.out.println(sonuc);
    }
}
