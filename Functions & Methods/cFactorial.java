package Functions;

import java.util.Scanner;

public class cFactorial {
public static int factorial(int n){

    int f = 1;

    for(int i= 1; i<=n; i++){
        f=f*i;
    }
    return f;
}

    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        int n = sc.nextInt();

        int f = factorial(n);

        System.out.println("Factorial of entered no: "+ f);

    }
}
