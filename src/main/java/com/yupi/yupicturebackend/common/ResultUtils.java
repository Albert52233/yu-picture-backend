package com.yupi.yupicturebackend.common;

import com.yupi.yupicturebackend.exception.ErrorCode;

/**
 * responseUtil class
 */
public class ResultUtils {

    /**
     * success
     *
     * @param data
     * @param <T>  datatype
     * @return response
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * fail
     *
     * @param errorCode error code
     * @return response
     */
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     *
     * @param code    error code
     * @param message error message
     * @return response
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode
     * @return response
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }
}