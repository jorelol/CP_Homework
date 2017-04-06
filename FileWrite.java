/**
 * Created by jorel on 29/3/17.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class FileWrite {
    public static void main(String[] args) {

        File newFile = new File("/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/newFile.txt");
        try {
            FileWriter fw = new FileWriter(newFile, true); //true adds to file instead of overwriting
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("abc");
            bw.newLine();
            bw.write("2nd line");
            bw.newLine();
            bw.append("3rd line");
            bw.close();
            fw.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
