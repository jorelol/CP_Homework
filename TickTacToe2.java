/**
 * Created by jorel on 29/3/17.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TickTacToe2 {
    public static void main(String[] args) {

        String[] row1 = null;
        String[] row2 = null;
        String[] row3 = null;

        try {
            File myFile = new File("/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/ticktactoe.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                String currLine = scanner.nextLine();
                System.out.println(currLine);

                if (row1 == null) {
                    row1 = currLine.split(",");
                } else if (row2 == null) {
                    row2 = currLine.split(",");
                } else if (row3 == null) {
                    row3 = currLine.split(",");
                }
            }
            System.out.println("");
        }
        catch(FileNotFoundException fe){
            System.out.println("Problem occurred:" + fe.getMessage());

        }
        if (row1[0].equals(row1[1]) && row1[0].equals(row1[2]) && row1[0].equals("0")){
            System.out.println("0 wins");
        }
        else if (row2[0].equals(row2[1]) && row2[0].equals(row2[2]) && row2[0].equals("0")){
            System.out.println("0 wins");
        }
        else if (row3[0].equals(row3[1]) && row3[0].equals(row3[2]) && row3[0].equals("0")){
            System.out.println("0 wins");
        }
        else if (row1[0].equals(row2[0]) && row1[0].equals(row3[0]) && row1[0].equals("0")){
            System.out.println("0 wins");
        }
        else if (row1[1].equals(row2[1]) && row1[1].equals(row3[1]) && row1[1].equals("0")){
            System.out.println("0 wins");
        }
        else if (row1[2].equals(row2[2]) && row1[2].equals(row3[2]) && row1[2].equals("0")){
            System.out.println("0 wins");
        }
        else if (row1[0].equals(row2[1]) && row1[0].equals(row3[2]) && row1[0].equals("0")){
            System.out.println("0 wins");
        }
        else if (row1[2].equals(row2[1]) && row1[2].equals(row3[0]) && row1[2].equals("0")){
            System.out.println("0 wins");
        }
        else if (row1[0].equals(row1[1]) && row1[0].equals(row1[2]) && row1[0].equals("1")){
            System.out.println("1 wins");
        }
        else if (row2[0].equals(row2[1]) && row2[0].equals(row2[2]) && row2[0].equals("1")){
            System.out.println("1 wins");
        }
        else if (row3[0].equals(row3[1]) && row3[0].equals(row3[2]) && row3[0].equals("1")){
            System.out.println("1 wins");
        }
        else if (row1[0].equals(row2[0]) && row1[0].equals(row3[0]) && row1[0].equals("1")){
            System.out.println("1 wins");
        }
        else if (row1[1].equals(row2[1]) && row1[1].equals(row3[1]) && row1[1].equals("1")){
            System.out.println("1 wins");
        }
        else if (row1[2].equals(row2[2]) && row1[2].equals(row3[2]) && row1[2].equals("1")){
            System.out.println("1 wins");
        }
        else if (row1[0].equals(row2[1]) && row1[0].equals(row3[2]) && row1[0].equals("1")){
            System.out.println("1 wins");
        }
        else if (row1[2].equals(row2[1]) && row1[2].equals(row3[0]) && row1[2].equals("1")) {
            System.out.println("1 wins");
        }
        else {
            System.out.println("Draw");
        }

    }
}
