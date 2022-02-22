import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(3, "Duong");
        hashMap.put(2, "Hieu");
        hashMap.put(1, "Duc");
        hashMap.put(4, "Giang");
        System.out.println("Display entries in HashMap: ");
        System.out.println(hashMap + "\n");

        Map<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(3, "Duong");
        linkedHashMap.put(2, "Hieu");
        linkedHashMap.put(1, "Duc");
        linkedHashMap.put(4, "Giang");
        System.out.println("\nThe name for " + "3 is " + linkedHashMap.get(3));
    }

}
