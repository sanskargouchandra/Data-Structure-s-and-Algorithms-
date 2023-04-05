package Array;

public class Test {

    public static int test(int arr[]){
       int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    return -1;
    }

    public static void main(String args[]){
        int arr[]= {1,2,3,4,5,6,7,8,9};
    
       int index = test(arr);
       System.out.println("largest is"+index); 

    }    
}
