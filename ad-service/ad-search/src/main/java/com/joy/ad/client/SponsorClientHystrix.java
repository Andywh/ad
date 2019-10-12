package com.joy.ad.client;

import com.joy.ad.client.vo.AdPlan;
import com.joy.ad.client.vo.AdPlanGetRequest;
import com.joy.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by SongLiang on 2019-10-05
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-ad-sponsor error");
    }

}

