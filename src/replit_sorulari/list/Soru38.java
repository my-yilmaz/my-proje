package replit_sorulari.list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru38 {
    public static void main(String[] args) {
        String input = "Learning java is easy";
        String[] arr = input.split("");
        List<String> arrList = new ArrayList<>();
        Collections.addAll(arrList, arr);
        StringBuilder enCokTekrarEden = new StringBuilder();
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                enCokTekrarEden = new StringBuilder(arr[i]);
            } else if (count == maxCount) {
                enCokTekrarEden.append(", ").append(arr[i]);
            }
            count = 0;
        }

        System.out.println(" maximum occurring character is : " + enCokTekrarEden);

    }
}
