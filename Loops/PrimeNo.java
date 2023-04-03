package Loops;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter Any no.= ");
         int a = sc.nextInt();

        if(a==2){
            System.out.println("Entered no. is prime");
        }else{
            boolean isprime =true;
            for(int i=2; i<=a-1;i++){
               if(a % 2 == 0){
                   isprime=false;
   
               }
            }
   
            if(isprime==true){
               System.out.println("Entered no. is prime");
            }else{
               System.out.println("Entered no. is not prime");
            }
   
        }
    }
}
