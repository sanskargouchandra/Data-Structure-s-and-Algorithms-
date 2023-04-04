package Functions;

import java.util.Scanner;



public class gRangeOfPrime {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }

        boolean isprime= true;
for(int i =2; i<=Math.sqrt(n); i++){
    if(n%i==0){
        return false;
    }
    
}

return true;
    }

    public static void primerange(int n){
System.out.print("Range of Prime no: ");
        for(int i = 2; i<=n; i++){
            if(isprime(i)==true){
                System.out.print( i+ " ");
            }

        }
System.out.println();
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any no.: ");
        int n = sc.nextInt();

       primerange(n);
        

    }
}
