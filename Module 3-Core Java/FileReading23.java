import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReading23{
    public static void main(String[] args){
        try{
            File fobj=new File("output.txt");
            Scanner sc=new Scanner(fobj);
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}