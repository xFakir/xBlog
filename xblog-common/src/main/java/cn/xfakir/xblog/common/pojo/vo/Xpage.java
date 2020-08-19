package cn.xfakir.xblog.common.pojo.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName : Xpage
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/19 11:03
 * @Version : 1.0
 */
@Data
public class Xpage<T> {
    private Integer pageNum;

    private Integer pageSize;

    private Long total;

    private Integer pages;

    private List<T> list;
}
