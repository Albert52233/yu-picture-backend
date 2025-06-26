package com.yupi.yupicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dto.user.UserQueryRequest;
import com.yupi.yupicturebackend.model.entity.LoginUserVO;
import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author albertzhang
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2025-06-23 14:15:03
*/
public interface UserService extends IService<User> {

    /**
     * register
     * @param userAccount
     * @param userPassword
     * @param checkPassword
     * @return
     */
    long userRegister( String userAccount, String userPassword, String checkPassword);

    /**
     * encryption
     * @param userPassword
     * @return user id
     */
    String getEncryptPassword(String userPassword);

    /**
     * login
     * @param userAccount
     * @param userPassword
     * @return decrypted user info
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);



    /**
     * get current user info
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取脱敏后的用户信息
     * @param user
     * @return
     */
    UserVO getUserVO(User user);

    List<UserVO> getUserVOList(List<User> userList);

    /**
     * user logout // 和用户账户注销有区别
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    public QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest) ;


    boolean isAdmin(User user);
}
