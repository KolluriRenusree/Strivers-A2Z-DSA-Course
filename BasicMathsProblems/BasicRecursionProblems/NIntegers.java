package BasicMathsProblems.BasicRecursionProblems;
import java.util.*;
public class NIntegers {
    static void PrintNumber(int i,int n){
        if(i>n){
            return;
        }
            System.out.println(i);
          PrintNumber(i+1,n);
        
    }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            PrintNumber(1,n);
        sc.close();
    }
}
