package ac.rca.collections;

public class Student  implements Comparable{
    private Integer code;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    public Student(){}

    public Student(int code, String firstName, String lastName, String email, int age) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object o){
        Student st=(Student) o;
        return  st.code.equals(this.code) && st.firstName.equals(this.firstName)&&st.lastName.equals(this.lastName)&&st.email.equals(this.email)&& st.age.equals(this.age);
    }
    @Override
    public int hashCode(){
        return this.code.hashCode()+this.firstName.hashCode()+this.lastName.hashCode()+this.email.hashCode()+this.age.hashCode();
    }

    @Override
    public String toString() {
        return    "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student)o;
        if(this.code.compareTo(student.code)!=0) {
            return this.code.compareTo(student.code);
        }
        if(this.firstName.compareTo(student.firstName)!=0){
            return this.firstName.compareTo(student.firstName);
        }

        if(this.lastName.compareTo(student.lastName)!=0){
            return this.lastName.compareTo(student.lastName);
        }
        if(this.email.compareTo(student.email)!=0){
            return this.email.compareTo(student.email);
        }
        return student.age.compareTo(this.age);
    }
}

