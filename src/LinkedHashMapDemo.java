import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
