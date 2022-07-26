package com.yuans.resultdemo.exception;

import com.yuans.resultdemo.result.AppCode;
import com.yuans.resultdemo.result.StatusCode;
import lombok.Getter;

/**
 * @Description:
 * @Author: ys
 * @CreateTime: 2022-07-20  16:55
 */
@Getter
public class APIException extends RuntimeException {
    private int code;
    private String msg;

    // 手动设置异常
    public APIException(StatusCode statusCode, String message) {
        // message用于用户设置抛出错误详情，例如：当前价格-5，小于0
        super(message);
        // 状态码
        this.code = statusCode.getCode();
        // 状态码配套的msg
        this.msg = statusCode.getMsg();
    }

    // 默认异常使用APP_ERROR状态码
    public APIException(String message) {
        super(message);
        this.code = AppCode.APP_ERROR.getCode();
        this.msg = AppCode.APP_ERROR.getMsg();
    }

}
