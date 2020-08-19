package cn.xfakir.xblog.common.constant;

/**
 * @EnumName : PageCode
 * @Description :
 * @Author : xfakir
 * @Date : 2020/8/19 10:00
 * @Version : 1.0
 */
public enum PageCode {
    /**
     * 请求成功
     */
    REQUEST_SUCCESS(200,"request success");



    private Integer code;
    private String msg;
    private PageCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
