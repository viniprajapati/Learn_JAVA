import java.io.File;
import java.io.IOException;

public class FileHandlingEx {
    public static void main(String[] args) throws IOException {

        /*Creating single directory using mkdir*/
        File directory = new File("G:\\JAVA\\Learn_JAVA\\File using code");
        boolean flag1 = directory.mkdir();

        /*Creating sub folder using mkdirs()*/
        /*
        File directory = new File("G:\\JAVA\\Learn_JAVA\\File using code\\Folder_1\\Folder_2");
        boolean flag1 = directory.mkdirs();
        */
        if (flag1){
            System.out.println("Directory created");

            /*Creating file*/
            File file = new File("G:\\JAVA\\Learn_JAVA\\File using code\\FileHandling_example.txt");
            boolean flag = file.createNewFile();
            if (flag)
                System.out.println("File created");
            else
                System.out.println("Something went wrong while creating file");
        }else
            System.out.println("Something went wrong while creating directory");

    }
}
