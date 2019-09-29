package com.joy.ad.service;

import com.joy.ad.entity.AdUnit;
import com.joy.ad.exception.AdException;
import com.joy.ad.vo.*;

/**
 * Created by SongLiang on 2019-09-27
 */
public interface IAdUnitService {

    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request) throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request) throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request) throws AdException;

}
