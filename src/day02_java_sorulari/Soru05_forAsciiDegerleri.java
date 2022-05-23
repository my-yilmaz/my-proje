package day02_java_sorulari;

public class Soru05_forAsciiDegerleri {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız. (ASCII)

        for (int i = 0; i <= 255; i++) {
            char letter = (char) i;
            System.out.println(i + " - " + letter);

            // for ile 0 dan baslayip 255 kadar olan ASCII degerlerini donguye sokuyoruz
            // char veri turunde degisken olusturup deger olarak fordan gelen degerleri atiyoruz
            // ki bu değerlere karşılık gelen sayı, harf ve sembolleri görebiliriz.
            // sayi ve harf degerlerini konsola yazdiriyoruz
        }
    }
}
