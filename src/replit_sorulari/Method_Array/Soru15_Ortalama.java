package replit_sorulari.Method_Array;

public class Soru15_Ortalama {
    // Write a java program that calculates the average value of array elements
    // input[]= {1,2,3,4,5,6,7}
    // Output : 4

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;
        for (int i : input) {
            toplam += i;
        }
        int ortalama = toplam / input.length;
        System.out.println(ortalama);
    }
}
