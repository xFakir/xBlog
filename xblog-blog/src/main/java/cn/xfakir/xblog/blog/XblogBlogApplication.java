package cn.xfakir.xblog.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.xfakir.xblog.common.mapper")
@ComponentScan("cn.xfakir.xblog.*")
public class XblogBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(XblogBlogApplication.class, args);
    }

}
