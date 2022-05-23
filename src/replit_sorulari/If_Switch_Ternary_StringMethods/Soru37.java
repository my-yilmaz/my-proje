package replit_sorulari.If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Soru37 {
    /*
     Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
     Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
     INPUT : Mustafa
     OUTPUT : fafafa
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir isim giriniz: ");
        String isim= scan.nextLine().toLowerCase();
        String input="";
        input+=isim.substring(isim.length()-2,isim.length());
        System.out.println(input+input+input);
    }

}
