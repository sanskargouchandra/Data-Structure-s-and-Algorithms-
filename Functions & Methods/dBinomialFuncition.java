
package Functions;

import java.util.Scanner;

public class dBinomialFuncition {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        return f;
    }

    public static int binomial(int n, int r){

        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int bino = a/(b*c);
   return bino;


    }
    public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter value of n: " );
int n = sc.nextInt();

System.out.print("Enter value of r: " );
int r = sc.nextInt();

        int bino = binomial(n, r);

        System.out.print("Binomial Factorial of given no. is: "+bino);

    }
}
