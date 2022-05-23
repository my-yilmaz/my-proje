package replit_sorulari.For_while;

public class Soru05_For_while {
    // 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
    // OUTPUT : 100 98 96 94 92 … … … … 2 0
    public static void main(String[] args) {
        System.out.print(" Even Numbers from 20 to 0 are: ");
        sayilariYazdir(20);
    }
    public static void sayilariYazdir(int sayi) {
        if (sayi >= 0) {
            System.out.print(sayi + " ");
            sayilariYazdir(sayi-2);
        }
    }
}
