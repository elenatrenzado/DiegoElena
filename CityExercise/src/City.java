import java.util.Comparator;

public class City {
    private int population;
    private String name;

    public City(int population, String name) {
        this.population = population;
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
