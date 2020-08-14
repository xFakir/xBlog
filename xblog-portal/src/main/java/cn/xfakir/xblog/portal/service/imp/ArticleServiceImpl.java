package cn.xfakir.xblog.portal.service.imp;

import cn.xfakir.xblog.common.pojo.Article;
import cn.xfakir.xblog.common.templates.ArticleTemplate;
import cn.xfakir.xblog.portal.service.ArticleService;
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
    public Article getArticleById(Integer id) {
        return articleTemplate.getArticleById(id);
    }

    @Override
    public void addArticle(Article article) {
        articleTemplate.addArticle(article);
    }
}
