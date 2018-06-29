package springplay.springdata.redis.repository;

import springplay.springdata.redis.bean.City;

import javax.annotation.PostConstruct;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CityRepositoryImpl  implements CityRepository{

    private static final String KEY = "CITY";

    RedisTemplate<String,Object> redisTemplate;
    HashOperations<String, Long, City> hashOperations;


    @Autowired
    public CityRepositoryImpl(RedisTemplate<String,Object> redisTemplate) {
        this.redisTemplate = redisTemplate;

    }

    @PostConstruct
    private void init(){
        hashOperations = redisTemplate.opsForHash();

    }

    @Override
    public void save(City city) {
        hashOperations.put(KEY, city.getId(), city);
    }

    @Override
    public City find(Long id) {
        return hashOperations.get(KEY, id);
    }

    @Override
    public Map<Long, City> findAll() {
        return hashOperations.entries(KEY);
    }

    @Override
    public void update(City city) {
        hashOperations.put(KEY, city.getId(), city);

    }

    @Override
    public void delete(Long id) {
        hashOperations.delete(KEY,id);

    }
}
