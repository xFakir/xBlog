package cn.xfakir.xblog.blog.service.impl;

import cn.xfakir.xblog.blog.service.CategoryService;
import cn.xfakir.xblog.common.mapper.CategoryMapper;
import cn.xfakir.xblog.common.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : CategoryServiceImp
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:24
 * @Version : 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }
}
