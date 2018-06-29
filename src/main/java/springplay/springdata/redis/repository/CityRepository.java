package springplay.springdata.redis.repository;

import springplay.springdata.redis.bean.City;

import java.util.Map;

public interface CityRepository {

    void save(City city);
    City find(Long id);
    Map<Long, City> findAll();
    void update(City city);
    void delete(Long id);

}
