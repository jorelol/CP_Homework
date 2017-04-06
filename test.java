/**
 * Created by jorel on 29/3/17.
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws Exception {

        String line = null;
        ArrayList<String[]> lines = new ArrayList<String[]>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/google.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] distance = line.split(",");
                lines.add(distance);
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int columnToSum = 4;
        int sum = sumRows(lines, columnToSum);
        System.out.println(sum);
    }

    public static int sumRows(ArrayList<String[]> lines, int columnToSum) {
        int sum = 0;
        for (String[] line : lines) {
            sum = sum + Integer.parseInt(line[columnToSum]);
        }
        return sum;
    }
}



        /*
        Scanner scanner = new Scanner(new File("/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/google.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
        */

