package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru25_Scanner {
    // Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin
    // Örnek Çıktı:
    // Verilen tamsayının rakamları toplamı 10'dur.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 3 basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        sayi /= 10;
        int onlar = sayi % 10;
        int yuzler = sayi % 10;
        int toplam = birler + onlar + yuzler;

        System.out.println("Verilen tamsayinin rakamlari toplami " + toplam + "'dur.");
    }
}
