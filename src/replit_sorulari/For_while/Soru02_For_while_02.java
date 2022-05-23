package replit_sorulari.For_while;

import java.util.Scanner;

public class Soru02_For_while_02 {
    //  Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    //  Input :
    //  30 and 40
    //  Expected OutPut:
    //  GCD for 30 and 40 = 10
    // LCM for 30 and 40 = 120
    public static void main(String[] args) {
        int sayi1, sayi2, ebob = 1, ekok;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        sayi2 = scan.nextInt();

        int min = Math.min(sayi1, sayi2);

        for (int i = min; i > 0; i--) {
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                ebob = i;
                break;
            }
        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("Girdiginiz " + sayi1 + " ve" + sayi2 + " sayilarin EBOBU: " + ebob);
        System.out.println("Girdiginiz " + sayi1 + " ve" + sayi2 + " sayilarin EKOKU: " + ekok);
    }
}
