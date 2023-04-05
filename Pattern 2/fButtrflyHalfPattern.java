package Patternii;

import java.util.Scanner;

public class fButtrflyHalfPattern {

    public static void halfbutterfly(int n){
        int x = 2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<= (x*n)-(x*i); j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    

    
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();

        halfbutterfly(n);

    }
    }
