package replit_sorulari.If_Switch_Ternary_StringMethods;

import java.util.Scanner;

public class Soru32_Switch {
    /*
      Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:
      yanıt a ise,
      "Talebiniz işleniyor" mesajı yazdırılır
      yanıt b ise,
      "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,
      "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
      başka herhangi bir yanıt değeri için,
      "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
       */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen talebinizi a,b,c,d olarak giriniz:" );
        char yanit = scan.next().charAt(0);

        switch (yanit) {
            case 'a':
                System.out.println("Talebiniz isleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiginiz için tesekkür ederiz");
                break;
            case 'c':
                System.out.println("Uzgunuz, su anda herhangi bir yardim yok");
                break;
            default:
                System.out.println("Gecersiz giris, lutfen tekrar deneyin!");
        }
    }
}
