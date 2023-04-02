package ConditionaStatement;

import java.util.Scanner;

public class Problem3 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. for Name of Week: ");
        int name = sc.nextInt();

        switch(name){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thrusday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;

            default: System.out.println("Plese Enter no. Between 1 to 7");
        }
    }
}
