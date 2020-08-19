package cn.xfakir.xblog.common.templates;

import cn.xfakir.xblog.common.pojo.Article;
import cn.xfakir.xblog.common.pojo.vo.Xpage;
import cn.xfakir.xblog.common.util.MongoPageHelper;
import org.bson.types.ObjectId;
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
    @Autowired
    private MongoPageHelper mongoPageHelper;

    public void saveArticle(Article article){
        mongoTemplate.save(article);
    }

    public List<Article> getArticleList(){
        return mongoTemplate.findAll(Article.class);
    }

    public Article getArticleById(ObjectId id) {
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query,Article.class);
    }

    public void addArticle(Article article) {
        mongoTemplate.save(article);
    }

    public List<Article> getArticleByCategory(Integer categoryId) {
        Query query = new Query(Criteria.where("categoryId").is(categoryId));
        return mongoTemplate.find(query,Article.class);
    }

    public List<Article> getArticleByTag(Integer tagId) {
        Query query = new Query(Criteria.where("tags").elemMatch(Criteria.where("tagId").is(tagId)));
        return mongoTemplate.find(query,Article.class);
    }

    public List<Article> getArticleBySeries(Integer seriesId) {
        Query query = new Query(Criteria.where("seriesId").is(seriesId));
        return mongoTemplate.find(query,Article.class);
    }

    public Xpage<Article> getLimitArticle(Integer pageSize, Integer pageNum, String lastId) {
        Query query = new Query();
        return mongoPageHelper.pageQuery(query,Article.class,pageSize,pageNum,lastId);
    }
}
