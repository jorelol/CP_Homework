/**
 * Created by jorel on 4/4/17.
 */
import java.io.File;
import java.io.FileNotFoundException;

public class StockChange{

    public static void main(String[] args) throws FileNotFoundException {

    String directory = "/Users/jorel/Google Drive/SMU/Exchange/Classes/Computer Programming/";
    File[] filesInDirectory = new File(directory).listFiles();
    for(File f : filesInDirectory) {
        String filePath = f.getAbsolutePath();
        String fileExtension = filePath.substring(filePath.lastIndexOf(".")+1,filePath.length());
        if ("csv".equals(fileExtension)) {
            System.out.println("CSV File Found:"+filePath);
        }
    }


    }

    }
