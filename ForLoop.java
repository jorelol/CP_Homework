/**
 * Created by jorel on 15/3/17.
 */
public class ForLoop {

    public static void main(String[] args) {

        for (int i=0;i<10; i++) {
            if (i==6) continue;
            // == - equals equal to... skips i=6 and continues to the next step
            System.out.println("i=" + i);
            if (i>7) break;
            //breaks the loop after condition is met
        }

        System.out.println();
        for (int j=5;j>0;j--) {
            System.out.println("j=" +j);
        }
        /* conditional loop, number of times loop */

        int k=0;
        while (k<10) {
            System.out.println("k="+k);
            k++;
        }

        int m=10;
        do {
            System.out.println("m"+m);
            m--;
        } while (m<5);
    }
}
