package cn.xfakir.xblog.blog.web.controller;

import cn.xfakir.xblog.blog.service.CategoryService;
import cn.xfakir.xblog.common.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : CategoryController
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:15
 * @Version : 1.0
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/list")
    public List<Category> getCategoryList() {
        System.out.println("list");
        return categoryService.getCategoryList();
    }
}
