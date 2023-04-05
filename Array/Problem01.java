package Array;

public class Problem01 {

    public static boolean arrays(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }  
return false;
}
public static void main(String args[]){
    int arr[]= {1,2,3,4,5};
    System.out.println(arrays(arr));
    
}    
}
