package day01_java_sorulari;

import java.util.Scanner;

public class Soru01_Sifre {
    public static void main(String[] args) {
        // String tipinde sabit bir şifre değişkeni oluşturun.
        // Örneğin: String sifre = “12345”; gibi.
        // Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
        // Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
        // Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.

        String sifre = "12345";
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 5 haneli sifrenizi giriniz");
        String girilenSifre = scan.nextLine();

        if (sifre.equals(girilenSifre)) {
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Giriş Başarısız!");
        }
    }
}
