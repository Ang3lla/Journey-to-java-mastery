package ac.rca.collections;

import java.util.HashMap;
import java.util.Map;

public class phoneDirectory {

    public static void main(String[] args){
        Map<String, String> contact = new HashMap<String,String>();
        contact.put("pm","+2507888548000");

        contact.put("Damascene10","+250788843646");
        contact.put("rib","112");
        contact.put("rca","+25078767353");
        System.out.println("the principal's phone number"+contact.get("pm"));
        System.out.println("looping in a map");
        for(String s:contact.keySet()){
            System.out.println(contact.get(s));
        }


    }
}
