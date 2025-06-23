package com.yupi.yupicturebackend.common;

import lombok.Data;

/**
 * global page split class
 */
@Data
public class PageRequest {

    /**
     * current page number
     */
    private int current = 1;

    /**
     * page size
     */
    private int pageSize = 10;

    /**
     * sort type
     */
    private String sortField;

    /**
     * sorting order
     */
    private String sortOrder = "descend";
}