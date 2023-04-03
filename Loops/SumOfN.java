package Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.: ");
        int a = sc.nextInt();

        int x = 1;
        int sum =0;
        while(x<=a){

            sum = sum+x;

            x++;
        }
System.out.print("Palindrom:-");
        System.out.print(sum);
    }
}
