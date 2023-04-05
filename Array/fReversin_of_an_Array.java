package Array;

import java.util.Scanner;

public class fReversin_of_an_Array {

    public static void reversArray(int arr[]){

        int start = 0, end = arr.length-1;

        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]= temp;
            
            start++;
            end--;
        }
       
    }

    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7,8,9};

        
        
        reversArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
