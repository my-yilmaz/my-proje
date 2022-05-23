package replit_sorulari.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru39_List {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.
     INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     Output:
     [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */

    public static void main(String[] args) {
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        List<String> arrList = new ArrayList<>();
        Collections.addAll(arrList, names);

        String name3=arrList.get(2);
        String name8=arrList.get(7);

        arrList.set(2,name8);
        arrList.set(7,name3);
        System.out.println(arrList);
    }
}