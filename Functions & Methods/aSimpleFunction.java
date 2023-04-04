package Functions;

import java.util.Scanner;

public class aSimpleFunction {

public static void calculatesum(int num1,int num2){

int sum = num1+num2;

System.out.print("Sum of a and b = "+ sum);
}

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Ener value of b: ");
        int b = sc.nextInt();

        calculatesum(a, b);

    }
}
