package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru27_Scanner {
    // Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına
    // dönüştürmek için bir Java programı yazın.
    // INPUT:
    // Dakika sayısı: 3456789
    // OUTPUT :
    // 3456789 dakika yaklaşık 6 yıl 210 gündür

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dakika giriniz: ");
        int girilenDakika = scan.nextInt();

        int gun = girilenDakika / (24 * 60);
        int artikGun = gun % 365;
        gun = gun - gun % 365;
        int yil = gun / 365;
        System.out.println(girilenDakika + " dakika yaklasik " + yil + " yil " + artikGun + " gundur");

    }
}
