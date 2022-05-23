package replit_sorulari.For_while;

public class Soru09_SayiyiTerstenYazdirma {
    public static void main(String[] args) {
        // Write a java program to reverse the number which user entered.
        //Input :1238
        //Output :Reverse Of The Number: 8321

        int input = 1238, reverse = 0;
        while (input != 0) {
            reverse = reverse * 10;
            reverse = reverse + input % 10;
            input = input / 10;
        }
        System.out.println("Reverse Of The Number: "+reverse);
    }
}
