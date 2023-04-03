package Loops;
import java.util.Scanner;

public class ReverseoFAnyno2 {
    public static void main(String args[]){
        
        Scanner sc =new Scanner(System.in);
        
        System.out.print("Enter no. for Reversing: ");
        int n = sc.nextInt();
        int rev=0;
        
        while(n>0){
            int ld = n%10;
        rev = (rev*10)+ld;
            
        
            n/=10;
        
        }
        System.out.println(rev);
            }
        
}
