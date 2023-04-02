package ConditionaStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Income: ");
        int a = sc.nextInt();
double total;
int tax;
        if(a<500000){
            total = a;
            tax = 0;
            System.out.println("Tax: 0%");
            System.out.println("Total Incliuding Tax: "+ total);

        }else if(a>=500000 && a<1000000){
            
            total = a+ (a*0.2);
            tax = 20;
            System.out.println("Tax: "+ tax + "%");
            System.out.println("Total Incliuding Tax: "+ total);
        }
        else if(a>=10000){
            
            total = a + (a*0.3);
            tax = 30;
            System.out.println("Tax: 30%");
            System.out.println("Total Incliuding Tax: "+ total);
        }
    }
}
