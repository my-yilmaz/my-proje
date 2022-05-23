package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru22_Scanner {
    // Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen float bir sayi giriniz: ");
        float sayi = scan.nextFloat();
        sayi = (short) sayi;
        System.out.println(sayi);
    }
}
