package club.yuanzhongwei.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 14:37
 * @Version 1.0
 * @Description
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {

}
