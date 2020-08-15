package cn.xfakir.xblog.blog.web.controller;

import cn.xfakir.xblog.blog.service.TagService;
import cn.xfakir.xblog.common.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : TagControoler
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:15
 * @Version : 1.0
 */
@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @RequestMapping("/list")
    public List<Tag> getTagList(){
        return tagService.getTagList();
    }
}
