package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru21_Scanner {
    /*Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
    Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
    1 şeker = 1.7 gr
    Örnek Çıktı:
    Yılda 12.41 kg şeker kullanıyor.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen günde kaç bardak cay ictiginzi yaziniz: ");
        int bardakCay = scan.nextInt();
        System.out.print("Lütfen her bardakta kac seker kullandiginizi yaziniz: ");
        int seker = scan.nextInt();

        double gunlukToplamSeker = (seker * bardakCay)*1.7;
        double yillikToplamSeker = (365 * gunlukToplamSeker)/1000;

        System.out.println("Yilda " + yillikToplamSeker + " kg seker kullaniyor.");


    }
}
