package com.joy.ad.service;

import com.joy.ad.exception.AdException;
import com.joy.ad.vo.CreativeRequest;
import com.joy.ad.vo.CreativeResponse;

/**
 * Created by SongLiang on 2019-09-29
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request) throws AdException;

}
