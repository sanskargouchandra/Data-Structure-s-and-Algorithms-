package Loops;

import java.util.Scanner;

public class ConditionOfBreak {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("enter your no.:");
            int a = sc.nextInt();

            if(a%10==0){
                break;
            }
System.out.println(a);
        }while(true);
    }
}
