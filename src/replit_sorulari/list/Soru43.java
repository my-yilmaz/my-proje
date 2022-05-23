package replit_sorulari.list;
   /*
        Write a program to find the common elements between two String Arrays (without case sensitivity)
        Input1 : {John,Brad,Ange,Sofia,Emily}
        Input2 : {sofia,brad,grace,emily,hazel}
        Output : [sofia,brad,emily]
         */

import java.util.ArrayList;
import java.util.List;

public class Soru43 {
    public static void main(String[] args) {

        String[] input1 = {"John", "Brad", "Ange", "Sofia", "Emily"};
        String[] input2 = {"sofia", "brad", "grace", "emily", "hazel"};

        List<String> list = new ArrayList<>();

        for (String value : input2) {
            for (String s : input1)
                if (value.equalsIgnoreCase(s)) {
                    list.add(value.toLowerCase().replaceAll("", ""));
                }
        }
        System.out.println(list);
    }
}