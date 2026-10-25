package ac.rca.collections;

import java.util.*;

public class mprogram {
    public static void main(String[] args){

        List elements = new ArrayList();
        elements.add(100);
        elements.add("hello");
        elements.add(100);
        elements.add(new Date());
        int number = (Integer)elements.get(0);
        System.out.println(number);

        Set elts = new HashSet();
        elts.add("Gasabo");
        elts.add("Nyarugenege");
        elts.add("Nyabihu");
        elts.add("Kicukiro");
        elts.add("Gasabo");
        System.out.println(elts.size());


        
        List districts = new ArrayList<>();
        districts.add("Gasabo") ;
        districts.add ("Nyarugenege");
        districts.add ("Nyabihu");
        districts.add ("Kicukiro");
        districts.add ("Gasabo");
        System.out.println(districts.size());

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
         nums.add(400);

     nums.add(50);
         nums.add(67); 
         for(int i:nums){
             System.out.println(i);
         }

//         List<String>  Districts = new Stack<String>();
//         districts.add("gASABO");
//         districts.add("Nyarugenge");
//         districts.add("Nyamagabe");
//         districts.add("Nyamasheke");
//         for (int i=districts.size()-1;i>=0; i--){
//             System.out.println(districts.get(i));
//         };
         Set <String> ds = new TreeSet<>();
          ds.add("Gasabo");
          ds.add("Kicukiro");
          ds.add("Nyarugenge");
          ds.add("Nyabihu");
          ds.add("Nyabihu");

          ds.add("Bugesera");
          for(String s:ds){
              System.out.println(s);
          }


//        Student[] students=new Student[4];
//        students[0]=new Student(105,"mary","mugisha",13);
//        students[1]=new Student(106,"john","mugabo",12);
//        students[2]=new Student(107,"robert","niyompuhwe",19);
//        students[3]=new Student(108,"sandra","gihozo",10);
//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i].toString());
//        }
//        List<Student> list=new ArrayList<Student>();
//        list.add(new Student(12,"angella","HIRWA",15));


    }
}
