import java.util.TreeSet;

class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);

        System.out.println("Lowest: " + set.first());
        System.out.println("Highest: " + set.last());

        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
