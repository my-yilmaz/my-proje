package replit_sorulari.If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Soru29_Repleace {
    public static void main(String[] args) {
        /*

        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        Input :
        John White
        1234234534561478
        Output : Name :
        J*** W****
        CCN : **** **** **** 1478

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz: ");
        String isim = scan.next();
        System.out.print("Lütfen soyisminizi giriniz: ");
        String soyisim = scan.next();
        System.out.print("Lütfen kredi kartı numaranızı giriniz: ");
        String ccn = scan.next();

        isim=isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
        ccn="**** **** **** "+ccn.substring(ccn.length()-4);

        System.out.println(isim+" "+soyisim+"\nCCN : "+ccn);

    }
}
