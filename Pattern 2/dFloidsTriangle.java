package Patternii;

import java.util.Scanner;

public class dFloidsTriangle {

    public static void floidstriangle(int n){
        int x = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(x+ " ");
                x++;
            }
            System.out.println();
        }
        
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no. for pyramis: ");
        int n = sc.nextInt();

        floidstriangle(n);

    }
}
