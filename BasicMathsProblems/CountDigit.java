package BasicMathsProblems;
import java.util.*;
public class CountDigit {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number: ");
    int n=sc.nextInt();
    int count=0;
    while(n!=0){
        n/=10;
        count++;
    }
    System.out.println(count);
    sc.close();
}
    
}
