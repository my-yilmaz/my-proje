package replit_sorulari.list;

public class Soru40 {
    public static void main(String[] args) {

        String input = "It is very nice to write code.";
        tersInput(input);
    }
    private static void tersInput(String input) {
        String[] arr = input.split("");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            output.append(arr[arr.length - 1 - i]);
        }
        System.out.println(output);
    }
}
  /*  Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

        Note: Upper and lower case letters, spaces and special characters will not be changed.

        Input :

        It is very nice to write code.

        Output :

        .edoc etirw ot ecin yrev si tI

   */