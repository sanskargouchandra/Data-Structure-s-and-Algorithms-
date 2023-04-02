package ConditionaStatement;

import java.util.Scanner;

public class Problem2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your body Temperature: ");
        double temp = sc.nextDouble();

        if(temp>=100){
            System.out.println("You are in Fever");
        }else{
            System.out.println("Yoe are'nt in Fever");
        }
    }
}
