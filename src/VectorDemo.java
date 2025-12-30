import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("A");
        vector.add("B");
        vector.add("C");

        vector.remove("B");

        Enumeration<String> e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
