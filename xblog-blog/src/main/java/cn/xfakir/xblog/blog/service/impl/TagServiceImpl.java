package cn.xfakir.xblog.blog.service.impl;

import cn.xfakir.xblog.blog.service.TagService;
import cn.xfakir.xblog.common.mapper.TagMapper;
import cn.xfakir.xblog.common.pojo.Tag;
import cn.xfakir.xblog.common.templates.TagTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : TagServiceImpl
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:47
 * @Version : 1.0
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;


    @Override
    public List<Tag> getTagList() {
        return tagMapper.getTagList();
    }
}
