package Loops;

import java.util.Scanner;

public class SquarePatternForLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no. for Sq: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
               System.out.println("****");
        }
    }
}
