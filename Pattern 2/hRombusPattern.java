package Patternii;

import java.util.Scanner;

public class hRombusPattern {

    public static void rombus(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();

        rombus(n);
    }
}
