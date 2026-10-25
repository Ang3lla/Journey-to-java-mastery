package ac.rca.collections;

public class GenericProgram {
    public static void main(String[] args){
        point p1 = new point(20,29);
        point p2 = new point(90.8,8.0);
        System.out.println("p1 si"+p1+"and  p2 is"+p2);
        point<Integer> ps = new point<Integer>(80,80);
        point<Double> pi = new point<Double>(8.9,8.9);
        point<String> remera = new point<String>("Gasabo","Kicukiro");

     }

}
