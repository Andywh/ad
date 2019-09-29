package com.joy.ad.service;

import com.joy.ad.exception.AdException;
import com.joy.ad.vo.CreateUserRequest;
import com.joy.ad.vo.CreateUserResponse;

/**
 * Created by SongLiang on 2019-09-27
 */
public interface IUserService {

    /**
     * 创建用户
     * @param request
     * @return
     * @throws AdException
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;

}
