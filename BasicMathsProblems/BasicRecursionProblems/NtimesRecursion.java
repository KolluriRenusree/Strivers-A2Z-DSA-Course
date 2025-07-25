package BasicMathsProblems.BasicRecursionProblems;
import java.util.*;
public class NtimesRecursion {
    static void PrintMessage(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello Dear!");
        PrintMessage(n-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        PrintMessage(n);
        sc.close();
    }
    
}
