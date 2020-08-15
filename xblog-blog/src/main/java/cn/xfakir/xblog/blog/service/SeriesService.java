package cn.xfakir.xblog.blog.service;

import cn.xfakir.xblog.common.pojo.Series;

import java.util.List;

/**
 * @InterfaceName : SeriesService
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:24
 * @Version : 1.0
 */
public interface SeriesService {
    List<Series> getSeriesList();
}
