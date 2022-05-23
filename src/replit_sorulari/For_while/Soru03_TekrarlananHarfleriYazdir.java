package replit_sorulari.For_while;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru03_TekrarlananHarfleriYazdir {
    public static void main(String[] args) {
        // Write a code that returns the duplicate chars in a String array.(interview Question)
        // Input :
        // String str=“Javaisalsoeasy”
        // Output: [a, s]
        String str = "Javaisalsoeasy";
        String[] arr = str.split("");
        Arrays.sort(arr);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                list.add(arr[i]);
            }
        }
        List<String> newlist = new ArrayList<>();
        for (String s : list) {
            if (!newlist.contains(s)) {
                newlist.add(s);
            }
        }
        System.out.println(newlist);
    }
}
