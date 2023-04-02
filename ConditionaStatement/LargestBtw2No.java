package ConditionaStatement;

import java.util.Scanner;

public class LargestBtw2No {
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

    System.out.print("Enter a: ");
    int a = sc.nextInt();

    System.out.print("Enter b: ");
    int b = sc.nextInt();

    if(a>b){
        System.out.println("a is Greater then b");
    }
    else{
        System.out.println("b os Greater than a");
    }
    }
}
