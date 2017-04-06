/**
 * Created by jorel on 5/4/17.
 */
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int num1 = in.nextInt();
        System.out.println("Input second number:");
        int num2 = in.nextInt();
        System.out.println(num1+"x"+num2+"="+num1*num2);
    }
}
