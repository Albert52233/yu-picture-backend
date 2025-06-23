package com.yupi.yupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * global delete request
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}