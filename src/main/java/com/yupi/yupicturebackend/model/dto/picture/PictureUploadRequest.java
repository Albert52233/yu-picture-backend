package com.yupi.yupicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {
    /**
     * 图片id
     */
    private long id;

    private static final long serialVersionUID= 1L;
}
