package ac.rca.io.fileReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;




public class FileWrite {
    public static void main(String[] args) {
        String filename = "C:\\Users\\HP\\Downloads\\Y2C Students - Sheet1.csv";
        Path path=Paths.get(filename);

        try(BufferedWriter write=new BufferedWriter(new FileWriter(path.toString()))){

        }catch (IOException e){
            System.out.println("failed writing into the file");
        }

        try (BufferedReader read = new BufferedReader(new FileReader(path.toString()))) {
            String line;
           while((line=read.readLine())!=null){
               System.out.println(line);
           }

        } catch (IOException e) {
            System.out.println("failed to read into file " + e.getMessage());
        }


    }
}