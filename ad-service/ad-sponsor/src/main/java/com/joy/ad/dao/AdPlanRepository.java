package com.joy.ad.dao;

import com.joy.ad.entity.AdPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by SongLiang on 2019-09-27
 */

public interface AdPlanRepository extends JpaRepository<AdPlan, Long> {

    AdPlan findByIdAndUserId(Long id, Long userId);

    List<AdPlan> findAllByIdInAndUserId(List<Long> ids, Long userId);

    AdPlan findByUserIdAndPlanName(Long userId, String planName);

    List<AdPlan> findAllByPlanStatus(Integer status);

}
