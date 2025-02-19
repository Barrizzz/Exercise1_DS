package TimeComplex;

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

    public static void main(String[] args) {
        
    }
}