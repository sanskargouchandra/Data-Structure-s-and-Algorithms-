package Array;

import java.util.Scanner;

public class aCreatingAndUpadeAnArray {
    public static void main(String args[]){

        int marks[] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks for Phy: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks for Chem: ");  
        marks[1] = sc.nextInt();
        System.out.print("Enter marks for Maths: ");
        marks[2] = sc.nextInt();
        
        System.out.println("Phy: "+ marks[0]);
        System.out.println("Chem: "+ marks[1]);
        System.out.println("Maths: "+marks[2]);
 
        marks[1] = 100;
        System.out.println("Chem: "+marks[1]+"        //UPDATED MARKS");



        //PERCENTAGE OF THREE SUBJECT
        int p = (marks[0]+marks[1]+marks[2])/3;

        System.out.println("Total Percentage of three subject: "+ p);

        System.out.println("Length of Array: "+ marks.length);

    }
}
