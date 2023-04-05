package Array;

public class gPAring_of_Arrays {

    public static void pairs(int number[]){
        for(int i=0; i<number.length; i++){
            int curr = number[i];
            for(int j = i+1; j<number.length; j++){
                System.out.print("("+number[i]+","+number[j]+")");
            }
            System.out.println();
        }
       
    }

    public static void main(String args[]){
        int number[]={2,3,4,5,6,7,8};
        pairs(number);

    }
}
