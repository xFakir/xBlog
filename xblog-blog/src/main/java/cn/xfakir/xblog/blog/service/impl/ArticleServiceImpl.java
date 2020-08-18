package cn.xfakir.xblog.blog.service.impl;

import cn.xfakir.xblog.blog.service.ArticleService;
import cn.xfakir.xblog.common.pojo.Article;
import cn.xfakir.xblog.common.templates.ArticleTemplate;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : ArticleServiceImpl
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/14 21:02
 * @Version : 1.0
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleTemplate articleTemplate;

    @Override
    public List<Article> getArticleList() {
        return articleTemplate.getArticleList();
    }

    @Override
    public Article getArticleById(ObjectId id) {
        return articleTemplate.getArticleById(id);
    }

    @Override
    public void addArticle(Article article) {
        articleTemplate.addArticle(article);
    }

    @Override
    public List<Article> getArticleByCategory(Integer categoryId) {
        return articleTemplate.getArticleByCategory(categoryId);
    }

    @Override
    public List<Article> getArticleByTag(Integer tagId) {
        return articleTemplate.getArticleByTag(tagId);
    }

    @Override
    public List<Article> getArticleBySeries(Integer seriesId) {
        return articleTemplate.getArticleBySeries(seriesId);
    }
}
