package com.lixuan.common.exception;

import com.lixuan.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * @author z7
 * @version 2023/03/08/12:45
 * @description
 */
@Data
public class OaException extends RuntimeException {

    private Integer code;

    private String message;

    /**
     * 通过状态码和错误消息创建异常对象
     * @param code
     * @param message
     */
    public OaException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    /**
     * 接收枚举类型对象
     * @param resultCodeEnum
     */
    public OaException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    @Override
    public String toString() {
        return "OaException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}

