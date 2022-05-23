package replit_sorulari.If_Switch_Ternary_StringMethods;

public class Soru30_ikiSayininToplami {
    /*
    Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
    Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

     Ornek:
     INPUT :
     25
     46
     OUTPUT :
     Numaralarin Toplami:
     71
     */
    public static void main(String[] args) {
        long sayi1 = 25;
        long sayi2 = 46;
        System.out.println();
        if (sayi1 >= 999999999 || sayi2 >= 999999999 || (sayi1 + sayi2) >= 999999999) {
            System.out.println("OverFlow");
        } else {
            System.out.println("Numaralarin Toplami: " + (sayi1 + sayi2));
        }
    }
}

