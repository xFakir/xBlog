package cn.xfakir.xblog.blog.web.controller;

import cn.xfakir.xblog.blog.service.ArticleService;
import cn.xfakir.xblog.common.pojo.Article;
import cn.xfakir.xblog.common.pojo.Category;
import cn.xfakir.xblog.common.pojo.Tag;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
    public Article getArticleById(@PathVariable(name = "id") ObjectId id) {
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

    @RequestMapping("/test/add")
    public void getArticle() throws IOException {
        String html = "";
        FileReader fr = new FileReader("D:/JVM.md");
        char[] buffer = new char[1024];
        while (fr.read(buffer) != -1) {
            html += new String(buffer);
        }

        Article article = new Article();
        article.setAuthor("xx");
        Category category = new Category();
        category.setCategoryId(11);
        category.setCategoryName("Spring");
        article.setCategory(category);
        Tag tag = new Tag();
        tag.setTagId(11);
        tag.setTagName("aaa");
        List<Tag> list = new ArrayList();
        list.add(tag);
        article.setTags(list);
        article.setContent(html);
        article.setSummary("aaa");
        article.setTitle("aaaa");

        articleService.addArticle(article);
    }
}
