package BasicMathsProblems;

import java.util.Scanner;

public class AreaOfCircle {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value: ");
        double r=sc.nextDouble();
        double pie=Math.PI;
        double area=pie*r*r;
    System.out.println(area);
    sc.close();
    }
}
