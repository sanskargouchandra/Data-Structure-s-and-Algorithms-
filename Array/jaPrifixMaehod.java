package Array;

public class jaPrifixMaehod {

    public static void arrays(int arr[]){
        int max= Integer.MIN_VALUE;
        int sum=0;
        int prifix[] = new int [arr.length];
        prifix[0]= arr[0];

        for(int i=1; i<arr.length; i++){
            prifix[i]= prifix[i-1]+ arr[i];
        }

        for(int i=1; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                 sum=0;
     sum= i==0 ? prifix[j] : prifix[j]- prifix[i-1];
            }

               // System.out.print(sum);
                if(max<sum){
                    max = sum;
                }
              
        }
        System.out.println("Max: "+max);
}


      

public static void main(String args[]){
    int arr[]= {-1,-2,6,-1,3};
    arrays(arr);
}    
}