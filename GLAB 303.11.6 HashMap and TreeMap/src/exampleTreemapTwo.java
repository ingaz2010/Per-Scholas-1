import java.util.TreeMap;

public class exampleTreemapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        //Using the firstKey() method
        String firstkey = numbers.firstKey();
        System.out.println("First key: " + firstkey);
        //Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last key: " + lastKey);

        //Using firstEntry(0 method
        System.out.println("First Entry: " + numbers.firstEntry());
        //Using the lastEntry() method
        System.out.println("Last Entry: " + numbers.lastEntry());
    }
}
