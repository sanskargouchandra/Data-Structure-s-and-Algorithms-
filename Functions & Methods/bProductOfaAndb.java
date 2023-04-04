package Functions;

import java.util.Scanner;

public class bProductOfaAndb {
    public static int product(int a, int b){
        int pro = a*b;
        return pro;
    }


public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter Value of b: ");
    int b = sc.nextInt();

    int pro = product(a, b);
    System.out.print("Product of a nd b: "+pro);
    
}
}
