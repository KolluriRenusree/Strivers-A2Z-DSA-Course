package BasicMathsProblems;

import java.util.Scanner;

public class Palindromes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter your number: ");
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        while(temp!=0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        if(n==reverse){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
    
}
