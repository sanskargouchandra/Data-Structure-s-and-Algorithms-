package Functions;

public class eFunctionOverloading {

    public static int sum(int a, int b){

        int sum = a+b;
        return sum;
    }

    public static int sum(int a, int b, int c){
        int sum = a+b+c;

        return sum;


    }
    public static void main(String args[]){
        System.out.println("Sum of a and b: "+sum(3,4));
        System.out.println("Sum of a, b and c: "+sum(5,34,34));
    }
}
