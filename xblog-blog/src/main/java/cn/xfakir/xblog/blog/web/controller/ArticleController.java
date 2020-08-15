package cn.xfakir.xblog.blog.web.controller;

import cn.xfakir.xblog.blog.service.ArticleService;
import cn.xfakir.xblog.common.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName : ArticleController
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/11 21:05
 * @Version : 1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/list")
    public List<Article>  getArticleList(){
        return articleService.getArticleList();
    }

    @RequestMapping("/id/{id}")
    public Article getArticleById(@PathVariable(name = "id") Integer id) {
        System.out.println("id");
        Article article =  articleService.getArticleById(id);
        System.out.println(article);
        return article;
    }

    @PostMapping("/add")
    public void addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }

    @RequestMapping("/tag/{id}")
    public List<Article> getArticleByTag(@PathVariable(name = "id") Integer id) {
        System.out.println("tag");
        List<Article> articleList = articleService.getArticleByTag(id);
        System.out.println(articleList);
        return articleList;
    }
}
