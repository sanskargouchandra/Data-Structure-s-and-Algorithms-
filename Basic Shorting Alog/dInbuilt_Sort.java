package Shorting;
import java.util.Arrays;


public class dInbuilt_Sort {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]){
        int arr[]= {4,5,2,3,1};
        Arrays.sort(arr);// All members are shorted
        // Arrays.short(arr,4,3); Shorted certain members of an array
        printArray(arr);
    }
}
