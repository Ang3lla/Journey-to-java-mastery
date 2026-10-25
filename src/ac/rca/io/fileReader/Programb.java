package ac.rca.io.fileReader;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Programb {
    public static void main(String[] args) throws IOException {
        try{
            FileInputStream file = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            Object s1 = in.readObject();
            System.out.println(s1.toString());
            //cast read object to student
            Student s2 = (Student)in.readObject();
            System.out.println(s2.toString());
            while(true){
                try {
                    Student a = (Student) in.readObject();
                    System.out.println(a);
                }
                catch (EOFException e) {
                    break;
                }
            }
            file.close();
            in.close();
        }
        catch(IOException e){
            System.out.println("Exception Occurred"+e.getStackTrace());
        } catch (ClassNotFoundException e) {
            System.out.println("Exception"+e.getMessage());
        }

    }
}