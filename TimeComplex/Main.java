package TimeComplex;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void iterateCubes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("i " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
    }

    public static void iterateSquares(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i " + i + ", j: " + j);
            }
        }
    }

    public static ArrayList<Integer> generateRandomArray(int n) {
        ArrayList<Integer> list = new ArrayList<>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1000000));
        }

        return list;
    }

    public static void main(String[] args) {
        /* 
        Runnable task1 = () -> iterateCubes(5);
        Runnable task2 = () -> iterateSquares(10);

        PerformanceMetrics.measureRuntime(task1);
        System.out.println("===================================");
        PerformanceMetrics.measureRuntime(task2); 
        */
        
    }
}