package springplay.springdata.redis.service;

import springplay.springdata.redis.bean.City;
import springplay.springdata.redis.repository.CityRepository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void save(City city) {
        cityRepository.save(city);

    }

    @Override
    public City find(Long id) {
        return cityRepository.find(id);
    }

    @Override
    public Map<Long, City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public void update(City city) {
        cityRepository.update(city);

    }

    @Override
    public void delete(Long id) {
        cityRepository.delete(id);

    }
}
