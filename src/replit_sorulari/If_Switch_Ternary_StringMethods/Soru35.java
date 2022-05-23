package replit_sorulari.If_Switch_Ternary_StringMethods;


import java.util.Scanner;

public class Soru35 {
    // isim1 çift sayıda karakter içeriyorsa,
    // ikinci kelimeyi ilk adın ortasına yerleştirin
    // ilk kelime tek sayida karakter iceriyorsa
    // “isim1, isim2 ye eklenemiyor” yazdırın
    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet
    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 2 isim giriniz: ");
        String isim1= scan.nextLine().toLowerCase();
        String isim2= scan.nextLine().toLowerCase();

        if (isim1.length() % 2 == 0) {
            System.out.println(isim1.substring(0, isim1.length() / 2) + isim2 + isim1.substring(isim1.length() / 2));
        } else System.out.println("isim1, isim2 ye eklenemiyor");
    }
}
