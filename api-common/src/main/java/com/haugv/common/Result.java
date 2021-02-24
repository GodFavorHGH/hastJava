package com.haugv.common;

import com.haugv.constant.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result <T>{

    private int code;
    private String message;
    private T data;

    public Result(int code, String message){
        this(code, message, null);
    }

    /**
     * 无data的成功响应
     * @return
     */
    public static Result successWithoutData(){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        return result;
    }

    /**
     * 带data的成功响应
     * @param data
     * @return
     */
    public Result successWithData(T data){
        this.code = ResultCode.SUCCESS.getCode();
        this.message = ResultCode.SUCCESS.getMessage();
        this.data = data;
        return this;
    }

    /**
     * 失败的响应
     * @return
     */
    public static Result failure(){
        Result result = new Result();
        result.setCode(ResultCode.FAILURE.getCode());
        result.setMessage(ResultCode.FAILURE.getMessage());
        return result;
    }

    /**
     * 自定义错误响应吗和响应信息的响应
     * @param code
     * @param message
     * @return
     */
    public static Result failure(int code, String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
