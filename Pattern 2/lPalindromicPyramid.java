package Patternii;

import java.util.Scanner;

public class lPalindromicPyramid {

    public static void palindrom(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=2; j--){
                System.out.print(j);
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();

        palindrom(n);

    }
}
