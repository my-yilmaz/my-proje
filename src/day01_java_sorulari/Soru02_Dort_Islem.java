package day01_java_sorulari;

import java.util.Scanner;

public class Soru02_Dort_Islem {
    public static void main(String[] args) {

        // Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir program yazmanız bekleniyor.
        // Program aşağıdaki özellikleri sağlamalıdır.
        // Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme
        // Kullanıcıya 4 işlemden birini seçeceği menüyü konsol ekrana yazdırın.
        // Örneğin: 1-Toplama, 2-Çıkarma vb…
        // Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini isteyin.
        // Bu girilen iki sayıyı değişkenlerde saklayın.
        // Seçilen işlem tipine göre matematiksel işlemi yapın ve konsol ekranına yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Toplama\n2 - Cıkarma\n3 - Carpma\n4 - Bolme");

        System.out.print("Lütfen birinci sayiyi giriniz: ");
        int sayi1 = scan.nextInt();

        System.out.print("Lütfen birinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.print("Lütfen yapacaginiz islemi seciniz: ");
        int islem = scan.nextInt();

        if (islem == 1) {
            System.out.println("Sonuç: " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (islem == 2) {
            System.out.println("Sonuç: " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (islem == 3) {
            System.out.println("Sonuç: " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (islem == 4) {
            System.out.println("Sonuç: " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));
        } else {
            System.out.println("Gecersiz bir islem yaptiniz");
        }
    }
}
