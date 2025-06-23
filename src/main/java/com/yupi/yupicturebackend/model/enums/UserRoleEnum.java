package com.yupi.yupicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
    public enum UserRoleEnum{

        USER("用户","user"),
        ADMIN("管理员","admin");

        private final String test;
        private final String value;
        UserRoleEnum(String test, String value) {
            this.test = test;
            this.value = value;
        }

        /**
         * enumerate using value
         * @param value
         * @return
         */
        public static UserRoleEnum getEnumByValue(String value) {
            if (ObjUtil.isEmpty(value)) {
                return null;
            }
            for (UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
                if(userRoleEnum.value.equals(value)){
                    return userRoleEnum;
                }
            }
//            Map<String, UserRoleEnum> map = new HashMap<>();
//            map.put("admin", ADMIN);
            return null;
        }
}
