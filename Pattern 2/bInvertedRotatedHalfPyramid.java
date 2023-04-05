package Patternii;

import java.util.Scanner;

public class bInvertedRotatedHalfPyramid {

    public static void inverte(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any no. for pyramid: ");
        int n = sc.nextInt();

        inverte(n);
    }
}
