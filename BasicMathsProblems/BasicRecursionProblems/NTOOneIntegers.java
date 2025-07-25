package BasicMathsProblems.BasicRecursionProblems;

import java.util.Scanner;

public class NTOOneIntegers {


    static void printNumbers(int n) {
        if(n < 1) return;
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
        sc.close();
    }
}