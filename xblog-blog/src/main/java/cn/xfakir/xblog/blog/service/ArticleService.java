package cn.xfakir.xblog.blog.service;

import cn.xfakir.xblog.common.pojo.Article;

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

    Article getArticleById(Integer id);

    void addArticle(Article article);

    List<Article> getArticleByCategory(Integer categoryId);

    List<Article> getArticleByTag(Integer tagId);

    List<Article> getArticleBySeries(Integer seriesId);
}
