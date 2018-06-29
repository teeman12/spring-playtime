package springplay.springdata.redis.service;

import springplay.springdata.redis.bean.City;

import java.util.Map;

public interface ICityService {
    void save(City city);
    City find(Long id);
    Map<Long, City> findAll();
    void update(City city);
    void delete(Long id);
}
