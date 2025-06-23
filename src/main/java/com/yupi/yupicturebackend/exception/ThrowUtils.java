package com.yupi.yupicturebackend.exception;

/**
 * Exception handling utility class
 */
public class ThrowUtils {

    /**
     * Throws an exception if the condition is true
     *
     * @param condition        the condition to evaluate
     * @param runtimeException the exception to throw
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * Throws an exception if the condition is true
     *
     * @param condition the condition to evaluate
     * @param errorCode the error code
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * Throws an exception if the condition is true
     *
     * @param condition the condition to evaluate
     * @param errorCode the error code
     * @param message   the error message
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }

}
