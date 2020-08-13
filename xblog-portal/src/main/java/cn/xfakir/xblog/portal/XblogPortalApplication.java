package cn.xfakir.xblog.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.xfakir.xblog.common.mapper")
@ComponentScan("cn.xfakir.xblog.*")
public class XblogPortalApplication {

    public static void main(String[] args) {
        SpringApplication.run(XblogPortalApplication.class, args);
    }

}
