package Array;

public class iMaxSumOfArray_Brute_Force {

    public static void bruitforce(int arr[]){
        int max = Integer.MIN_VALUE;
        int curr = 0 ;
        for(int i= 0; i<arr.length; i++){
            for(int j=i; j<=arr.length; j++){
                curr =0; 
                for(int k=i; k<j; k++){
                    curr+=arr[k];

                }
                System.out.println(curr);
                if(max<curr){
                    max = curr;
                }
            }
            
        }
        System.out.println("Max of among all: "+max);
    }

    public static void main(String args[]){
        int arr[]= {2,4,6,8,10};

        bruitforce(arr);
    }
    
}
