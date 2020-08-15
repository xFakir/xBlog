package cn.xfakir.xblog.portal.web.controller;

import cn.xfakir.xblog.common.mapper.CategoryMapper;
import cn.xfakir.xblog.common.pojo.Category;
import cn.xfakir.xblog.portal.common.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : TestController
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/10 14:05
 * @Version : 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private CategoryMapper categoryMapper;

    @RequestMapping("/noparams")
    public List<Category> test() {

        return categoryMapper.getCategoryList();
    }

    @RequestMapping("/aaa")
    public String aaa(){
        return "aaa";
    }
}
