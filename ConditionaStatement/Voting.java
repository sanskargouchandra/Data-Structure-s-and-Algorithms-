package ConditionaStatement;
import java.util.Scanner;

public class Voting {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int a = sc.nextInt();

        if(a>=18){
            System.out.println("You are Elegibal for Voting");
        }else{
            System.out.println("You are not Elegibal for Voting");
        }

    }
}
