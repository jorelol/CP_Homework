/**
 * Created by jorel on 28/3/17.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class TickTacToe {
    public static void main(String[] args) {

        String a ="";

        try {
            File myFile = new File("/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/ticktactoe.txt");
            Scanner scanner = new Scanner(myFile);
            StringBuilder builder = new StringBuilder();
            while(scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
                builder.append(",");
                }

            String strings[] = builder.toString().split(" ");
            System.out.println(Arrays.toString(strings));
            /*int i=0;
            while(scanner.hasNext()) {
                String currLine =scanner.nextLine();
                System.out.println(currLine);
                i++;
                */
            }

        catch(FileNotFoundException fe) {
            System.out.println("Problem occurred: "
                    +fe.getMessage());
        }



    }
}
