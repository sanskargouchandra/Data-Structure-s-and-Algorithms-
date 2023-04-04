package Functions;

import java.util.Scanner;

public class kProblem2 {

    public static boolean isEven(int n){
boolean isEven = true;
        if(n%2==0){
            isEven = true;
        }else{
            isEven = false;
        }
        return isEven;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        int n = sc.nextInt();

        boolean isEven= isEven(n);

        if(isEven==true){
            System.out.println("Given no. is even");
        }else{
            System.out.println("Given no. is odd");
        }

    }
}
