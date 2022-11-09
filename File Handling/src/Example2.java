import java.io.*;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        File file = new File("File using code//folder_3");
        file.mkdir();
        file = new File("File using code//folder_3//cricketers.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

            bw.write("Virat kholi");
            bw.newLine();
            bw.write("Rohit sharma");
            bw.newLine();
            bw.write("K L Rahul");
            bw.newLine();
            bw.write("M. S. Dhoni");
            bw.newLine();
            bw.close();
        }catch (IOException e) {

            System.out.println("error");
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("File using code//folder_3//cricketers.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("file not found!");
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("\n*****************************\n");
        /*reading file using Scanner*/
        try {
            Scanner sc = new Scanner(new File("File using code//FileHandling_example.txt"));
            String line;
            while (sc.hasNext()){
                line = sc.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("error while reading file");
        }

        file = new File("File using code\\Folder_1\\Folder_2\\demo.txt");
        if (file.delete()){
            System.out.println("Deletion is successful");
        }else {
            System.out.println("Error while deleting");
        }
    }
}
