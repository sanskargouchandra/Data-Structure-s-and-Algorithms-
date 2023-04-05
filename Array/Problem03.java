package Array;

public class Problem03 {

    public static int test(int arr[]){
       int buy= arr[0];
       int profit =0;

       for(int i=0; i<arr.length; i++){
        if(buy<arr[i]){
            profit = Math.max(arr[i]- buy, profit);
        }else{
            buy= arr[i];
        }
       }
       return profit;
    }


    public static void main(String args[]){
        int arr[]= {7, 1, 5, 3, 10};
        System.out.println(test(arr));
    }
}
