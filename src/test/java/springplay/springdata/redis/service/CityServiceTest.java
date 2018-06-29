package springplay.springdata.redis.service;

import springplay.springdata.redis.bean.City;
import springplay.springdata.redis.service.ICityService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityServiceTest {

    @Autowired
    private ICityService cityService;

    @Test
    public void testUpdate() {
        City city = new City(1L,"Orleando", 87747567);

        cityService.update(city);

        System.out.println(" city fetched " + cityService.find(city.getId()).getName() );
    }
}
