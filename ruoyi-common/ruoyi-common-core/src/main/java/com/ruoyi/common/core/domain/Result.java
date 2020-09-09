package com.ruoyi.common.core.domain;

import com.ruoyi.common.constant.ResponseConstants;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Result {

    private static final long serialVersionUID = -8157613083634272196L;

    private Boolean success;

    private Integer code;

    private String msg;

    private Map<String, Object> data = new HashMap<>();

    private Result() {

    }

    public static Result ok() {
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(ResponseConstants.RESPONSE_SUCCESS);
        r.setMsg("成功");
        return r;
    }

    public static Result error() {
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResponseConstants.ERROR_CODE);
        r.setMsg("未知异常，请联系管理员");
        return r;
    }

    public Result success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    public Result code(Integer code) {
        this.setCode(code);
        return this;
    }

    public Result message(String message) {
        this.setMsg(message);
        return this;
    }

    public Result data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

}