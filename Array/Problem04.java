package Array;

public class Problem04 {

    public static int test(int arr[]){
        int n = arr.length;
        int trappedwater=0;

        //Left max boundary
        int leftMax[]= new int[n];
        leftMax[0]= arr[0];

        for(int i=0; i< arr.length; i++){
            leftMax[i]= Math.max(arr[i], leftMax[i-1]);
        }
        //Right max Boundary
        int rightMax[] = new int[n];
        rightMax[n-1]=arr[n-1];

        for(int i=n-2; i>=0; i++){
            rightMax[i]= Math.max(arr[i], rightMax[i+1]);
        
}
        //Loop
        for(int i=0; i<n; i++){
            //Water level
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            //Trapped water
            trappedwater = waterlevel-arr[i];
            
        }
        return trappedwater;
    }

    public static void main(String args[]){
        int arr[]= {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
test(arr);
    }
}
