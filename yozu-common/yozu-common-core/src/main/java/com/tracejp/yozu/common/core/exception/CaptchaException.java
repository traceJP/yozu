package com.tracejp.yozu.common.core.exception;

/**
 * 验证码错误异常类
 *
 * @author yozu
 */
public class CaptchaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CaptchaException(String msg) {
        super(msg);
    }
}
