/**
 * Created by jorel on 15/3/17.
 */
public class Conditional {

    public static void main(String[] args) {

        boolean b1;
        b1 = true && false; // || is OR, && is AND

        b1 = "abc".contains("c") && 5 > 4;

        if (b1) {
            System.out.println("b1 is true");
            System.out.println("2nd line");
        }
        /* {} creates a block - code must be under some function (within blocks)
         * Variables declared within a block cannot be recalled outside of the block */

        double n = 7;
        if (n >= 5 && n <= 8)
            System.out.println("n is within limit");

        if (!(n >= 5 && n <= 8))
            System.out.println("n is not within limit"); // ! is NOT eg if not...

        if (n < 5 || n > 8)
            System.out.println("n is not within limit"); // negates the expression

        String s = "D";

        if (s.equals("A")) {
            System.out.println("A");
        } else if (s.equals("B")) {
            System.out.println("B");
        } else if (s.equals("C")) {
            System.out.println("C");
        } else {
            System.out.println("neither A B C");
        }

        // use switch when there are many if statements, each line represents a different condition
        switch (s) {
            case "A":
                System.out.println("AA");
                break;
            case "B":
                System.out.println("BB");
                break;
            case "C":
                System.out.println("CC");
                break;
            default:
                System.out.println("neither A B C");

        }

        // true value : false value

        int res = s.equals("B") ? 10 : 0;

        System.out.println("res=" + res);

    }

}
