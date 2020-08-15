package cn.xfakir.xblog.blog.web.controller;

import cn.xfakir.xblog.blog.service.SeriesService;
import cn.xfakir.xblog.common.pojo.Series;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName : SeriesController
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:17
 * @Version : 1.0
 */
@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired
    private SeriesService seriesService;

    @RequestMapping("/list")
    public List<Series> getSeriesList() {
        return seriesService.getSeriesList();
    }
}
