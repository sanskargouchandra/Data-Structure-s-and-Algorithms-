package ConditionaStatement;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class LargestBwt3No {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value of a:");
        int a = sc.nextInt();

        System.out.print("Enter Value of b:");
        int b = sc.nextInt();

        System.out.print("Enter Value of c:");
        int c = sc.nextInt();

        if(a>b && a>c){
           System.out.println("a is Greaest");
        }else if(b>a && b>c){
            System.out.println("b is Greatest");
        }else if(c>a && c>b){
            System.out.println("c is Gratest");
        }
    }
}
