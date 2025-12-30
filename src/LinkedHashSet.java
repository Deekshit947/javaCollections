import java.util.LinkedHashSet;
import java.util.Set;

class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(3);
        set.add(1);
        set.add(2);

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
