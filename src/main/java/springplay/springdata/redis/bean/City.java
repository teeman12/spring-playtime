package springplay.springdata.redis.bean;

import java.io.Serializable;
import java.util.Objects;


public class City implements Serializable {

    private static final long serialVersionId = 1L;


    private Long id;

    private String name;

    private int population;

    public City(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    public City() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        City city = (City) o;
        return population == city.population && Objects.equals(id, city.id) && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, population);
    }

    @Override
    public String toString() {
        return "City{" + "id=" + id + ", name='" + name + '\'' + ", population=" + population + '}';
    }

    public String fetchElasticSearchMetaData(){
        return " { \"index\" : { \"_index\": \"city\", \"_type\": \"city\"}}";
    }
}
