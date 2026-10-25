package ac.rca.io.fileReader;

import java.io.Serializable;

public class Student implements Serializable {
    public int code;
    public String firstName;
    public String lastName;
    public int age;
    public Student(){

    }

    public Student(int code, String lastName, String firstName, int age) {
        this.code = code;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
