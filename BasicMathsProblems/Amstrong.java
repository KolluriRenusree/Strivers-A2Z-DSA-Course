package BasicMathsProblems;
import java.util.*;
public class Amstrong {
    static boolean isAmstrong(int n){
        int num=n;
        int digitCount=0;
        int sum=0;
        while(n>0){
            n/=10; //removes last digit
            digitCount++;
        }
        n=num;
        while(n>0){
            int digit=n%10;//Get the last Digit;
            sum+=Math.pow(digit, digitCount);
            n/=10;
        }
        return sum==num;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(isAmstrong(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
    
}
