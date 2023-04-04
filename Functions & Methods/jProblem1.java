package Functions;

import java.util.Scanner;

public class jProblem1 {

public static int average(int a, int b, int c){

    int avg = (a+b+c)/3;

    System.out.println("Average: "+ avg);
    return avg;
}

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        average(a, b, c);
        
    }
}
