package com.imooc.service;

import com.imooc.pojo.Users;

public interface UserService {
    /**
     * 判断用户是否存在，如果存在则返回用户信息
     */
    public Users queryMobileIsExist(String mobile);

    Users createUser(String mobile);
}
