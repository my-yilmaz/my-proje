package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru24_Scanner {
    //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen double bir sayi giriniz: ");
        double sayi= scan.nextDouble();
        sayi=(int)sayi;
        System.out.println(sayi);
    }
}
