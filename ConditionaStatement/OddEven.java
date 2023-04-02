package ConditionaStatement;

import java.util.Scanner;

public class OddEven {
    
    public static void main(String args[])
    {
Scanner sc = new Scanner(System.in);

System.out.print("Enter Any no.: ");
int a = sc.nextInt();

if (a%2==0){
System.out.println("Enter no. is EVEN");
}else{
    System.out.println("Enter no.is ODD");
}

    }
}
