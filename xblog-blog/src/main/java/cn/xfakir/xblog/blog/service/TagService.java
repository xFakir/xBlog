package cn.xfakir.xblog.blog.service;

import cn.xfakir.xblog.common.pojo.Tag;

import java.util.List;

/**
 * @InterfaceName : TagService
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/15 13:23
 * @Version : 1.0
 */
public interface TagService {
    List<Tag> getTagList();
}
