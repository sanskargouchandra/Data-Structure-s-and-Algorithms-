package Shorting;

public class cInsertion_Short {

    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev= i-1;

            //finding out the correct position to insert

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]= curr;
                prev--;
            }
            arr[prev+1]= curr;
        }
}
public static void printArray(int arr[]) {
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
}

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};

insertion(arr);
printArray(arr);

    }
}
