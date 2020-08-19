package cn.xfakir.xblog.common.config;

import cn.xfakir.xblog.common.util.MongoPageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName : MongoConfig
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/19 11:20
 * @Version : 1.0
 */
@Configuration
public class MongoConfig {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Bean
    public MongoPageHelper mongoPageHelper() {
        return new MongoPageHelper(mongoTemplate);
    }
}
