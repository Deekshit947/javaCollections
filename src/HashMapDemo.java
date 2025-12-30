import java.util.HashMap;
import java.util.Map;

class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Admin");
        map.put(2, "User");
        map.put(3, "Guest");

        map.put(2, "Power User"); // update

        System.out.println(map.get(1));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.remove(3);
    }
}
