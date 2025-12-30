import java.util.Hashtable;
import java.util.Map;

class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(101, "HR");
        table.put(102, "Finance");

        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        table.remove(101);
    }
}
