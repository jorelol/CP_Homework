/**
 * Created by jorel on 18/3/17.
 */
public class Fibonacci {
    public static void main(String[] args) {

        int n=10;
        int first=0;
        int second=1;
        int next;
        int i;

        for(i=0;i<=n;i++) {
            if (i <= 1)
                next = i;
            else{
                next=first+second;
                first=second;
                second=next;
            }
            System.out.println(next+"\t");
        }
    }

}
