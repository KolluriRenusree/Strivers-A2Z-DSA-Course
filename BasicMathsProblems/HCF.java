package BasicMathsProblems;

import java.util.Scanner;

public class HCF {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A value: ");
        //System.out.println("Enter B value: ");
        int a=sc.nextInt();
        System.out.print("Enter B value: ");
        int b=sc.nextInt();
        int temp=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
            temp=i;
        }
    }
            System.out.println(temp);

            sc.close();

    }
    
}
