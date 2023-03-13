package Array.Pattern;

import java.util.Scanner;

public class fibonacciPattern {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter number of row:-");
        int n=scanner.nextInt();
        pattern(n);

    }
    static  void pattern(int n){
        for(int i=1;i<=n;i++){
            int k=fib(i);
            for(int j=0;j<k;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static  int fib(int n){
        if(n==0 || n==1)
            return n;
        return fib(n-2)+fib(n-1);
    }
}
