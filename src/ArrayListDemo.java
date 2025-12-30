import java.util.ArrayList;
import java.util.List;

class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add(1, "C++");            // insert at index
        list.set(0, "Advanced Java");  // update

        System.out.println("Contains Python: " + list.contains("Python"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove("C++");
        list.remove(0);
    }
}
