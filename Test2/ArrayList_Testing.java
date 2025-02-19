package Test2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Testing{
    public static void main(String[] args) {
        // array
        int[] arr = new int[4]; // Specify the size of the array (5 elements)
        // Assign values to the array according to the index
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println("Printing Array arr = " + Arrays.toString(arr));
        System.out.println("arr index 2 = " + arr[2]);

        // Arraylist
        ArrayList<String> aL = new ArrayList<>(); // Specify the type parameter for the ArrayList
        aL.add("a");
        aL.add("b");
        aL.add("c");
        aL.add("d");
        aL.add("e");
        System.out.println("Printing ArrayList aL = " + aL);
        System.out.println("aL size = " + aL.size());
        aL.remove(1); // Remove element at index 1
        aL.remove("d"); // Remove element "d"
        System.out.println("Printing ArrayList aL = " + aL);
        System.out.println("aL at index 1 = " + aL.get(1));

        // Converting array to arraylist
        // Create a list of type integer using arraylist
        List<Integer> list = new ArrayList<>();

        // Using for loop to convert it
        for (Integer myNumber:arr) {
            list.add(myNumber);
        }
        System.out.println("Printing List from arr = " + list);
    }
}
