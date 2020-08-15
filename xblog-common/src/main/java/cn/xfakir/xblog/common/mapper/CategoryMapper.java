package cn.xfakir.xblog.common.mapper;

import cn.xfakir.xblog.common.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName : CategoryMapper
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/10 16:45
 * @Version : 1.0
 */
@Mapper
public interface CategoryMapper {
    @Select("select category_id,category_name from category_tb")
    @Results({
            @Result(id = true,column = "category_id",property = "categoryId"),
            @Result(column = "category_name",property = "categoryName")
    })
    List<Category> getCategoryList();
}
