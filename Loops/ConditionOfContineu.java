package Loops;

import java.util.Scanner;

public class ConditionOfContineu {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter your no.: ");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
    
}
