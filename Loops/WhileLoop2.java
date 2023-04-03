package Loops;


import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any no.: ");
        int a= sc.nextInt();
        int factorial=1;
        for(int i=1; i<=a; i++){
            
            factorial = factorial*i;
        }
        System.out.println("Factorial is = "+ factorial);
    }

}

    
    


