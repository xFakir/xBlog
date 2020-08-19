package cn.xfakir.xblog.common.pojo.vo;

import lombok.Data;

/**
 * @ClassName : Xresult
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/19 9:38
 * @Version : 1.0
 */
@Data
public class Xresult {
    private Integer status;

    private String msg;

    private Object data;

    public static Xresult newInstance() {
        return new Xresult();
    }


}
