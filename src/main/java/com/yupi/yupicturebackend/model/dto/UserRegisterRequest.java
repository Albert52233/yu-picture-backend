package com.yupi.yupicturebackend.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * user register request
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 8735650154179439661L;

    private String userAccount;

    private String userPassword;
    /**
     * 确认
     */
    private String checkPassword;




}
