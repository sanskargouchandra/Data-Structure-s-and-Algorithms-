package Array;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class eBInarySearch {

    public static int binarySearch(int arr[], int n){

        int start =0, end = arr.length-1;

        while(start<=end){

            int mid = (start+end)/2;
                                             //Conditions
            if(arr[mid]==n){
                return mid;
            }
            if(arr[mid]<n){                  //right
                start = mid+1;
            }else{                           //left
                end= mid-1;
            }

        }
        return -1;

    }

    public static void main(String args[]){
        
        int arr [] = {2,4,6,7,8,9,10,15} ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. u have to find: ");
        int n = sc.nextInt();

        int index = binarySearch(arr, n);

        if(index == -1){
            System.out.println("NOt Found");
        }else{
            System.out.println("Entred no. is at "+index);
        }

    }
}
