import java.io.FileWriter;
import java.io.IOException;

class FileWriting22{
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("output.txt");
            fw.write("Digital Nurture 4.0");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println("Written successfully");
    }
}