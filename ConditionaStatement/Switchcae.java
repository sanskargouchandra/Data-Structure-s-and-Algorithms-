package ConditionaStatement;

import java.util.Scanner;

public class Switchcae {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        System.out.print("Enter Opertor: ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+': System.out.println("x+y= "+ (x+y)); 
                        break;
            case '-': System.out.println("x-y= "+ (x-y));
                        break;
            case '*': System.out.println("x*y= "+ (x*y));
                          break;
            case '/': System.out.println("x/y= "+ (x/y));
                         break;
            case '%': System.out.println("x%y= "+ (x%y));
                         break;
            default: System.out.println("Plese Enter right operator");
            }
        }
    }
    

