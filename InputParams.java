import java.util.Scanner;

/**
 * Created by jorel on 5/4/17.
 */
public class InputParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            //String input = scan.next();
            Integer input = scan.nextInt();
            System.out.println("Got: "+input);
        }
    }
}
