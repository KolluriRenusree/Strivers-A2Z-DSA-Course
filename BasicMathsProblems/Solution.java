package BasicMathsProblems;
import java.util.*;
import java.util.List;

public class Solution {

    List<Integer> getDivisors(int n){
        List<Integer> divisors=new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                if(i!=n/i){
                    divisors.add(n/i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Solution solution=new Solution();
        System.out.println("Enter a number");
        int n=sc.nextInt();
        List<Integer>divisors=solution.getDivisors(n);
        System.out.println(divisors);
        sc.close();
    }
}
