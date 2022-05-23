package replit_sorulari.list;
   /*
    Write a program that accepts an integer as input and prints first 10 prime numbers greater than
    input Check numbers if they are even or not in a return method.
    Input : 5
    Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
    */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("numbers: ");
        int input = scan.nextInt();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (10 != list.size()) {
            count = 0;
            input++;
            for (int i = 2; input > i; i++)
                if (input % i == 0)
                    count++;
            if (count == 0) {
                list.add(input);
            }
        }
        System.out.println(list);
    }
}