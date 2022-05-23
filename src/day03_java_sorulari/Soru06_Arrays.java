package day03_java_sorulari;

import java.util.Arrays;

public class Soru06_Arrays {
    public static void main(String[] args) {

        // $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        // String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 "; // String girdimiz
        String [] arr = str.split(" "); //str değişkenini " " den split  split edip arr Array değişkenine atıyoruz
        System.out.println("arr: "+Arrays.toString(arr)); // Arrayi to string metodu ile ekrana yazdırıyoruz.

        int toplamDolar = 0;    // dolar ve sterlin toplamlarını hafızaya alabilceğimiz iki ayrı değişken oluşturuyoruz.
        int toplamSterlin = 0;

        for (String s : arr) {   // arr'deki elemanlari for each loop döngüsüne sokup if'ler oluşturuyoruz.
            if (s.contains("$")) {   // arr'de $ işareti var ise... Integer.parseInt() metodu ile sayısal verileri toplama ekleriz.
                toplamDolar += Integer.parseInt(s.replace("$", ""));   //replace metodu ile sayısal olmayan ifadeleri yok ediyoruz.
            } else {
                toplamSterlin += Integer.parseInt(s.replace("£", ""));  //aynı işlemleri "£" ögesi içn de yapıyoruz.
            }                                               //"$" ve "£", 2 öğe olduğu için else ile döngümüzü kapatıyoruz.
        }
        System.out.println("Toplam dolar: " + toplamDolar+"\nToplam sterlin: " + toplamSterlin);
    }
}
