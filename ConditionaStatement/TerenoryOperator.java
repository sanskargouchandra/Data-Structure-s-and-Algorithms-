package ConditionaStatement;

import java.util.Scanner;

public class TerenoryOperator {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter any no.: ");
int number = sc.nextInt();
String a = ((number%2)==0)? "Even":"Odd";
        System.out.println(a);
    }
}
