package cn.xfakir.xblog.portal.web.controller;

import cn.xfakir.xblog.common.pojo.Article;
import cn.xfakir.xblog.common.templates.ArticleTemplate;
import cn.xfakir.xblog.portal.service.ArticleService;
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

    @RequestMapping("/{id}")
    public Article getArticleById(@PathVariable(name = "id") Integer id) {
        return articleService.getArticleById(id);
    }

    @PostMapping("/add")
    public void addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }
}
