package com.joy.ad.dao;

import com.joy.ad.entity.AdUnit;
import com.joy.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by SongLiang on 2019-09-27
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {

    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);

    List<AdUnit> findAllByUnitStatus(Integer unitStatus);

}
