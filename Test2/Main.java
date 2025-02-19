package Test2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char chr; //2 Bytes
        int asciiVal; //4 Bytes
        // Target to cast from char --> int (smaller --> larger)

        System.out.println("Enter a character: ");
        
        Scanner scn = new Scanner(System.in); // scn is a reference variable
        chr = scn.next().charAt(0); // Read a character from the user at index 0
        // Java can do auto casting: from smaller --> larger (name: Widening Conversion)

        asciiVal = chr; // char --> int (Widening Conversion)
        System.out.println("ASCII value of " + chr + " is: " + asciiVal);

        // Using unicode in print statement
        System.out.println("Unicode: \u0041\u005F\u002A");

        scn.close();
    }
}
