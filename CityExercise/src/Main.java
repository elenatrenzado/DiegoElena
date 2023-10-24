import java.util.*;


public class Main {
    public static void main(String[] args) {
        City c1 = new City(3034000, "New York");
        City c2 = new City(4006700, "London");
        City c3 = new City(502900, "Glasgow");
        City c4 = new City(6037800, "Chicago");
        HashMap<String, Integer> cities = new HashMap<>();
        cities.put(c1.getName(), c1.getPopulation());
        cities.put(c2.getName(), c2.getPopulation());
        cities.put(c3.getName(), c3.getPopulation());
        cities.put(c4.getName(), c4.getPopulation());

        TreeMap<String, Integer> sortedCities = new TreeMap<>(cities);

        Iterator<Map.Entry<String, Integer>> iterator = sortedCities.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("City:" + entry.getKey() + "  Population:" + entry.getValue());
        }
    }
}
