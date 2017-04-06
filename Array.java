/**
 * Created by jorel on 22/3/17.
 */
public class Array {

    public static void main(String[] args) {
        int[] arInt = new int[3]; //this is the size of the array
        arInt[0] = 5;
        arInt[1] = 7;

        for (int i=0;i<arInt.length;i++){ //this assigns values to each element of the array
            System.out.println(arInt[i]);
        }

        System.out.println();

        String[] arStr = new String[]{
                "abc", "def", "ghi"
        };
        for(int j=0;j<arStr.length;j++){
            System.out.println(arStr[j]);
        }
        System.out.println();

        //for each
        for (String el: arStr) {
            System.out.println("for each: "+el);

        }
    }
}
