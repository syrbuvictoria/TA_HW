package Collections_HW;

import java.util.HashMap;
import java.util.Map;

public class Map_HW {
    static Map<Integer, String> map = createMap();
    public static Map<Integer, String> createMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Salut");
        map.put(13, "Goodbye");
        map.put(14, "La revedere");
        return map;
    }
    public  Object findEntryByValue(String condition) {
        createMap();
        return map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(condition))//condition on value
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        Map_HW map = new Map_HW();
        System.out.println(map.findEntryByValue("La revedere"));
    }
}
