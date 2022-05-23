package replit_sorulari.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Soru41 {
    public static void main(String[] args) {
        String[] list1 = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};
        ArrayList<String> names = new ArrayList<String>(Arrays.asList(list1));
        ArrayList<String> output = new ArrayList<String>();
        for (String each : names
        ) {
            if (!each.toLowerCase().contains("a")) {
                output.add(each);
            }
        }
        System.out.println(output);
    }
}
/*
         Write a program that deletes the letters 'a' from the names in the list given as input.
         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT :
         [Veli,Omer]

             ArrayList<String> isimler = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
//asList()--> String olarak verilen ifadelerin hepsini ArrayList!'in içine atar.
// Yani list oluşturur. tek tek add demek zorunda kalmayiz
        ArrayList<String> aOlmayanIsimler = new ArrayList<String>();//a olmayan ismlerin atanacagı bos list create edildi

        for (String w : isimler) {
            if (!w.toLowerCase().contains("a")) {//a bulundurmayan ismsler sartı
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan ismler : " + aOlmayanIsimler);
        isimler.clear();
        isimler.addAll(aOlmayanIsimler);
        System.out.println(isimler);
    }
 */