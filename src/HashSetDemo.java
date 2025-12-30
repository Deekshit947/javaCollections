import java.util.HashSet;
import java.util.Set;

class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored

        System.out.println("Size: " + set.size());

        for (String s : set) {
            System.out.println(s);
        }

        set.remove("Banana");
    }
}
