package cn.xfakir.xblog.common.util;

import cn.xfakir.xblog.common.constant.PageCode;
import cn.xfakir.xblog.common.pojo.vo.Xresult;

/**
 * @ClassName : XresultGenerator
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/19 9:45
 * @Version : 1.0
 */
public class XresultGenerator {
    public static Xresult result(Integer status,String msg,Object data) {
        Xresult xresult = Xresult.newInstance();
        xresult.setStatus(status);
        xresult.setMsg(msg);
        xresult.setData(data);
        return xresult;
    }

    public static Xresult success(String msg,Object data) {
        return result(PageCode.REQUEST_SUCCESS.getCode(),msg,data);
    }

    public static Xresult error(String msg,Object data) {
        return result(400,msg,data);
    }
}
