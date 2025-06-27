package com.yupi.yupicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

@Getter
public enum PictureReviewStatusEnum {

        REVIEWING("待审核", 0),
        PASS("通过", 1),
        REJECT("拒绝", 2);

        private final String test;
        private final int value;
        PictureReviewStatusEnum(String test, int value) {
            this.test = test;
            this.value = value;
        }

        /**
         * enumerate using value
         * @param value
         * @return
         */
        public static PictureReviewStatusEnum getEnumByValue(Integer value) {
            if (ObjUtil.isEmpty(value)) {
                return null;
            }
            for (PictureReviewStatusEnum userRoleEnum : PictureReviewStatusEnum.values()) {
                if(userRoleEnum.value == value){
                    return userRoleEnum;
                }
            }
            return null;
        }
}
