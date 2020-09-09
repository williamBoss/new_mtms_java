package com.ruoyi.common.core.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ruoyi.common.constant.ErrorCodeEnum;
import com.ruoyi.common.constant.ResponseConstants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author KING
 */
@Data
@ApiModel("通用返回对象")
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = -3507193252343603605L;

    @ApiModelProperty(value = "成功失败标志")
    private Boolean success;

    @ApiModelProperty(value = "状态值")
    private Integer code;

    @ApiModelProperty(value = "提示信息")
    private String msg;

    @ApiModelProperty(value = "errorCode")
    private String errorCode;

    @ApiModelProperty(value = "简要描述后端出错原因")
    private String errorMessage;

    @ApiModelProperty(value = "数据")
    private T data;

    private BaseResult() {

    }

    /**
     * 成功方法
     *
     * @return
     */
    public static <T> BaseResult<T> success() {
        return new BaseResult<T>().setSuccess(true).setCode(ResponseConstants.RESPONSE_SUCCESS).setErrorCode("00000")
            .setErrorMessage("").setMsg("成功");
    }

    /**
     * 失败
     *
     * @return
     */
    public static <T> BaseResult<T> failure() {
        return new BaseResult<T>().setSuccess(false).setCode(ResponseConstants.ERROR_CODE).setErrorCode("A0500")
            .setErrorMessage("失败").setMsg("未知异常，请联系管理员");
    }

    /**
     * 失败 直接使用错误码枚举类
     *
     * @param errorCodeEnum
     * @return
     */
    public static <T> BaseResult<T> failure(ErrorCodeEnum errorCodeEnum) {
        return new BaseResult<T>().setSuccess(false).setCode(ResponseConstants.ERROR_CODE)
            .setErrorCode(errorCodeEnum.getErrorCode()).setErrorMessage(errorCodeEnum.getErrorMessage())
            .setMsg("未知异常，请联系管理员");
    }

    /**
     * 设置标志值
     *
     * @param success
     * @return
     */
    public BaseResult<T> success(Boolean success) {
        this.setSuccess(success);
        return this;
    }

    /**
     * 设置返回code
     *
     * @param code
     * @return
     */
    public BaseResult<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

    /**
     * 设置返回msg
     *
     * @param message
     * @return
     */
    public BaseResult<T> message(String message) {
        this.setMsg(message);
        return this;
    }

    /**
     * 错误代码
     *
     * @param errorCode
     * @return
     */
    public BaseResult<T> errorCode(String errorCode) {
        this.setErrorCode(errorCode);
        return this;
    }

    /**
     * 简要描述后端出错原因
     *
     * @param errorMessage
     * @return
     */
    public BaseResult<T> errorMessage(String errorMessage) {
        this.setErrorMessage(errorMessage);
        return this;
    }

    /**
     * 设置返回数据
     *
     * @param data
     * @return
     */
    public BaseResult<T> data(T data) {
        this.setData(data);
        return this;
    }

}
