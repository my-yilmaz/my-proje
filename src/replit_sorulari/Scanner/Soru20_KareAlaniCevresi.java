package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru20_KareAlaniCevresi {
    // Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
    // Ornek Cikti :
    // Alan: 9
    // Cevre: 12
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Alan: " + (sayi * sayi) + "\nCevre: " + (sayi * 4));
    }
}
