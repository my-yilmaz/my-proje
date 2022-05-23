package replit_sorulari.If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Soru33_Switch {
    /*
    Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
    INPUT:
    Ay Numarasi:
    Yil :
    2016
    OUTPUT :
    Subat 2016 29 Gundur.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen ay numarasını giriniz: ");
        int ay = scan.nextInt();
        System.out.print("lütfen bulundugunuz yılı giriniz: ");
        int yil = scan.nextInt();

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println(yil+ " Yilinin "+ay+". ayi " +" 31 Gundur.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(yil+ " Yilinin "+ay+". ayi " +" 30 Gundur.");
                break;
            case 2:
                if (yil % 4 == 0) {
                    System.out.println("Subat " +yil+" 29 Gundur.");

                } else {
                    System.out.println("Subat " +yil+" 28 Gundur.");
                }
                break;
            default:
                System.out.println("Gecersiz bir giris yaptiniz");
        }
    }
}
