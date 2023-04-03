package Loops;

public class ContineuInLoop {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("I am out from the loop");
    }
}
