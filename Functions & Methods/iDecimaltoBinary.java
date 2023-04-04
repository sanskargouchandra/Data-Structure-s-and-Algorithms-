package Functions;

import java.util.Scanner;

public class iDecimaltoBinary {
    
    public static void dectobin(int n){

        int p = 0;
        int d = 0;

        while(n>0){
        int rem = n%2 ;
        
        d = d + (rem*(int)Math.pow(10, p));
        p++;
            n/=2;

        }
System.out.println("Binary: "+ d);

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal no: ");
int n = sc.nextInt();

dectobin(n);

    }
}
