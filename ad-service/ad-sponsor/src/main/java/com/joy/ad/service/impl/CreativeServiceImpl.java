package com.joy.ad.service.impl;

import com.joy.ad.constant.Constants;
import com.joy.ad.dao.CreativeRepository;
import com.joy.ad.entity.Creative;
import com.joy.ad.exception.AdException;
import com.joy.ad.service.ICreativeService;
import com.joy.ad.vo.CreativeRequest;
import com.joy.ad.vo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SongLiang on 2019-09-29
 */
@Service
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }

    @Override
    public CreativeResponse createCreative(CreativeRequest request) throws AdException {
        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        Creative creative = creativeRepository.save(
                request.convertToEntity()
        );
        return new CreativeResponse(creative.getId(), creative.getName());
    }

}
