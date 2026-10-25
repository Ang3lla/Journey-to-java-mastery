package ac.rca.io.fileReader;

import java.io.*;

public class Program {
    public static void main(String[] args){
        try{
            FileOutputStream file=new FileOutputStream("student.ser");
            ObjectOutputStream out=new ObjectOutputStream(file);
            Student s1=new Student(101,"jane","mugisha",16);
            out.writeObject(s1);
            Student s2=new Student(101,"rocky","ishimwe",16);
            out.writeObject(s2);
            file.close();
            out.close();
        }catch(IOException e){
            System.out.println("Exception"+e.toString());

        }
    }
}
