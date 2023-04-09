package ArrayTwoD;

public class eStayerSearc {

    public static boolean stairsum(int matrix[] [], int key){

        int row= matrix.length-1, col=0;

        while(row>=0 && col<matrix[0].length){
            if(matrix[row] [col]==key){
                System.out.println("Key is found at: "+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row] [col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }

    public static void main(String args[]){
    int matrix[] []= {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};

            int key = 33;
            stairsum(matrix, key);
    }
}
