package BasicMathsProblems;
import java.util.*;
public class Prime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;

        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(Prime.isPrime(n)){
            System.out.println(true);
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
    
}
