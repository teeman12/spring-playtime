package springplay.springdata.redis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@ComponentScan("springdata.redis")
public class RedisConfig {

    @Bean
    JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName("localHost");
        jedisConnectionFactory.setPort(6379);

        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate redisTemplate(){
        final RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());

        return redisTemplate;
    }
}
