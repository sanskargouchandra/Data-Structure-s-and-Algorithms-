package ArrayTwoD;
import java.util.Scanner;

public class aTwoDArray {
public static boolean find(int matrix[] [], int key){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[i] [j] == key){
                System.out.println("The key is at: "+"("+ i+","+j+")");
                return true;
            }
        }
    }
    return false;
}

public static void largesmall(int matrix[] []){

    int small = Integer.MAX_VALUE;
    int large = Integer.MIN_VALUE;


    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
            large = Math.max(matrix[i] [j], large);
            small = Math.min(matrix[i] [j], small);
        }
    }
System.out.println("Largest no. is: "+large);
System.out.println("Samllest no. is: "+ small);
}

    public static void main(String args[]){
        int matrix[] [] = new int [3] [3];
        int n = matrix.length;    //Length of Rows
        int m = matrix[0].length; //length of columns
        
        //INPUT
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n ; i++){
            for(int j=0; j<m; j++){
                matrix[i] [j] = sc.nextInt();
            }
        }
        //OUTPUT
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i] [j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Enter the characete whic you have to find: ");
        int key = sc.nextInt();
        find(matrix, key);
        largesmall(matrix);
    }
}
