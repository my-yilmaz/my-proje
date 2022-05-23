package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru26_Scanner {
    // Girilen zamanı saniyeye çeviren bir program yazınız.
    // Örnek Çıktı:
    // 1 saat 10 dakika 50 saniye ==> 4250 saniye

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir saat giriniz: ");
        int girilenSaat = scan.nextInt();
        System.out.print("Lütfen dakika giriniz: ");
        int girilenDakika = scan.nextInt();
        System.out.print("Lütfen saniye giriniz: ");
        int girilenSaniye = scan.nextInt();

        int saniye = (girilenSaat * 60 * 60) + (girilenDakika * 60) + girilenSaniye;

        System.out.println(saniye + " saniye");
    }
}
