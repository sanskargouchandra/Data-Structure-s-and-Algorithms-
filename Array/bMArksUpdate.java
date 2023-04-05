package Array;

public class bMArksUpdate {

    public static void update(int marks[]){

        for(int i=0; i<marks.length; i++){
            marks[i]+=1;
            System.out.println("Entred marks: "+ marks[i]);
        }
        System.out.println();
    }

    public static void main(String args[]){

        int marks[] = {98,76,84};
        update(marks);
    }
}
