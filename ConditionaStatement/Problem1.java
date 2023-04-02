package ConditionaStatement;

import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The no.");
        int a = sc.nextInt();

        if(a>=0){
            System.out.println("Entered no. is +ive");
        }else{
            System.out.println("Entered no. is -ive");
        }

    }
}
