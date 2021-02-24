package com.haugv.constant;

public enum ResultCode {
    SUCCESS(200, "交易成功"),
    FAILURE(444, "交易失败");
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
