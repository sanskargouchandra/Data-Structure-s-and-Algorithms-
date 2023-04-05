package Patternii;

import java.util.Scanner;



public class cInvertedHalfPyramidWithNumbers {

    public static void numberpyramid(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();

        numberpyramid(n);
    }
}
