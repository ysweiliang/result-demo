package com.yuans.resultdemo.filter;

import com.yuans.resultdemo.exception.APIException;
import com.yuans.resultdemo.result.ResultCode;
import com.yuans.resultdemo.result.ResultVo;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description:
 * @Author: ys
 * @CreateTime: 2022-07-20  16:50
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler({BindException.class})
    public ResultVo methodArgumentNotValidExceptionHandler(BindException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        return new ResultVo(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());
    }

    @ExceptionHandler(APIException.class)
    public ResultVo apiExceptionHandler(APIException e) {
        return new ResultVo(e.getCode(), e.getMsg(), e.getMessage());
    }
}