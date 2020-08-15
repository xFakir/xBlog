package cn.xfakir.xblog.common.templates;

import cn.xfakir.xblog.common.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName : CategoryTemplate
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:43
 * @Version : 1.0
 */
@Component
public class CategoryTemplate {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Category> getCategoryList() {
        return mongoTemplate.findAll(Category.class);
    }
}
