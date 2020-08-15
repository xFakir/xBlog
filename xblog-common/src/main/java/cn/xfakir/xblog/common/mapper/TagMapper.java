package cn.xfakir.xblog.common.mapper;

import cn.xfakir.xblog.common.pojo.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @InterfaceName : TagMapper
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 16:47
 * @Version : 1.0
 */
@Mapper
public interface TagMapper {
    @Select("select tag_id,tag_name from tag_tb")
    @Results({
            @Result(id = true,column = "tag_id",property = "tagId"),
            @Result(column = "tag_name",property = "tagName")
    })
    List<Tag> getTagList();
}
