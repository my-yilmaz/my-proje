package day01_java_sorulari;

import java.util.Arrays;
import java.util.Random;

public class Soru03_Random_Ortalama {
    public static void main(String[] args) {

        // Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak
        // programı geliştirin.
        // Programı yazarken aşağıdaki özelliklere uygun yazınız.
        // Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. Sabit elemanlı bir dizi vermeyin!
        // Ortalama almayı sağlayacak kodu bir method halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
        // Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return) etsin.

        int[] sayilar = new int[100];

        for (int i = 0; i < 100; i++) {
            Random rnd = new Random();
            int sayi = rnd.nextInt(1000);
            sayilar[i] = sayi;
        }
        System.out.println("Rastgele 100 sayi: " + Arrays.toString(sayilar));

        double ort = ortalama(sayilar);
        System.out.println("100 sayinin ortalaması: " + ort);

    }

    private static double ortalama(int[] sayilar) {
        double toplam = 0;
        for (int i = 0; i < 100; i++) {
            toplam += sayilar[i];

        }
        return toplam / 100;
    }

}