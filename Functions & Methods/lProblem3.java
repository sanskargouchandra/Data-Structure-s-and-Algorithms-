package Functions;

import java.util.Scanner;

public class lProblem3 {

    public static boolean palindrom(int num){
 int n = num;
        int rev=0;

        while(n!= 0){
int d = n%10;
             rev = rev*10 + d;
            
            n=n/10;

        }
       if(num == rev){
        return true;
       }
        return false;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no: ");
        int n = sc.nextInt();



        if(palindrom(n)){
            System.out.println("It is an Palindrom");
        }else{
            System.out.println("It is not an Palindrom");
        }
    }
}
