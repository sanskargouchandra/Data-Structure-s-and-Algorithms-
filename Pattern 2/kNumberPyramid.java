package Patternii;

import java.util.Scanner;

public class kNumberPyramid {

    public static void nopy(int n){
        for(int i=1; i<=n; i++){
           for(int j =1; j<=n-i; j++){
            System.out.print(" ");
           }
           for(int j=1; j<=i; j++){
            System.out.print(i+ " ");
           }
           System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n= sc.nextInt();

        nopy(n);
    }
}
