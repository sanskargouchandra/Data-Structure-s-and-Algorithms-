package Functions;

import java.util.Scanner;

public class fPrimeNo {

    public static boolean isprime(int n){
      if(n==2){
        return true;
      }
      
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime =false;
            }
            
        }
        return isprime;
    }

    public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter any no. for checking prime no: ");
int n = sc.nextInt();
boolean  que = isprime( n);
    if(que == false){
        System.out.println("Enterd no. "+n+ " is Not prime");
}else{
    System.out.println("Enterd no. "+n+ " is prime");
}

    }
}
