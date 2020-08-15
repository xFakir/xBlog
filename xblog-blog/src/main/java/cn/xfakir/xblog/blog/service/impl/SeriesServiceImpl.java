package cn.xfakir.xblog.blog.service.impl;

import cn.xfakir.xblog.blog.service.SeriesService;
import cn.xfakir.xblog.common.mapper.SeriesMapper;
import cn.xfakir.xblog.common.pojo.Series;
import cn.xfakir.xblog.common.templates.SeriesTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName : SeriesServiceImpl
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:48
 * @Version : 1.0
 */
@Component
public class SeriesServiceImpl implements SeriesService {
    @Autowired
    private SeriesMapper seriesMapper;


    @Override
    public List<Series> getSeriesList() {
        return seriesMapper.getTagList();
    }
}
