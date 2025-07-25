package Pattren;

public class NumbersPiramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    
}
