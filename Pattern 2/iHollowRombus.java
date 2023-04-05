package Patternii;

import java.util.Scanner;

public class iHollowRombus {

    public static void hollowrombus(int r){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i+1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=r; j++){
                if(i==1||i==r|| j==1| j==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();

       

        hollowrombus(r);
    }
}
