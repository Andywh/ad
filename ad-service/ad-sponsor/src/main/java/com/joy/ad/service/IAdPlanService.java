package com.joy.ad.service;

import com.joy.ad.entity.AdPlan;
import com.joy.ad.exception.AdException;
import com.joy.ad.vo.AdPlanGetRequest;
import com.joy.ad.vo.AdPlanRequest;
import com.joy.ad.vo.AdPlanResponse;
import sun.tools.jconsole.AboutDialog;

import java.util.List;

/**
 * Created by SongLiang on 2019-09-27
 */
public interface IAdPlanService {

    /**
     * 创建推广计划
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 获取推广计划
     * @param request
     * @return
     * @throws AdException
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * 更新推广计划
     * @param request
     * @return
     * @throws AdException
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * 删除推广计划
     * @param request
     * @throws AdException
     */
    void deleteAdPlan(AdPlanRequest request) throws AdException;

}
