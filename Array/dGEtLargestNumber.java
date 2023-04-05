package Array;

public class dGEtLargestNumber {

    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest<number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){

        int number[]= {1,2,3,4,56,4,534,241,122,3,1,3,34,5,67};

        System.out.println("Largest among the array is: "+getLargest(number));

    }
}
