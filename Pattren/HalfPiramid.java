package Pattren;

import java.util.Scanner;

public class HalfPiramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
