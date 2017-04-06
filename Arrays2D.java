/**
 * Created by jorel on 22/3/17.
 */
public class Arrays2D {

    public static void main(String[] args) {

        Double[][] arr2D = new Double[3][3];
        arr2D[0][0]=343d;
        arr2D[0][1]=254d;
        arr2D[0][2]=23.34;
        arr2D[1][0]=34.34;

        for(int row=0;row<arr2D.length;row++){
            for (int col=0;col<arr2D[row].length;col++){
                System.out.print(arr2D[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
