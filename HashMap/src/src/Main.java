import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        HashMap : Has unique Key Value
//        Contents are Duplicate
//        Order is not maintained --> Memory is efficient
        HashMap<String, Double> map = new HashMap<>();
        map.put("BirthDay", 18.11111);
        map.put("Tablet", 123.456);
        map.put("Iphone", 100.252);
        map.put("Shoes", 10.252);
        map.put("Jacket", 12.252);
        map.remove("Iphone");
        // Get the whole map
        System.out.println(map);
        // Get the value
        System.out.println(map.get("Tablet"));
        // Check keys if exists
        System.out.println(map.containsKey("BirthDay"));
        // Check if contain a wanted value
        System.out.println(map.containsValue(123.2));
        // Take map size
        System.out.println(map.size());
        // Iterate
        for (String item : map.keySet()) {
            System.out.println(item + " Prices: " + map.get(item));
        }
    }
}
