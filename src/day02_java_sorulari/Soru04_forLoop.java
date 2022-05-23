package day02_java_sorulari;

public class Soru04_forLoop {
    public static void main(String[] args) {

        // 100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

        int toplam = 0;
        int sayac = 0;
        System.out.println("100'den 0'a kadar 13'e tam bölünebilen sayılar :");
        for (int i = 100; i > 0; i--) {
            if (i % 13 == 0) {
                sayac++;
                System.out.println((sayac) + ". sayi: " + i);
                toplam += i;
            }
        }
        System.out.println("13'e tam bölünebilen sayilarin toplami : " + toplam);
    }
}
