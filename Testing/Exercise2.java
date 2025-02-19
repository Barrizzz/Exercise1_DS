import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("Welcome to Detective Encrypt Program!");

        while (input.length() < 5) {
            System.out.println("Type something >= 5 chars and press enter:");
            input = scanner.nextLine().toLowerCase(); // Convert to lowercase
        }

        char[] modifiedInput = input.toCharArray();

        // Swap index 1 with index 2
        char secondLetter = modifiedInput[1];
        modifiedInput[1] = modifiedInput[2];
        modifiedInput[2] = secondLetter;

        for (int i = 3; i < input.length(); i++) {
            char currentChar = modifiedInput[i];
            char previousChar = modifiedInput[i - 1];

            int asciiVal = (previousChar - 'a' + currentChar - 'a') % 26 + 'a'; // Widening conversion; also ensuring the letters does not go above 'z'
            modifiedInput[i] = (char) asciiVal;
        }
        System.out.println(modifiedInput);

        scanner.close();
    }
}
