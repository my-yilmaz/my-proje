package replit_sorulari.If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Soru34 { /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        Eger aynı karakterlere sahipse
        "isim ayni karakterlere sahiptir." yazdirin.
        Eger ayni kaakterlere sahip degilse
        "Dizenin benzersiz karakterleri var" yazdirin.
        Ternary kullanin.
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzunluğu 3 olan isim giriniz: ");
        String isim = scan.next();
        System.out.println(isim.length() == 3 ? ((isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) ||
                isim.charAt(1) == isim.charAt(2)) ?
                "isim ayni karaterlere sahiptir." : "ismin benzersiz karakterleri var.") : "isim uzunlugu 3 olmalidir.");
    }
}
