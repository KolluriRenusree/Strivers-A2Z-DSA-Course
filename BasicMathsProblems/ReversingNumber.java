package BasicMathsProblems;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int temp=num;
        int reverse=0;
        while(temp!=0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        System.out.println(reverse);
        sc.close();

    }
    
    
}
