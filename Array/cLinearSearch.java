package Array;

import java.util.Scanner;

public class cLinearSearch {

    public static int linearsearch(int numbers[], int n){

        for(int i=0; i<=numbers.length; i++){
            if(numbers[i]==n){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){

        int numbers[]= {1,2,3,4,5,6,7,8,9,10};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. which you have to find in an Array: ");
        int n = sc.nextInt();

        int index = linearsearch(numbers, n);

        if(index == -1){
            System.out.println("Number Not found");
        }else{
            System.out.println("Entred Number is found at "+index);
        }

    }
}
