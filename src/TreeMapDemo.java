import java.util.Map;
import java.util.TreeMap;

class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Low");
        map.put(1, "High");
        map.put(2, "Medium");

        System.out.println("First Key: " + map.firstKey());

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
