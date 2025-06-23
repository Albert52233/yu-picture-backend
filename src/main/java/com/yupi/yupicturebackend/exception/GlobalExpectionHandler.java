package com.yupi.yupicturebackend.exception;


import com.yupi.yupicturebackend.common.BaseResponse;
import com.yupi.yupicturebackend.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j

/**
 *
 * global exception handler
 *
 */
public class GlobalExpectionHandler {

    @ExceptionHandler(BusinessException.class )
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error ("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage() );
    }

    @ExceptionHandler(BusinessException.class )
    public BaseResponse<?> businessExceptionHandler(RuntimeException e) {
        log.error ("BusinessException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR ,e.getMessage() );
    }
}
