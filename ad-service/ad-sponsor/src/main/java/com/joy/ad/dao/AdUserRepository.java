package com.joy.ad.dao;

import com.joy.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by SongLiang on 2019-09-27
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    AdUser findByUsername(String username);

}
