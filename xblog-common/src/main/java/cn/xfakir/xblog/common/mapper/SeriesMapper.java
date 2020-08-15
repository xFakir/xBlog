package cn.xfakir.xblog.common.mapper;

import cn.xfakir.xblog.common.pojo.Series;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @InterfaceName : SeriesMapper
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 16:48
 * @Version : 1.0
 */
@Mapper
public interface SeriesMapper {
    @Select("select series_id,series_name from series_tb")
    @Results({
            @Result(id = true,column = "series_id",property = "seriesId"),
            @Result(column = "series_name",property = "seriesName")
    })
    List<Series> getTagList();
}
