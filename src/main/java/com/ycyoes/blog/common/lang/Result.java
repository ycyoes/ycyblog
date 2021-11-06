package com.ycyoes.blog.common.lang;

import lombok.Data;

/**
 * <p>
 *  统一封装返回结果
 * </p>
 *
 * @author ycyoes
 * @since 2021-11-06 20:20
 */

@Data
public class Result {
    private String code;
    private String msg;
    private Object data;

    public static Result success(Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg("操作成功");
        return m;
    }

    public static Result success(String msg, Object data) {
        Result m = new Result();
        m.setCode("0");
        m.setData(data);
        m.setMsg(msg);
        return m;
    }

    public static Result fail(String msg) {
        Result m = new Result();
        m.setCode("-1");
        m.setData(null);
        m.setMsg(msg);
        return m;
    }

    public static Result fail(String msg, Object data) {
        Result m = new Result();
        m.setCode("-1");
        m.setData(data);
        m.setMsg(msg);
        return m;
    }

}
