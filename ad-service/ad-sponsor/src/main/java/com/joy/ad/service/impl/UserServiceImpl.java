package com.joy.ad.service.impl;

import com.joy.ad.constant.Constants;
import com.joy.ad.dao.AdUserRepository;
import com.joy.ad.entity.AdUser;
import com.joy.ad.exception.AdException;
import com.joy.ad.service.IUserService;
import com.joy.ad.utils.CommonUtils;
import com.joy.ad.vo.CreateUserRequest;
import com.joy.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by SongLiang on 2019-09-27
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    private final AdUserRepository adUserRepository;

    public UserServiceImpl(AdUserRepository adUserRepository) {
        this.adUserRepository = adUserRepository;
    }

    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser oldUser = adUserRepository.findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser newUser = adUserRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())
        ));
        return new CreateUserResponse(
                newUser.getId(),
                newUser.getUsername(),
                newUser.getToken(),
                newUser.getCreateTime(),
                newUser.getUpdateTime()
        );
    }
}
