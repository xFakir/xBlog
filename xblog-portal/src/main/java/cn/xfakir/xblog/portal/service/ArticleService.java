package cn.xfakir.xblog.portal.service;

import cn.xfakir.xblog.common.pojo.Article;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * @ClassName : ArticleService
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/14 20:58
 * @Version : 1.0
 */
public interface ArticleService {
    List<Article> getArticleList();

    Article getArticleById(ObjectId id);

    void addArticle(Article article);
}
