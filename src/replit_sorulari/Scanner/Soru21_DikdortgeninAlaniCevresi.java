package replit_sorulari.Scanner;

import java.util.Scanner;

public class Soru21_DikdortgeninAlaniCevresi {
    // Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
    // Örnek Çıktı:
    // Alan: 32
    // Çevre: 24
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dikdortgenin kısa kenarini tam sayi giriniz: ");
        int kisaKenar = scan.nextInt();
        System.out.print("Lütfen dikdortgenin uzun kenarini tam sayi giriniz: ");
        int uzunKenar = scan.nextInt();
        System.out.println("Alan: " + (uzunKenar * kisaKenar) + "\nCevre: " + ((uzunKenar + kisaKenar) * 2));
    }
}
