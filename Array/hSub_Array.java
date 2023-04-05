package Array;

public class hSub_Array {

    public static void subarray(int arr[]){
        int sum=0 ;
        int n= arr.length;
        for(int i =0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
                for(int k = i; k<=j; k++){
                    sum=sum+arr[k];
                    System.out.print(arr[k]+" ");
                    //System.out.print(sum);
                     
                }
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("TOtal no of Sub arr: "+(n*(n+1))/2);
       
    }

    public static void main(String args[]){

        int arr[]= {2,3,4,5,6};
subarray(arr);



    }
}
