package Throw_and_throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        try{
            someMethod();
            otherMethod();
            aMethod();
        } catch (FileNotFoundException e){
            System.out.println("File not found e xception catch in main block");
        } catch (Exception e){
            System.out.println("Exception catch in main block");
        }
    }

    public static void someMethod(){
        try {
            FileReader in = new FileReader("file.txt");
        }catch (FileNotFoundException e){
            System.out.println("In catch block");
        }

        System.out.println("In some method");
    }

    public static void otherMethod() throws FileNotFoundException{
        System.out.println("In other method");
        throw new FileNotFoundException();
        //        FileReader fr = new FileReader("read.txt");
    }

    public static void aMethod() throws Exception{
        System.out.println("aMethod msg");
        throw new FileNotFoundException();
    }
}
