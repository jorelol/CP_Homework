/**
 * Created by jorel on 29/3/17.
 */
import java.io.File;

public class FileExercise {
    public static void main(String[] args) {
// write a program that sums up the total space used up by a directory
        int count = new File("/users").list().length;
        System.out.println(count);

        String tmpDir = System.getProperty("java.io.tmpdir");
        File tmpDirFile = new File(tmpDir);
        File[] fileList = tmpDirFile.listFiles();
        for (File f : fileList){
            System.out.println(f+" "+f.isDirectory()+" "+f.length());

        }
    }
}