package cn.xfakir.xblog.common.templates;

import cn.xfakir.xblog.common.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName : ArticleTemplate
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/11 20:57
 * @Version : 1.0
 */
@Component
public class ArticleTemplate {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void saveArticle(Article article){
        mongoTemplate.save(article);
    }

    public List<Article> getArticleList(){
        return mongoTemplate.findAll(Article.class);
    }

    public Article getArticleById(Integer id) {
        Query query = new Query(Criteria.where("articleId").is(id));
        return mongoTemplate.findOne(query,Article.class);
    }

    public void addArticle(Article article) {
        mongoTemplate.save(article);
    }
}
