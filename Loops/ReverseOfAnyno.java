package Loops;

import java.util.Scanner;

public class ReverseOfAnyno {
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);

System.out.print("Enter no. for Reversing: ");
int n = sc.nextInt();

while(n>0){
    int ld = n%10;

    System.out.print(ld);

    n/=10;

}
System.out.println();
    }
}
