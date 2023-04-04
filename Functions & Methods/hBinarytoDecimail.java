package Functions;

import java.util.Scanner;

public class hBinarytoDecimail {

    public static void bintodec(int n){

        int p = 0;
        int d = 0;
        
        while(n>0){
            int ld = n%10;
             d = d + ( ld * (int) Math.pow(2, p));
             p++;
            n/=10;
        
        }

        
System.out.println("Decimal: "+ d);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary no.: ");
        int n = sc.nextInt();

        bintodec(n);

    }
}
